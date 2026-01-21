package com.sfm.etcd.resolver;

import com.google.common.base.Splitter;
import io.grpc.EquivalentAddressGroup;

import javax.naming.NamingEnumeration;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

@SuppressWarnings("JdkObsolete")
public class DnsSrvNameResolver extends AbstractNameResolver {
    public static final String SCHEME = "dns+srv";

    private static final String[] ATTRIBUTE_IDS;
    private static final Hashtable<String, String> ENV;

    static {
        ATTRIBUTE_IDS = new String[] { "SRV" };

        ENV = new Hashtable<>();
        ENV.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
        ENV.put("java.naming.provider.url", "dns:");
    }

    public DnsSrvNameResolver(URI targetUri) {
        super(targetUri);
    }

    @Override
    protected List<EquivalentAddressGroup> computeAddressGroups() {
        List<EquivalentAddressGroup> groups = new ArrayList<>();

        for (SocketAddress address : resolveAddresses()) {
            //
            // if the authority is not explicit set on the builder
            // then it will be computed from the URI
            //
            groups.add(new EquivalentAddressGroup(
                address,
                io.grpc.Attributes.EMPTY));
        }

        return groups;
    }

    @SuppressWarnings("BanJNDI")
    private List<SocketAddress> resolveAddresses() {
        List<SocketAddress> addresses = new ArrayList<>();

        try {
            String address = getTargetUri().getPath();
            if (address.startsWith("/")) {
                address = address.substring(1);
            }

            DirContext ctx = new InitialDirContext(ENV);
            Attributes attributes = ctx.getAttributes(address, ATTRIBUTE_IDS);
            NamingEnumeration<?> resolved = attributes.get("srv").getAll();

            while (resolved.hasMore()) {
                String record = (String) resolved.next();
                List<String> split = Splitter.on(' ').splitToList(record);

                if (split.size() >= 4) {
                    String host = split.get(3).trim();
                    String port = split.get(2).trim();

                    addresses.add(new InetSocketAddress(host, Integer.parseInt(port)));
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return addresses;
    }
}
