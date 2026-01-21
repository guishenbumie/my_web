package com.sfm;

import com.sfm.etcd.ByteSequence;
import com.sfm.etcd.Client;
import com.sfm.etcd.op.Cmp;
import com.sfm.etcd.op.CmpTarget;
import com.sfm.etcd.op.Op;
import com.sfm.etcd.options.DeleteOption;

import java.nio.charset.StandardCharsets;
import java.time.Duration;

public class EtcdClientMain {

    public static void main(String[] args) throws Exception {
        var username = System.getenv("ETCD_USER");
        var password = System.getenv("ETCD_PWD");
        var etcdAddress = System.getenv("ETCD_ADDR");
        var namespace = System.getenv("ETCD_NS");
        Client client = Client.builder()
                .username(username)
                .password(password)
                .endpoints(etcdAddress.split(","))
                .connectTimeout(Duration.ofSeconds(5))
                .namespace(namespace)
                .build();

//        var key = ByteSequence.fromUtf8("key");
//        var response = client.getKVClient().get(key);
//        System.out.println(response);
//        client.getConnectionManager().switchConnection();
//        var response1 = client.getKVClient().get(key);
//        System.out.println(response1);

        var lockVal = ByteSequence.from("1", StandardCharsets.UTF_8);
//        var leaseId = client.getKVClient().getLeaseClient().grant(30).get().getID();//防止锁因异常没释放，最大30s自动删除
//        var putOption = PutOption.builder().withLeaseId(leaseId).build();

        var lockKey = ByteSequence.from("sfmtest", StandardCharsets.UTF_8);
        System.out.println("begin:::\n" + client.getKVClient().get(lockKey));
        client.getKVClient().put(lockKey, lockVal);
        System.out.println("put:::\n" + client.getKVClient().get(lockKey));
        client.getKVClient().txn().If(new Cmp(lockKey, Cmp.Op.NOT_EQUAL, CmpTarget.value(lockVal)))
                .Then(Op.delete(lockKey, DeleteOption.DEFAULT)).commit();
        System.out.println("delete1:::\n" + client.getKVClient().get(lockKey));
        client.getKVClient().txn().If(new Cmp(lockKey, Cmp.Op.EQUAL, CmpTarget.value(lockVal)))
                .Then(Op.delete(lockKey, DeleteOption.DEFAULT)).commit();
        System.out.println("delete2:::\n" + client.getKVClient().get(lockKey));
    }


}