/**
 * 题目描述
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * n\leq 39n≤39
 *
 * 示例1
 * 输入
 * 4
 * 返回值
 * 3
 */
public class Solution {
    public int Fibonacci(int n) {
        if (n==1){
            return 1;
        }else if (n==0){
            return 0;
        }else if (n==2){
            return 1;
        }
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i =2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}