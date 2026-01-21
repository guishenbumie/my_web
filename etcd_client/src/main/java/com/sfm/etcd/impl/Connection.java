package com.sfm.etcd.impl;

import io.grpc.ManagedChannel;

import java.net.URI;

public record Connection(URI uri, ManagedChannel channel, AuthCredential credential) {
}
