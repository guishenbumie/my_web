package sfm.web.hot_swap_web_test.controller.agones.entity;

public record NodeAddress(
        // Node address type, one of Hostname, ExternalIP or InternalIP.
        String type,
        // The node address.
        String address
) {
}
