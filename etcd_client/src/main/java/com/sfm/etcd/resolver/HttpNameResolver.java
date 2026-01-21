package com.sfm.etcd.resolver;

import com.google.common.base.Strings;
import io.grpc.Attributes;
import io.grpc.EquivalentAddressGroup;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

public class HttpNameResolver extends AbstractNameResolver {
    public static final String SCHEME = "http";

    private final URI address;

    public HttpNameResolver(URI targetUri) {
        super(targetUri);

        this.address = targetUri;
    }

    @Override
    protected List<EquivalentAddressGroup> computeAddressGroups() {
        if (address == null)
            throw new RuntimeException("Unable to resolve endpoint " + getTargetUri());

        return Collections.singletonList(
            new EquivalentAddressGroup(
                new InetSocketAddress(
                    address.getHost(),
                    address.getPort() != -1 ? address.getPort() : ETCD_CLIENT_PORT),
                Strings.isNullOrEmpty(getServiceAuthority())
                    ? Attributes.newBuilder()
                        .set(EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE, address.toString())
                        .build()
                    : Attributes.EMPTY));
    }
}
