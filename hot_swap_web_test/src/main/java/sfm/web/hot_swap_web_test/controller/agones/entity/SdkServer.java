package sfm.web.hot_swap_web_test.controller.agones.entity;

public record SdkServer(
        // LogLevel for SDK server (sidecar) logs. Defaults to "Info"
        String logLevel,
        // GRPCPort is the port on which the SDK Server binds the gRPC server to accept incoming connections
        Integer grpcPort,
        // HTTPPort is the port on which the SDK Server binds the HTTP gRPC gateway server to accept incoming connections
        Integer httpPort
) {
}
