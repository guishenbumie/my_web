package sfm.web.hot_swap_web_test.controller.agones.entity;

public record LabelSelectorRequirement(
        // key is the label key that the selector applies to.
        String key,
        // operator represents a key's relationship to a set of values.
        // Valid operators are In, NotIn, Exists and DoesNotExist.
        String operator,
        // values is an array of string values. If the operator is In or NotIn,
        // the values array must be non-empty. If the operator is Exists or DoesNotExist,
        // the values array must be empty. This array is replaced during a strategic
        // merge patch.
        // +optional
        // +listType=atomic
        String[] values
) {
}
