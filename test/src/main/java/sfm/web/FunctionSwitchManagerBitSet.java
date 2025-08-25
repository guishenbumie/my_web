package sfm.web;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class FunctionSwitchManagerBitSet {
    // 用BitSet存储状态（可动态扩展，支持任意数量开关）
    private final BitSet switchStates = new BitSet();

    // 开启指定开关（无上限，只需保证functionType≥1）
    public void enableSwitch(int functionType) {
        if (functionType < 1) {
            throw new IllegalArgumentException("功能类型必须≥1: " + functionType);
        }
        // BitSet的索引从0开始，因此减1
        switchStates.set(functionType - 1);
    }

    // 关闭指定开关
    public void disableSwitch(int functionType) {
        if (functionType < 1) {
            throw new IllegalArgumentException("功能类型必须≥1: " + functionType);
        }
        switchStates.clear(functionType - 1);
    }

    // 检查开关是否开启
    public boolean isSwitchEnabled(int functionType) {
        if (functionType < 1) {
            return false;
        }
        return switchStates.get(functionType - 1);
    }

    // 获取所有开启的开关
    public List<Integer> getEnabledSwitches() {
        List<Integer> enabled = new ArrayList<>();
        // 遍历所有置为true的位
        for (int i = switchStates.nextSetBit(0); i != -1; i = switchStates.nextSetBit(i + 1)) {
            enabled.add(i + 1); // 转回functionType（+1）
        }
        return enabled;
    }

    public static void main(String[] args) {
        FunctionSwitchManagerBitSet manager = new FunctionSwitchManagerBitSet();

        // 示例：开启第30、50、100个开关（超过64也能支持）
        manager.enableSwitch(30);
        manager.enableSwitch(50);
        manager.enableSwitch(100);

        System.out.println("第100个开关是否开启: " + manager.isSwitchEnabled(100)); // true
        System.out.println("所有开启的开关: " + manager.getEnabledSwitches()); // [30, 50, 100]
    }
}
