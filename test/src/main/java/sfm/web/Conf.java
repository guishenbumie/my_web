package sfm.web;

import java.util.ArrayList;

public class Conf {
    public static void main(String[] args) {
        var cfgs = new ArrayList<Cfg>();
        cfgs.add(new Cfg(0, 0, 1));
        cfgs.add(new Cfg(1, 2, 3));
        cfgs.add(new Cfg(2, 4, 0));
        System.out.println(cfgs.stream().mapToInt(c->c.minTriggerTimes).average());
        var games = 0;
//        var cfg1 = cfgs.stream().filter(c -> games >= c.minTriggerTimes &&
//                        ((c.maxTriggerTimes == 0) || (c.maxTriggerTimes > 0 && games <= c.maxTriggerTimes)))
//                .findFirst().orElse(null);
//        var cfg1 = cfgs.stream().filter(c -> {
//            if (c.maxTriggerTimes == 0) {
//                return games >= c.minTriggerTimes;
//            } else {//>0
//                return games >= c.minTriggerTimes && games <= c.maxTriggerTimes;
//            }
//        }).findFirst().orElse(null);
        var cfg = cfgs.stream().filter(c -> isMatch(games, c.minTriggerTimes, c.maxTriggerTimes)).findFirst().orElse(null);
//        var cfg = cfgs.stream().filter(c -> {
//            if (c.maxTriggerTimes == 0) {
//                if (c.minTriggerTimes == 0) {
//                    return games == 0;
//                } else {
//                    return games >= c.minTriggerTimes;
//                }
//            } else {
//                return games >= c.minTriggerTimes && games <= c.maxTriggerTimes;
//            }
//        }).findFirst().orElse(null);
        if (cfg != null) {
            System.out.println(cfg.id);
        } else {
            System.out.println("null");
        }
    }

    public static boolean isMatch(int count, int min, int max) {
        if (max == 0) {//max=0
            if (min == 0) {//min=0，[0,0]，count=0时匹配成功
                return count == 0;
            } else {//min>0，[min, 0]，只要>=min就算匹配成功，策划配置最后一个无穷大的时候算这种
                return count >= min;
            }
        } else {//max>0时，就是正常的配置情况，在[min,max]闭区间
            return count >= min && count <= max;
        }
    }

    static class Cfg {
        public final int id; // 表格ID
        public final int minTriggerTimes; // 触发次数下限
        public final int maxTriggerTimes;
        public Cfg(int id, int minTriggerTimes, int maxTriggerTimes) {
            this.id = id;
            this.minTriggerTimes = minTriggerTimes;
            this.maxTriggerTimes = maxTriggerTimes;
        }
    }
}
