import java.util.*;

/**
 * 题目描述
 * 给定一个整形数组arr，已知其中所有的值都是非负的，将这个数组看作一个容器，请返回容器能装多少水。
 * 具体请参考样例解释
 * 示例1
 * 输入
 * [3,1,2,5,2,4]
 * 返回值
 * 5
 * 说明
 * <p>
 * 示例2
 * 输入
 * [4,5,1,3,2]
 * 返回值
 * 2
 */
public class Solution {
    public long maxWater(int[] arr) {
        if (arr.length <= 2) return 0;
        //  双指针遍历
        int left = 0, right = arr.length - 1;
        long res = 0;
        // 木桶原理不多解释，min 为两侧较小值
        int min = Math.min(arr[left], arr[right]);
        while (left < right) {
            if (arr[left] < arr[right]) left++;
            else right--;
            //   根据木桶原理取得 left 和 right 内靠近 min 的值
            int tmp = Math.min(arr[left], arr[right]);
            //   tmp 大于 min,则表示此处无法盛水，反之可以盛 min-tmp 水
            if (min > tmp) res += min - tmp;
            else min = tmp;
        }
    }
}