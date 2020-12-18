import java.util.*;

/**
 * 题目描述
 * 给定数组arr，设长度为n，输出arr的最长递增子序列。（如果有多个答案，请输出其中字典序最小的）
 * 示例1
 * 输入
 * [2,1,5,3,6,4,8,9,7]
 * 返回值
 * [1,3,4,8,9]
 * 示例2
 * 输入
 * [1,2,8,6,4]
 * 返回值
 * [1,2,4]
 * 说明
 * 其最长递增子序列有3个，（1，2，8）、（1，2，6）、（1，2，4）其中第三个字典序最小，故答案为（1，2，4）
 */
public class Solution {
    /**
     * retrun the longest increasing subsequence
     * @param arr int整型一维数组 the array
     * @return int整型一维数组
     */
    public int[] LIS (int[] arr) {
        if (arr.length<2){ return arr; }
        int[] dp = new int[arr.length];
        ArrayList<Integer> maxEnd = new ArrayList<>();
        dp[0]=1;
        maxEnd.add(arr[0]);
        for (int i=1;i<arr.length;i++){
            if (arr[i]>maxEnd.indexOf(maxEnd.size()-1)){
                dp[i]=maxEnd.size()+1;
                maxEnd.add(arr[i]);
            }else{
                int left=0,right=maxEnd.size()-1;
                while(left<right){
                    int mid = (left+right)/2;
                    if(maxEnd.indexOf(mid)<arr[i]){
                        left=mid+1;
                    }else{
                        right=mid-1;
                    }
                }
                maxEnd.set(left,arr[i]);
                dp[i]=left;
            }
        }
        int len= maxEnd.size();
        int[] result = new int[len];
        for(int i= dp.length-1;i>=0;i--){
            if(dp[i]==len){
                result[len--]=arr[i];
            }
        }
        return result;
    }
}