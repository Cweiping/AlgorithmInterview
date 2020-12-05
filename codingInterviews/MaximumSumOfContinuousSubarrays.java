/**
 * 题目描述
 * 输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。要求时间复杂度为 O(n).
 * 示例1
 * 输入
 * [1,-2,3,10,-4,7,2,-5]
 * 返回值
 * 18
 * 说明
 * 输入的数组为{1,-2,3,10,—4,7,2,一5}，和最大的子数组为{3,10,一4,7,2}，因此输出为该子数组的和 18。
 *
 */
public class Solution {
    /**
     * 推导式 dp[i]=dp[i-1] + Max(array[i],0)
     * 在取得 max = Max(dp[n]...dp[1])
     * @param array
     * @return
     */
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length==1){
            return array[0];
        }
        int[] dp = new int[array.length];
        dp[0]=array[0];
        int max=array[0];
        for(int i=1;i<array.length;i++){
            dp[i]=Math.max(array[i]+dp[i-1],array[i]);
            max= Math.max(max,dp[i]);
        }
        return max;
    }
}