import java.util.*;
import java.math.*;

/**
 * 题目描述
 * 给定无序数组arr，返回其中最长的连续序列的长度(要求值连续，位置可以不连续,例如 3,4,5,6为连续的自然数）
 * 示例1
 * 输入
 * [100,4,200,1,3,2]
 * 返回值
 * 4
 * 示例2
 * 输入
 * [1,1,1]
 * 返回值
 * 1
 */
public class Solution {
    /**
     * max increasing subsequence
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int MLS (int[] arr) {
        Arrays.sort(arr);
        int sum = 1,max=0;
        for (int i=1;i<arr.length;i++){
            if (arr[i]==arr[i-1]+1){
                sum+=1;
            }else if (arr[i]!=arr[i-1]+1&&arr[i]!=arr[i-1]){
                sum=1;
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}