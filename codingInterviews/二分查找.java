import java.util.*;

/**
 * 题目描述
 * 请实现有重复数字的有序数组的二分查找。
 * 输出在数组中第一个大于等于查找值的位置，如果数组中不存在这样的数，则输出数组长度加一。
 * 示例1
 * 输入
 * 5,4,[1,2,4,4,5]
 * 返回值
 * 3
 * 说明
 * 输出位置从1开始计算
 */
public class Solution {
    /**
     * 二分查找
     * @param n int整型 数组长度
     * @param v int整型 查找值
     * @param a int整型一维数组 有序数组
     * @return int整型
     */
    public int upper_bound_ (int n, int v, int[] a) {
        // write code here
        for(int i=0;i<a.length;i++){
            if(a[i]>=v){
                return i+1;
            }
        }
        return a.length+1;
    }
}