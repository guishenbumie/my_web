package sfm.web.hot_swap_web_test.controller.agones.entity;

public record MultiClusterSetting(
        boolean enabled,
        LabelSelector policySelector
) {
}
