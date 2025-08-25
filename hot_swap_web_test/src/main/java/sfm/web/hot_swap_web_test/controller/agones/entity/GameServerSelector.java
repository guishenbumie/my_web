package sfm.web.hot_swap_web_test.controller.agones.entity;

import java.util.Map;

public record GameServerSelector(
        // See: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
        Map<String, String> matchLabels,
        LabelSelectorRequirement[] matchExpressions,
        // GameServerState specifies which State is the filter to be used when attempting to retrieve a GameServer
        // via Allocation. Defaults to "Ready". The only other option is "Allocated", which can be used in conjunction with
        // label/annotation/player selectors to retrieve an already Allocated GameServer.
        String gameServerState,
        // [Stage:Alpha]
        // [FeatureFlag:PlayerAllocationFilter]
        // +optional
        // Players provides a filter on minimum and maximum values for player capacity when retrieving a GameServer
        // through Allocation. Defaults to no limits.
        //Players *PlayerSelector `json:"players,omitempty"`
        // [Stage: Beta]
        // [FeatureFlag:CountsAndLists]
        // Counters provides filters on minimum and maximum values
        // for a Counter's count and available capacity when retrieving a GameServer through Allocation.
        // Defaults to no limits.
        // +optional
        Map<String, CounterSelector> counters,
        // [Stage: Beta]
        // [FeatureFlag:CountsAndLists]
        // Lists provides filters on minimum and maximum values
        // for List capacity, and for the existence of a value in a List, when retrieving a GameServer
        // through Allocation. Defaults to no limits.
        // +optional
        Map<String, ListSelector> lists
) {
}
