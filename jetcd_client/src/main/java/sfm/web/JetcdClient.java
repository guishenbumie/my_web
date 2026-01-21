package sfm.web;

import io.etcd.jetcd.ByteSequence;
import io.etcd.jetcd.Client;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.stream.IntStream;

public class JetcdClient {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var t = new ArrayList<String>();
        t.add("a");
        t.add("b");
        t.add("c");
        IntStream.range(0, 2).forEach(i -> System.out.println(t.get(i)));
        var url = "http://10.95.129.198:2369,http://10.95.129.198:2379,http://10.95.129.198:2389";
        var ns = "/st/sunfengmao/";
        var name = "root";
        var password = "FVcH8JPHUsk9VmJc";
        var etcdBuilder = Client.builder()
                .connectTimeout(Duration.ofSeconds(5))
                .keepaliveWithoutCalls(false)
                .endpoints(url.split(","))
                .namespace(ByteSequence.from(ns, StandardCharsets.UTF_8));
        etcdBuilder.user(ByteSequence.from(name, StandardCharsets.UTF_8));
        etcdBuilder.password(ByteSequence.from(password, StandardCharsets.UTF_8));
        var client = etcdBuilder.build();
        var resp = client.getKVClient().get(ByteSequence.from("test", StandardCharsets.UTF_8)).get();
        System.out.println(resp);
        var resp1 = client.getKVClient().get(ByteSequence.from("test", StandardCharsets.UTF_8)).get();
        System.out.println(resp1);
    }
}