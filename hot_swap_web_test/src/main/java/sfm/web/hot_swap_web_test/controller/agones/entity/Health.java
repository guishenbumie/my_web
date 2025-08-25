package sfm.web.hot_swap_web_test.controller.agones.entity;

public record Health(
        // Disabled is whether health checking is disabled or not
        boolean disabled,
        // PeriodSeconds is the number of seconds each health ping has to occur in
        Integer periodSeconds,
        // FailureThreshold how many failures in a row constitutes unhealthy
        Integer failureThreshold,
        // InitialDelaySeconds initial delay before checking health
        Integer initialDelaySeconds
) {
}
