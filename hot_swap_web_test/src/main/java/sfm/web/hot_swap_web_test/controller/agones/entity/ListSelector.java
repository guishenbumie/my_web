package sfm.web.hot_swap_web_test.controller.agones.entity;

public record ListSelector(
        // ContainsValue says to only match GameServers who has this value in the list. Defaults to "", which is all.
        // +optional
        String containsValue,
        // MinAvailable specifies the minimum capacity (current capacity - current count) available on a GameServer. Defaults to 0.
        // +optional
        Long minAvailable,
        // MaxAvailable specifies the maximum capacity (current capacity - current count) available on a GameServer. Defaults to 0, which is translated as max(int64).
        // +optional
        Long maxAvailable
) {
}
