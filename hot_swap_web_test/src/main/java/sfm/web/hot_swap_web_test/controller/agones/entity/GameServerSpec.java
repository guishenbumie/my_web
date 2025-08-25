package sfm.web.hot_swap_web_test.controller.agones.entity;

import java.util.Map;

public record GameServerSpec(
        // Container specifies which Pod container is the game server. Only required if there is more than one
        // container defined
        String container,
        // Ports are the array of ports that can be exposed via the game server
        GameServerPort[] ports,
        // Health configures health checking
        Health health,
        // Scheduling strategy. Defaults to "Packed"
        String scheduling,
        // SdkServer specifies parameters for the Agones SDK Server sidecar container
        SdkServer sdkServer,
        // Template describes the Pod that will be created for the GameServer
        //Template corev1.PodTemplateSpec `json:"template"`
        // (Alpha, PlayerTracking feature flag) Players provides the configuration for player tracking features.
        // +optional
        //Players *PlayersSpec `json:"players,omitempty"`
        // (Beta, CountsAndLists feature flag) Counters provides the configuration for tracking of int64 values against a GameServer.
        // Keys must be declared at GameServer creation time.
        // +optional
        Map<String, CounterStatus> counters,
        // (Beta, CountsAndLists feature flag) Lists provides the configuration for tracking of lists of up to 1000 values against a GameServer.
        // Keys must be declared at GameServer creation time.
        // +optional
        Map<String, ListStatus> lists
        // Eviction specifies the eviction tolerance of the GameServer. Defaults to "Never".
        // +optional
        //Eviction *Eviction `json:"eviction,omitempty"`
) {
}
