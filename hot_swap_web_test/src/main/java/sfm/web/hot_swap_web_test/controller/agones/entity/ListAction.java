package sfm.web.hot_swap_web_test.controller.agones.entity;

public record ListAction(
        // AddValues appends values to a List's Values array. Any duplicate values will be ignored.
        // +optional
        String[] addValues,
        // DeleteValues removes values from a List's Values array. Any nonexistant values will be ignored.
        // +optional
        String[] deleteValues,
        // Capacity updates the maximum capacity of the Counter to this number. Min 0, Max 1000.
        // +optional
        Integer capacity
) {
}
