import java.util.*;

/**
 * 题目描述
 * 给定一个数组，请你编写一个函数，返回该数组排序后的形式。
 * 示例1
 * 输入
 * [5,2,3,1,4]
 * 返回值
 * [1,2,3,4,5]
 * 示例2
 * 输入
 * [5,1,6,2,5]
 * 返回值
 * [1,2,5,5,6]
 */
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 将给定数组排序
     * @param arr int整型一维数组 待排序的数组
     * @return int整型一维数组
     */
    public int[] MySort (int[] arr) {
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int tmp =arr[i];
                    arr[i] = arr[j];
                    arr[j]=tmp;
                }
            }
        }
        return arr;
    }
}