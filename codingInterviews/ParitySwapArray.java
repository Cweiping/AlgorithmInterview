/**
 * 题目描述
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */

import java.lang.System;
public class Solution {
    public void reOrderArray(int [] array) {
        int[] arr= new int[array.length];
        int index=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                arr[index]=array[i];
                index++;
            }
        }
        index=array.length-1;
        for(int i=array.length-1;i>=0;i--){
            if(array[i]%2==0){
                arr[index]=array[i];
                index--;
            }
        }
        System.arraycopy(arr,0,array,0,array.length);
    }
}