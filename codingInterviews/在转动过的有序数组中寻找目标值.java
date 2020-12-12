import java.util.*;

/**
 * 题目描述
 * 给出一个转动过的有序数组，你事先不知道该数组转动了多少
 * (例如,0 1 2 4 5 6 7可能变为4 5 6 7 0 1 2).
 * 在数组中搜索给出的目标值，如果能在数组中找到，返回它的索引，否则返回-1。
 * 假设数组中不存在重复项。
 * 示例1
 * 输入
 * [1],0
 * 返回值
 * -1
 * 示例2
 * 输入
 * [3,2,1],1
 * 返回值
 * 2
 */
public class Solution {
    /**
     *
     * @param A int整型一维数组
     * @param target int整型
     * @return int整型
     */
    public int search (int[] A, int target) {
        // write code here
        if (A.length==0) return -1;
        if (A.length==1&&A[0]!=target) return -1;
        if (target==A[0]) {
            return 0;
        }else if (target>A[0]){
            for (int i=1; i<A.length&&A[0]<A[i];i++){
                if (target==A[i]){
                    return i;
                }
            }
        }else {
            for (int i=A.length-1;i>0&& A[0]>A[i];i--){
                if (target==A[i]){
                    return i;
                }
            }
        }
        return -1;
    }
}