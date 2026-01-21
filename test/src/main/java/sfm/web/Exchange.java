package sfm.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Exchange {

    private static final int Primary_VALUE = 1;
    private static final int Secondary_VALUE = 2;

    static class Weapon {
        int slot;
        int cfgId;

        public Weapon(int slot, int cfgId) {
            this.slot = slot;
            this.cfgId = cfgId;
        }

        public String toString() {
            return "slot=" + slot + ", cfgId=" + cfgId;
        }
    }

    private static void exchangeWeapon(Weapon planWeapon1, Weapon planWeapon2, Weapon weapon1, Weapon weapon2) {
        if (planWeapon1 != null && weapon2 != null && planWeapon1.cfgId == weapon2.cfgId) {
            weapon2.slot= Primary_VALUE;
//            planEquips.remove(Primary_VALUE);
            if (weapon1 != null) {
                weapon1.slot = Secondary_VALUE;
                if (planWeapon2 != null && planWeapon2.cfgId == weapon1.cfgId) {
//                    planEquips.remove(WeaponSlot.Secondary_VALUE);
                }
            }
        } else if (planWeapon2 != null && weapon1 != null && planWeapon2.cfgId== weapon1.cfgId){
            weapon1.slot = Secondary_VALUE;
//            planEquips.remove(WeaponSlot.Secondary_VALUE);
            if (weapon2 != null) {
                weapon2.slot = Primary_VALUE;
            }
        }
    }

    public static void main(String[] args) {
        Weapon planWeapon1 = new Weapon(1, 101);
        Weapon planWeapon2 = new Weapon(2, 102);
//        Weapon planWeapon2 = null;

//        Weapon weapon1 = new Weapon(1, 102);
        Weapon weapon1 = null;
        Weapon weapon2 = new Weapon(2, 101);

        exchangeWeapon(planWeapon1, planWeapon2, weapon1, weapon2);

        System.out.println("plan::::::::::::::");
        System.out.println(planWeapon1);
        System.out.println(planWeapon2);
        System.out.println("weapon::::::::::::::");
        System.out.println(weapon1);
        System.out.println(weapon2);

//        System.out.println("Hello World");
//
//        var plans = new HashMap<Integer, Integer>();
//        plans.put(0, 10);
//        plans.put(1, 11);
//        plans.put(2, 12);
//        plans.put(3, 13);
//
//        var equips = new HashMap<Integer, Integer>();
//        equips.put(0, 13);
//        equips.put(1, 10);
//        equips.put(2, 0);
//        equips.put(3, 12);
//
//        System.out.println(plans.values());
//        System.out.println();
//        var l = new ArrayList<>(equips.values());
//        System.out.println(l);
//
//        var equipGems = new ArrayList<>(equips.values());
//        for (int i = 0; i < plans.size(); i++) {
//            var planGemCfgId = plans.get(i);
//            if (equipGems.contains(planGemCfgId)) {
//                equips.put(i, planGemCfgId);
//                equipGems.remove(planGemCfgId);
//            } else {
//                equips.put(i, 0);
//            }
//        }
//        for (int i = 0; i < equips.size(); i++) {
//            if (equipGems.isEmpty())
//                break;
//            var equipGemCfgId = equips.get(i);
//            if (equipGemCfgId == 0) {
//                equips.put(i, equipGems.removeFirst());
//            }
//        }
//        System.out.println(equips);
//        System.out.println(equipGems);
//        System.out.println();
//        System.out.println();
//
//        for (var entry : plans.entrySet()) {
//            var gemSlot = entry.getKey();
//            var gemCfgId = entry.getValue();
//
//            if (!equips.containsValue(gemCfgId))
//                continue;
//
//            var gem1 = equips.entrySet().stream().filter(e -> Objects.equals(e.getValue(), gemCfgId)).findFirst().orElse(null);
//            if (gem1 == null)
//                continue;
//            var gem2 = equips.entrySet().stream().filter(e -> !Objects.equals(e.getValue(), gemCfgId)).findFirst().orElse(null);
//            if (gem2 == null)
//                continue;
//
//            var gemSlot1 = gem1.getKey();
//            var gemCfdId2 = gem2.getValue();
//            l.set(gemSlot, gemCfgId);
//            l.set(gemSlot1, gemCfdId2);
//        }
//
//        System.out.println(l);
//
//        var ll = new ArrayList<>();
//        ll.add(2);
//        ll.add(1);
//        ll.add(3);
//        ll.add(2);
//        System.out.println(ll);
////        ll.remove(Integer.valueOf(2));
//        ll.remove(2);
//        System.out.println(ll);
    }
}
