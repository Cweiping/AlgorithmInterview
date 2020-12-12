import java.util.*;
import java.math.*;

/**
 * 题目描述
 * 假设你有一个数组，其中第\ i i 个元素是股票在第\ i i 天的价格。
 * 你有一次买入和卖出的机会。（只有买入了股票以后才能卖出）。请你设计一个算法来计算可以获得的最大收益。
 * 示例1
 * 输入
 * [1,4,2]
 * 返回值
 * 3
 * 示例2
 * 输入
 * [2,4,1]
 * 返回值
 * 2
 */
public class Solution {
    /**
     *
     * @param prices int整型一维数组 
     * @return int整型
     */
    public int maxProfit (int[] prices) {
        // write code here
        if (prices.length<2){
            return 0;
        }
        int max = 0;
        int min=prices[0];
        for (int sale=1;sale<prices.length;sale++){
            if (prices[sale]-min>max){
                max = prices[sale]-min;
            }
            min= Math.min(prices[sale],min);
        }
        return max;
    }
}