package com.sfm.etcd;

import java.net.URI;
import java.time.Duration;
import java.util.*;
import java.util.stream.Stream;

public class ClientBuilder implements Cloneable {
    private Set<URI> endpoints;
    private String username;
    private String password;
    private String authority;
    private Duration connectTimeout;
    private ByteSequence namespace;

    public ClientBuilder() {
    }

    public ClientBuilder username(String username) {
        this.username = username;
        return this;
    }

    public String username() {
        return username;
    }

    public ClientBuilder password(String password) {
        this.password = password;
        return this;
    }

    public String password() {
        return password;
    }

    public ClientBuilder authority(String authority) {
        this.authority = authority;
        return this;
    }

    public String authority() {
        return authority;
    }

    public ClientBuilder endpoints(String... endpoints) {
        return endpoints(
                Stream.of(endpoints).map(URI::create).toArray(URI[]::new));
    }

    public ClientBuilder endpoints(URI... endpoints) {
        this.endpoints = new HashSet<>(Arrays.asList(endpoints));
        return this;
    }

    public Set<URI> endpoints() {
        return endpoints;
    }

    public ClientBuilder connectTimeout(Duration connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }

    public Duration connectTimeout() {
        return connectTimeout;
    }

    public ClientBuilder namespace(String namespace) {
        this.namespace = ByteSequence.fromUtf8(namespace);;
        return this;
    }

    public ByteSequence namespace() {
        return namespace;
    }

    public Client build() throws Exception {
        return new Client(this);
    }

    public ClientBuilder copy() {
        try {
            return (ClientBuilder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
