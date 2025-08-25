package sfm.web.hot_swap_web_test.controller.agones.entity;

public record GameServerAllocationResp(
        String apiVersion,
        String kind,
        Metadata metadata,
        GameServerAllocationSpec spec,
        GameServerAllocationStatus status
) {
}
