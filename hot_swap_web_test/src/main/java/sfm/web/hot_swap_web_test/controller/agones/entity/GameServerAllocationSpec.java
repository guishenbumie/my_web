package sfm.web.hot_swap_web_test.controller.agones.entity;

import java.util.Map;

public record GameServerAllocationSpec(
// MultiClusterPolicySelector if specified, multi-cluster policies are applied.
        // Otherwise, allocation will happen locally.
        MultiClusterSetting multiClusterSetting,

        // Deprecated: use field Selectors instead. If Selectors is set, this field is ignored.
        // Required is the GameServer selector from which to choose GameServers from.
        // Defaults to all GameServers.
        GameServerSelector required,

        // Deprecated: use field Selectors instead. If Selectors is set, this field is ignored.
        // Preferred is an ordered list of preferred GameServer selectors
        // that are optional to be fulfilled, but will be searched before the `required` selector.
        // If the first selector is not matched, the selection attempts the second selector, and so on.
        // If any of the preferred selectors are matched, the required selector is not considered.
        // This is useful for things like smoke testing of new game servers.
        GameServerSelector[] preferred,

        // [Stage: Beta]
        // [FeatureFlag:CountsAndLists]
        // `Priorities` configuration alters the order in which `GameServers` are searched for matches to the configured `selectors`.
        //
        // Priority of sorting is in descending importance. I.e. The position 0 `priority` entry is checked first.
        //
        // For `Packed` strategy sorting, this priority list will be the tie-breaker within the least utilised infrastructure, to ensure optimal
        // infrastructure usage while also allowing some custom prioritisation of `GameServers`.
        //
        // For `Distributed` strategy sorting, the entire selection of `GameServers` will be sorted by this priority list to provide the
        // order that `GameServers` will be allocated by.
        // +optional
        Priority[] priorities,

        // Ordered list of GameServer label selectors.
        // If the first selector is not matched, the selection attempts the second selector, and so on.
        // This is useful for things like smoke testing of new game servers.
        // Note: This field can only be set if neither Required or Preferred is set.
        GameServerSelector[] selectors,

        // Scheduling strategy. Defaults to "Packed".
        String scheduling,

        // MetaPatch is optional custom metadata that is added to the game server at allocation
        // You can use this to tell the server necessary session data
        MetaPatch metaPatch,

        // [Stage: Beta]
        // [FeatureFlag:CountsAndLists]
        // Counter actions to perform during allocation.
        // +optional
        Map<String, CounterAction> counters,
        // [Stage: Beta]
        // [FeatureFlag:CountsAndLists]
        // List actions to perform during allocation.
        // +optional
        Map<String, ListAction> lists
) {
}
