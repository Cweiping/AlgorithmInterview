import java.util.*;

/**
 * 题目描述
 * 给定两个字符串str1和str2,输出两个字符串的最长公共子串，如果最长公共子串为空，输出-1。
 * 示例1
 * 输入
 * "1AB2345CD","12345EF"
 * 返回值
 * "2345"
 */
public class Solution {
    /**
     * longest common substring
     * @param str1 string字符串 the string
     * @param str2 string字符串 the string
     * @return string字符串
     */
    public String LCS(String str1, String str2){
        if(str1.length() == 0 || str2.length() == 0){
            return "-1";
        }
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        int start1 = -1;
        int start2 = -1;
        int[][] dp = new int[s1.length][s2.length];
        int max = 0;
        for(int i=0; i<s1.length; i++){
            dp[i][0] = (s1[i] == s2[0] ? 1 : 0);
            for(int j=0; j<s2.length; j++){
                dp[0][j] = (s1[0] == s2[j] ? 1 : 0);
                if(i > 0 && j > 0){
                    if(s1[i] == s2[j]){
                        dp[i][j] = dp[i-1][j-1] + 1;
                    }
                }
                if(max < dp[i][j]){
                    max = dp[i][j];
                    start1 = i + 1 - max;
                    start2 = j + 1 - max;
                }
            }
        }
        if(max == 0) return "-1";
        return str1.substring(start1, max+start1);
    }
}