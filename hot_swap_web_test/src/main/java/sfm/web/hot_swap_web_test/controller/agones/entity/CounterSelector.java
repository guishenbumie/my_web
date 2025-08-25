package sfm.web.hot_swap_web_test.controller.agones.entity;

public record CounterSelector(
        // MinCount is the minimum current value. Defaults to 0.
        // +optional
        Long minCount,
        // MaxCount is the maximum current value. Defaults to 0, which translates as max(in64).
        // +optional
        Long maxCount,
        // MinAvailable specifies the minimum capacity (current capacity - current count) available on a GameServer. Defaults to 0.
        // +optional
        Long minAvailable,
        // MaxAvailable specifies the maximum capacity (current capacity - current count) available on a GameServer. Defaults to 0, which translates to max(int64).
        // +optional
        Long maxAvailable
) {
}
