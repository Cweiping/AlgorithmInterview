import java.util.*;

/**
 * 题目描述
 * 给定一个无序数组arr，找到数组中未出现的最小正整数
 * 例如arr = [-1, 2, 3, 4]。返回1
 * arr = [1, 2, 3, 4]。返回5
 * [要求]
 * 时间复杂度为O(n)O(n)，空间复杂度为O(1)O(1)
 *
 * 示例1
 * 输入
 * [-1,2,3,4]
 * 返回值
 * 1
 */
public class Solution {
    /**
     * return the min number
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int minNumberdisappered (int[] arr) {
        // write code here
        for (int i=1;i<Integer.MAX_VALUE;i++){
            int j=0;
            for (;j<arr.length;j++){
                if (arr[j]==i){ break;}
            }
            if (j==arr.length){
                return i;
            }
        }
        return -1;
    }
}