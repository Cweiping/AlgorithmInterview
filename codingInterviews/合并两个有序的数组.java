/**
 * 题目描述
 * 给出两个有序的整数数组 和 ，请将数组 合并到数组 中，变成一个有序的数组
 * 注意：
 * 可以假设 数组有足够的空间存放 数组的元素， 和 中初始的元素数目分别为 和
 */

public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int idxA = m-1,idxB = n-1;
        for (int i =m+n-1;idxA>=0&&idxB>=0;i--){
            A[i] = A[idxA] > B[idxB] ? A[idxA--]:B[idxB--];
        }
        while (idxB>=0){
            A[idxB]=B[idxB--];
        }
    }
}