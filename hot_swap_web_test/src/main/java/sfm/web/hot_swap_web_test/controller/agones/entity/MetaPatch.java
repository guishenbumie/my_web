package sfm.web.hot_swap_web_test.controller.agones.entity;

import java.util.Map;

public record MetaPatch(
        Map<String, String> labels,
        Map<String, String> annotations
) {
}
