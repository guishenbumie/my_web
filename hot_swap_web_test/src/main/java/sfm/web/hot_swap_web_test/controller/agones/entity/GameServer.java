package sfm.web.hot_swap_web_test.controller.agones.entity;

public record GameServer(
        String apiVersion,
        String kind,
        Metadata metadata,
        GameServerSpec spec,
        GameServerStatus status
) {
}
