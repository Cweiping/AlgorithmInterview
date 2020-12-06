import java.util.*;

/**
 * 题目描述
 * 有一个整数数组，请你根据快速排序的思路，找出数组中第K大的数。
 *
 * 给定一个整数数组a,同时给定它的大小n和要找的K(K在1到n之间)，请返回第K大的数，保证答案存在。
 *
 * 示例1
 * 输入
 * [1,3,5,2,2],5,3
 * 返回值
 * 2
 */
public class Finder {
    public int findKth(int[] a, int n, int K) {
        // write code here
        for(int i=0;i<K;i++){
            for(int j=1+i;j<a.length;j++){
                if (a[i]<a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        return a[K-1];
    }
}