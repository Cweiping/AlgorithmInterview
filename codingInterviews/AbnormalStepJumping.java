/**
 *
 题目描述
 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 示例1
 输入
 3
 返回值
 4
 */
public class Solution {
    public int JumpFloorII(int target) {
        if (target==0){
            return 0;
        }if(target==1){
            return 1;
        }
        int[] dp = new int[target+1];
        dp[1]=1;
        dp[2]=2;
        for (int i=3;i<=target;i++){
            int res=1;
            for(int j=i-1;j>0;j--){
                res+=dp[j];
            }
            dp[i]=res;
        }
        return dp[target];
    }
}