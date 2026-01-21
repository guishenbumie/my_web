package com.sfm.etcd.resolver;

import com.google.auto.service.AutoService;
import io.grpc.NameResolver;
import io.grpc.NameResolverProvider;

import java.net.URI;

@AutoService(NameResolverProvider.class)
public class IPResolverProvider extends AbstractResolverProvider {
    public IPResolverProvider() {
        super(IPNameResolver.SCHEME, 5);
    }

    @Override
    protected NameResolver createResolver(URI targetUri, NameResolver.Args args) {
        return new IPNameResolver(targetUri);
    }
}
