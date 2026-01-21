package com.sfm.etcd.resolver;

import com.google.auto.service.AutoService;
import io.grpc.NameResolver;
import io.grpc.NameResolverProvider;

import java.net.URI;

@AutoService(NameResolverProvider.class)
public class DnsSrvResolverProvider extends AbstractResolverProvider {
    public DnsSrvResolverProvider() {
        super(DnsSrvNameResolver.SCHEME, 5);
    }

    @Override
    protected NameResolver createResolver(URI targetUri, NameResolver.Args args) {
        return new DnsSrvNameResolver(targetUri);
    }
}
