import java.util.*;
/**
 * 题目描述
 * 给定一个数组arr，返回子数组的最大累加和
 * 例如，arr = [1, -2, 3, 5, -2, 6, -1]，所有子数组中，[3, 5, -2, 6]可以累加出最大的和12，所以返回12.
 * [要求]
 * 时间复杂度为O(n)O(n)，空间复杂度为O(1)O(1)
 *
 * 示例1
 * 输入
 * [1, -2, 3, 5, -2, 6, -1]
 * 返回值
 * 12
 */
import java.math.*;
public class Solution {
    /**
     * max sum of the subarray
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxsumofSubarray (int[] arr) {
        if (arr.length==0){
            return 0;
        }if (arr.length==1){
            return arr[0];
        }
        // write code here
        int[] dp = new int[arr.length];
        dp[0]=arr[0];
        for (int i=1;i<arr.length;i++){
            dp[i] = Math.max(dp[i-1]+arr[i],dp[i-1]);
        }
        return dp[arr.length-1];
    }
}