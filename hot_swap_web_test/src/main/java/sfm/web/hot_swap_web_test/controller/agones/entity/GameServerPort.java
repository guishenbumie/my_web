package sfm.web.hot_swap_web_test.controller.agones.entity;

public record GameServerPort(
        // Name is the descriptive name of the port
        String name,
        // (Alpha, PortRanges feature flag) Range is the port range name from which to select a port when using a
        // 'Dynamic' or 'Passthrough' port policy.
        // +optional
        String range,
        // PortPolicy defines the policy for how the HostPort is populated.
        // Dynamic port will allocate a HostPort within the selected MIN_PORT and MAX_PORT range passed to the controller
        // at installation time.
        // When `Static` portPolicy is specified, `HostPort` is required, to specify the port that game clients will
        // connect to
        // `Passthrough` dynamically sets the `containerPort` to the same value as the dynamically selected hostPort.
        // `None` portPolicy ignores `HostPort` and the `containerPort` (optional) is used to set the port on the GameServer instance.
        String portPolicy,
        // Container is the name of the container on which to open the port. Defaults to the game server container.
        // +optional
        String container,
        // ContainerPort is the port that is being opened on the specified container's process
        Integer containerPort,
        // HostPort the port exposed on the host for clients to connect to
        Integer hostPort,
        // Protocol is the network protocol being used. Defaults to UDP. TCP and TCPUDP are other options.
        String protocol
) {
}
