package sfm.web.hot_swap_web_test.controller.agones.entity;

import java.util.Map;

public record GameServerAllocationStatus(
        // GameServerState is the current state of an GameServerAllocation, e.g. Allocated, or UnAllocated
        String state,
        String gameServerName,
        GameServerStatusPort[] ports,
        String address,
        NodeAddress[] addresses,
        String nodeName,
        // If the allocation is from a remote cluster, Source is the endpoint of the remote agones-allocator.
        // Otherwise, Source is "local"
        String source,
        GameServerMetadata metadata,
        Map<String, CounterStatus> counters,
        Map<String, ListStatus> lists
) {
}
