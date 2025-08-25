package sfm.web;

import java.util.ArrayList;
import java.util.List;

public class FunctionMgr {
    // 用一个整数存储所有开关状态（每一位代表一个开关）
    private int switchStates = 0;

    public int getSwitchStates() {
        return switchStates;
    }

    // 开启指定开关
    public void enableSwitch(int functionType) {
        // 校验类型范围（1-12）
        if (functionType < 1 || functionType > 120) {
            throw new IllegalArgumentException("无效的功能类型: " + functionType);
        }
        // 左移计算位掩码，按位或运算开启开关
        switchStates |= 1 << (functionType - 1);
    }

    // 关闭指定开关
    public void disableSwitch(int functionType) {
        if (functionType < 1 || functionType > 12) {
            throw new IllegalArgumentException("无效的功能类型: " + functionType);
        }
        // 按位与结合取反运算关闭开关
        switchStates &= ~(1 << (functionType - 1));
    }

    // 检查指定开关是否开启
    public boolean isSwitchEnabled(int functionType) {
        if (functionType < 1 || functionType > 12) {
            return false;
        }
        // 按位与运算判断位是否为1
        return (switchStates & (1 << (functionType - 1))) != 0;
    }

    // 获取所有开启的开关
    public List<Integer> getEnabledSwitches() {
        List<Integer> enabled = new ArrayList<>();
        // 遍历12个开关检查状态
        for (int i = 1; i <= 12; i++) {
            if (isSwitchEnabled(i)) {
                enabled.add(i);
            }
        }
        return enabled;
    }
}
