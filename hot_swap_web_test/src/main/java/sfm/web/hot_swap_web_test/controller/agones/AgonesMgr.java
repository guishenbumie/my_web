package sfm.web.hot_swap_web_test.controller.agones;

import sfm.web.hot_swap_web_test.controller.agones.entity.GameServer;
import sfm.web.hot_swap_web_test.controller.agones.entity.GameServerStatus;
import sfm.web.hot_swap_web_test.controller.agones.entity.Metadata;

import java.util.*;

public enum AgonesMgr {
    INS;

    private final Map<String, GameServer> gameServers = new HashMap<>();

    private String genGameServerName() {
        var id = UUID.randomUUID().toString();
        return "gs-" + id;
    }

    private GameServerStatus genGameServerStatus(EGameServerState state) {
        return new GameServerStatus(state.name(), null, null, null, null, null, null);
    }

    private Metadata genMetadata(String name) {
        return new Metadata(name, null, null, null, null, null, null, null, null, null, null, null);
    }

    private GameServer genGameServer(String name, EGameServerState state) {
        var metadata = genMetadata(name);
        var gameServerStatus = genGameServerStatus(state);
        return new GameServer("", "", metadata, null, gameServerStatus);
    }

    public void init(int num) {
        for (int i = 0; i < num; i++) {
            var name = genGameServerName();
            var gameServer = genGameServer(name, EGameServerState.Ready);
            gameServers.put(name, gameServer);
        }
    }

    public void allocate() {
        String name = null;
        for (var gameServer : gameServers.values()) {
            if (Objects.equals(gameServer.status().state(), EGameServerState.Ready.name())) {
                name = gameServer.metadata().name();
                break;
            }
        }
        if (name != null) {
            var gameServer = genGameServer(name, EGameServerState.Allocated);
            gameServers.put(name, gameServer);
        }
    }

    public Map<String, GameServer> ready() {
        String name = null;
        for (var gameServer : gameServers.values()) {
            if (Objects.equals(gameServer.status().state(), EGameServerState.Allocated.name())) {
                name = gameServer.metadata().name();
                break;
            }
        }
        if (name != null) {
            var gameServer = genGameServer(name, EGameServerState.Ready);
            gameServers.put(name, gameServer);
        }
        return gameServers;
    }

    public Map<String, GameServer> getGameServers() {
        return gameServers;
    }

    public Map<String, GameServer> addGameServer(int num) {
        for (int i = 0; i < num; i++) {
            var name = genGameServerName();
            var gameServer = genGameServer(name, EGameServerState.Ready);
            gameServers.put(name, gameServer);
        }
        return gameServers;
    }

    public Map<String, GameServer> downGameServer(int num) {
        for (Iterator<Map.Entry<String, GameServer>> it = gameServers.entrySet().iterator(); it.hasNext(); ) {
            if (num <= 0) {
                break;
            }
            var gs = it.next();
            it.remove();
            num--;
        }
        return gameServers;
    }
}
