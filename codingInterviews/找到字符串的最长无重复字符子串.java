import java.util.*;
import java.math.*;

/**
 * 题目描述
 * 给定一个数组arr，返回arr的最长无的重复子串的长度(无重复指的是所有数字都不相同)。
 * 示例1
 * 输入
 * [2,3,4,5]
 * 返回值
 * 4
 * 示例2
 * 输入
 * [2,2,3,4,3]
 * 返回值
 * 3
 */
public class Solution {
    /**
     *
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxLength (int[] arr) {
        int left =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int result = 1;
        int right=1;
        for(;right<arr.length;right++){
            if (map.containsKey(arr[right])){
                left=Math.max(map.get(arr[right])+1,left);
            }
            map.put(arr[right],right);
            result= Math.max(result,right-left+1);
        }
        return result;
    }
}