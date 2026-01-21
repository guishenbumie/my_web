package com.sfm.etcd.resolver;

import com.google.common.base.Strings;
import com.google.common.net.HostAndPort;
import io.grpc.Attributes;
import io.grpc.EquivalentAddressGroup;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IPNameResolver extends AbstractNameResolver {
    public static final String SCHEME = "ip";

    private final List<HostAndPort> addresses;

    public IPNameResolver(URI targetUri) {
        super(targetUri);

        this.addresses = Stream.of(targetUri.getPath().split(","))
            .map(address -> address.startsWith("/") ? address.substring(1) : address)
            .map(HostAndPort::fromString)
            .collect(Collectors.toList());
    }

    @Override
    protected List<EquivalentAddressGroup> computeAddressGroups() {
        if (addresses.isEmpty())
            throw new RuntimeException("Unable to resolve endpoint " + getTargetUri());

        return addresses.stream()
            .map(address -> new EquivalentAddressGroup(
                new InetSocketAddress(
                    address.getHost(),
                    address.getPortOrDefault(ETCD_CLIENT_PORT)),
                Strings.isNullOrEmpty(getServiceAuthority())
                    ? Attributes.newBuilder()
                        .set(EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE, address.toString())
                        .build()
                    : Attributes.EMPTY))
            .collect(Collectors.toList());
    }
}
