package sfm.web.hot_swap_web_test.controller.agones.entity;

import java.util.Map;

public record GameServerStatus(
        // GameServerState is the current state of a GameServer, e.g. Creating, Starting, Ready, etc
        String state,
        GameServerStatusPort[] ports,
        String address,
        // Addresses is the array of addresses at which the GameServer can be reached; copy of Node.Status.addresses.
        // +optional
        NodeAddress[] addresses,
        String nodeName,
        //ReservedUntil *metav1.Time         `json:"reservedUntil"`
        // [Stage:Alpha]
        // [FeatureFlag:PlayerTracking]
        // +optional
        //Players *PlayerStatus `json:"players"`
        // (Beta, CountsAndLists feature flag) Counters and Lists provides the configuration for generic tracking features.
        // +optional
        Map<String, CounterStatus> counters,
        // +optional
        Map<String, ListStatus> lists
        // Eviction specifies the eviction tolerance of the GameServer.
        // +optional
        //Eviction *Eviction `json:"eviction,omitempty"`
        // immutableReplicas is present in gameservers.agones.dev but omitted here (it's always 1).
) {
}
