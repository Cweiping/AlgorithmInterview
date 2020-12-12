import java.util.*;
import java.math.*;

/**
 * 题目描述
 * 对于一个字符串，请设计一个高效算法，计算其中最长回文子串的长度。
 *
 * 给定字符串A以及它的长度n，请返回最长回文子串的长度。
 *
 * 示例1
 * 输入
 * "abc1234321ab",12
 * 返回值
 * 7
 */
public class Palindrome {
    public int getLongestPalindrome(String A, int n) {

        boolean[][] dp = new boolean[n][n];
        int max = 1;
        dp[0][0]=true;
        for (int i=0;i<n;i++){
            for (int left=0;left<n-i;left++){
                int right = left+i;
                if (A.charAt(left)==A.charAt(right)){
                    if (i==0||i==1){
                        dp[left][right]=true;
                    }else{
                        dp[left][right]=dp[left+1][right-1];
                    }
                    if (dp[left][right]){
                        max = Math.max(max,i+1);
                    }
                }
            }
        }
        return max;
    }
}