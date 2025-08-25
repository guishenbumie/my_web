package sfm.web.hot_swap_web_test.controller.agones.entity;

public record GameServerAllocationReq(
        String apiVersion,
        String kind,
        Metadata metadata,
        GameServerAllocationSpec spec
) {
}
