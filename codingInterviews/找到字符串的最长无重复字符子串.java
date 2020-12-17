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
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxLength(int[] arr) {
        int left = 0, right = 1, result = 1;
        // 记录元素下标，并以此去重
        HashMap<Integer, Integer> map = new HashMap<>();
        while (right < arr.length) {
            if (map.containsKey(arr[right])) {
                // 获取最大的值为左边界，因为值相等，只有最大的left才符合要求
                left = Math.max(map.get(arr[right]) + 1, left);
            }
            map.put(arr[right], right);
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;
    }
}