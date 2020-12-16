import java.util.*;
/**
 * 题目描述
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
 * 示例1
 * 输入
 * [4,5,1,6,2,7,3,8],4
 * 返回值
 * [1,2,3,4]
 */
public class Solution {
    /**
     * 快速排序实现
     * @param input
     * @param k
     * @return
     */
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (k>input.length){
            return result;
        }
        for (int i=0; i<k;i++){
            for(int j=i+1;j<input.length;j++){
                if (input[i]>input[j]){
                    int tmp = input[i];
                    input[i]=input[j];
                    input[j]=tmp;
                }
            }
            result.add(input[i]);
        }
        return result;
    }
}