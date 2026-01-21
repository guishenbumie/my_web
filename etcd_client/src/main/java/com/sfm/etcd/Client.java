package com.sfm.etcd;

import com.sfm.etcd.impl.ClientConnectionManager;
import com.sfm.etcd.impl.ClusterClient;
import com.sfm.etcd.impl.KVClient;

public class Client {
    private final ClientConnectionManager connectionManager;
    private final KVClient kvClient;
    private final ClusterClient clusterClient;

    public Client(ClientBuilder builder) throws Exception {
        connectionManager = new ClientConnectionManager(builder.copy());
        clusterClient = new ClusterClient(connectionManager);
        connectionManager.mergeClusterEndpoints(clusterClient.discoverClusterMembers());
        kvClient = new KVClient(connectionManager);
    }

    public KVClient getKVClient() {
        return kvClient;
    }

    public ClusterClient getClusterClient() {
        return clusterClient;
    }

//    // 关闭客户端
//    public void shutdown() throws InterruptedException {
//        ManagedChannel channel = currentChannel.get();
//        if (channel != null) {
//            channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
//        }
//    }


    public ClientConnectionManager getConnectionManager() {
        return connectionManager;
    }

    public static ClientBuilder builder() {
        return new ClientBuilder();
    }
}
