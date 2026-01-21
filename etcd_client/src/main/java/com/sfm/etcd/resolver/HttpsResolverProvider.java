package com.sfm.etcd.resolver;

import com.google.auto.service.AutoService;
import io.grpc.NameResolver;
import io.grpc.NameResolverProvider;

import java.net.URI;

@AutoService(NameResolverProvider.class)
public class HttpsResolverProvider extends AbstractResolverProvider {
    public HttpsResolverProvider() {
        super(HttpsNameResolver.SCHEME, 5);
    }

    @Override
    protected NameResolver createResolver(URI targetUri, NameResolver.Args args) {
        return new HttpsNameResolver(targetUri);
    }
}
