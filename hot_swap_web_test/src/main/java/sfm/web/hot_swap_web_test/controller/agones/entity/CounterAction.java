package sfm.web.hot_swap_web_test.controller.agones.entity;

public record CounterAction(
        // Action must to either "Increment" or "Decrement" the Counter's Count. Must also define the Amount.
        // +optional
        String action,
        // Amount is the amount to increment or decrement the Count. Must be a positive integer.
        // +optional
        Integer amount,
        // Capacity is the amount to update the maximum capacity of the Counter to this number. Min 0, Max int64.
        // +optional
        Integer capacity
) {
}
