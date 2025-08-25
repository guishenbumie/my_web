package sfm.web.hot_swap_web_test.controller.agones.entity;

import java.util.Map;

public record LabelSelector(
        // matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels
        // map is equivalent to an element of matchExpressions, whose key field is "key", the
        // operator is "In", and the values array contains only "value". The requirements are ANDed.
        // +optional
        Map<String, String> matchLabels,
        // matchExpressions is a list of label selector requirements. The requirements are ANDed.
        // +optional
        // +listType=atomic
        LabelSelectorRequirement[] matchExpressions
) {
}
