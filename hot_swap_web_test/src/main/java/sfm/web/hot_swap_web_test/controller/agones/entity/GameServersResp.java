package sfm.web.hot_swap_web_test.controller.agones.entity;

public record GameServersResp(
        String apiVersion,
        String kind,
        Metadata metadata,
        GameServer[] items
) {
}
