package sfm.web;

import java.util.Arrays;

public class Gupiao {

    public static void main(String[] args) {
        var str = "21，20，18，16，17，19，17，19，20，18，15，18";
        var prices = Arrays.stream(str.split("，")).mapToInt(Integer::parseInt).toArray();
        var calcRes = calcStock(prices);
        if (calcRes == null) {
            System.out.println("params failed");
        } else {
            if (calcRes.getPrice == 0) {
                System.out.println("can not to exchange！");
            } else {
                System.out.println("day " + calcRes.buyDay + " buy and day " + calcRes.sellDay + " sell, can get max money");
            }
        }
    }

    public record Resp(int buyDay, int sellDay, int getPrice) {
    }

    public static Resp calcStock(int[] prices) {
        //参数无效
        if (prices == null || prices.length <= 1) {
            return null;
        }

        var maxGet = 0;
        var minBuyIdx = 0;
        var butIdx = 0;
        var sellIdx = 1;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[minBuyIdx]) {//当前价格比最小买入价更低，更新买点
                minBuyIdx = i;
            } else {//当前价格不小于最小买入价，说明买点还是之前的，计算当前收益
                var get = prices[i] - prices[minBuyIdx];
                if (get > maxGet) {//收益更多，更新收益和买卖点
                    maxGet = get;
                    sellIdx = i;
                    butIdx = minBuyIdx;
                }
            }
        }
        if (maxGet == 0) {
            return new Resp(0, 0, 0);
        }
        return new Resp(butIdx + 1, sellIdx + 1, maxGet);
    }

}
