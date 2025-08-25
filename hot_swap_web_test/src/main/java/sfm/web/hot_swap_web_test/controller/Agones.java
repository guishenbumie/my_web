package sfm.web.hot_swap_web_test.controller;

import com.alibaba.fastjson2.JSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sfm.web.hot_swap_web_test.controller.agones.AgonesMgr;
import sfm.web.hot_swap_web_test.controller.agones.entity.GameServer;
import sfm.web.hot_swap_web_test.controller.agones.entity.GameServerAllocationResp;
import sfm.web.hot_swap_web_test.controller.agones.entity.GameServersResp;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/apis")
public class Agones {
    @GetMapping("/agones.dev/v1/namespaces/default/gameservers")
    public GameServersResp gameServers() {
        var gameServers = AgonesMgr.INS.getGameServers();
        var items = gameServers.values().toArray(new GameServer[0]);
        return new GameServersResp("agones.dev/v1", "GameServers", null, items);
//        var resp = new GameServersResp("agones.dev/v1", "GameServers", null, items);
//        return JSON.toJSONString(resp);
    }

    @RequestMapping("/allocation.agones.dev/v1/namespaces/default/gameserverallocations")
    public GameServerAllocationResp gameServerAllocations() {
        AgonesMgr.INS.allocate();
        return new GameServerAllocationResp("allocation.agones.dev/v1", "GameServerAllocation", null, null, null);
    }

    @RequestMapping("/test/ready")
    public GameServersResp ready() {
        var gameServers = AgonesMgr.INS.ready();
        var items = gameServers.values().toArray(new GameServer[0]);
        return new GameServersResp("test/ready", "GameServers", null, items);
    }

    @RequestMapping("/test/addgameserver")
    public GameServersResp addGameServer(@RequestParam("num") Integer num) {
        var gameServers = AgonesMgr.INS.addGameServer(num);
        var items = gameServers.values().toArray(new GameServer[0]);
        return new GameServersResp("test/addgameserver", "GameServers", null, items);
    }

    @RequestMapping("/test/downgameserver")
    public GameServersResp downGameServer(@RequestParam("num") Integer num) {
        var gameServers = AgonesMgr.INS.downGameServer(num);
        var items = gameServers.values().toArray(new GameServer[0]);
        return new GameServersResp("test/downGameServer", "GameServers", null, items);
    }

    @GetMapping("/test/overview")
    public Map<String, Integer> overview() {
        var gameServers = AgonesMgr.INS.getGameServers();
        var resp = new HashMap<String, Integer>();
        for (var gameServer : gameServers.values()) {
            var count = resp.get(gameServer.status().state());
            if (count == null) {
                count = 0;
            }
            count += 1;
            resp.put(gameServer.status().state(), count);
        }
        return resp;
    }
}
