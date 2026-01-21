package com.sfm.etcd.resolver;

import com.google.auto.service.AutoService;
import io.grpc.NameResolver;
import io.grpc.NameResolverProvider;

import java.net.URI;

@AutoService(NameResolverProvider.class)
public class HttpResolverProvider extends AbstractResolverProvider {
    public HttpResolverProvider() {
        super(HttpNameResolver.SCHEME, 5);
    }

    @Override
    protected NameResolver createResolver(URI targetUri, NameResolver.Args args) {
        return new HttpNameResolver(targetUri);
    }
}
