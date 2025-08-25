package sfm.web.hot_swap_web_test.controller.agones.entity;

public record Priority(
        // Type: Sort by a "Counter" or a "List".
        String type,
        // Key: The name of the Counter or List. If not found on the GameServer, has no impact.
        String key,
        // Order: Sort by "Ascending" or "Descending". "Descending" a bigger available capacity is preferred.
        // "Ascending" would be smaller available capacity is preferred.
        // The default sort order is "Ascending"
        String order
) {
}
