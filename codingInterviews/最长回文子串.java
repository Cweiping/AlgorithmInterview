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
//        计算[0,i]字符串的最长回文字符串
        for (int i=0;i<n;i++){
//             对[0,i]字符串进行遍历，收集其最大值
            for (int left=0;left<n-i;left++){
                int right = left+i;
//                 dp[left][right]表示 left 到 right 字符串是不是回文字符串
                if (A.charAt(left)==A.charAt(right)){
//                     如果当前字符串相等则和其子串结果一致，排查0和1的特殊情况
                    dp[left][right]= i==0||i==1 ? true : dp[left+1][right-1] ;
//                     如果是回文则获得两者的最大值
                    if (dp[left][right]){max = Math.max(max,i+1);}
                }
                //如果不一致则使用默认值false
            }
        }
        return max;
    }
}