package com.sfm.etcd.impl;

import com.sfm.etcd.api.ClusterGrpc;
import com.sfm.etcd.api.Member;
import com.sfm.etcd.api.MemberListRequest;
import com.sfm.etcd.api.MemberListResponse;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class ClusterClient extends GrpcClient {

    private final AtomicReference<ClusterGrpc.ClusterBlockingStub> blockingStub = new AtomicReference<>();

    public ClusterClient(ClientConnectionManager manager) {
        super(manager);
        updateBlockingStub();
        manager.addChangeConnListener(this::updateBlockingStub);
    }

    @Override
    protected void updateBlockingStub() {
        var conn = manager.connection();
        var stub = ClusterGrpc.newBlockingStub(conn.channel()).withCallCredentials(conn.credential()).withDeadlineAfter(manager.getBuilder().connectTimeout());
        blockingStub.set(stub);
    }

    // 发现集群所有成员（更新 clusterEndpoints）
    public Set<URI> discoverClusterMembers() {
        MemberListResponse response = blockingStub.get().memberList(MemberListRequest.newBuilder().build());
        var clusterEndpoints = new HashSet<URI>();
        // 解析成员端点（etcd 成员地址格式：http://IP:Port）
        for (Member member : response.getMembersList()) {
            for (String peerUrl : member.getPeerURLsList()) {
                var endpoint = URI.create(peerUrl);
                clusterEndpoints.add(endpoint);
            }
        }
        return clusterEndpoints;
    }
}
