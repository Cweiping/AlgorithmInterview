import java.util.*;
import java.math.*;

/**
 * 题目描述
 * 给定两个有序数组arr1和arr2，已知两个数组的长度都为N，求两个数组中所有数的上中位数。
 * 上中位数：假设递增序列长度为n，若n为奇数，则上中位数为第n/2+1个数；否则为第n个数
 * [要求]
 * 时间复杂度为O(logN)O(logN)，额外空间复杂度为O(1)O(1)
 * 示例1
 * 输入
 * [1,2,3,4],[3,4,5,6]
 * 返回值
 * 3
 * 说明
 * 总共有8个数，上中位数是第4小的数，所以返回3。
 * 示例2
 * 输入
 * [0,1,2],[3,4,5]
 * 返回值
 * 2
 * 说明
 * 总共有6个数，那么上中位数是第3小的数，所以返回2
 */
public class Solution {
    /**
     * find median in two sorted array
     * @param arr1 int整型一维数组 the array1
     * @param arr2 int整型一维数组 the array2
     * @return int整型
     */
    public int findMedianinTwoSortedAray (int[] arr1, int[] arr2) {
        // write code here
        int idx1=0,idx2=0,result =0;
        while(idx1+idx2<arr1.length){
            result = arr1[idx1]>arr2[idx2]?arr2[idx2++]:arr1[idx1++];
        }
        return result;
    }
}