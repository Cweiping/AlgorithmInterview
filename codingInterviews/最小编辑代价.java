import java.util.*;
import java.util.*;

/**
 * 题目描述
 * 给定两个字符串str1和str2，再给定三个整数ic，dc和rc，分别代表插入、删除和替换一个字符的代价，请输出将str1编辑成str2的最小代价。
 * 示例1
 * 输入
 * "abc","adc",5,3,2
 * 返回值
 * 2
 * 示例2
 * 输入
 * "abc","adc",5,3,100
 * 返回值
 * 8
 */
public class Solution {
    /**
     * 牛客网：https://www.nowcoder.com/practice/05fed41805ae4394ab6607d0d745c8e4?tpId=191&tags=&title=&diffculty=0&judgeStatus=0&rp=1
     * 每次操作都有对应的 cost
     * min edit cost
     * @param str1 string字符串 the string
     * @param str2 string字符串 the string
     * @param ic int整型 insert cost
     * @param dc int整型 delete cost
     * @param rc int整型 replace cost
     * @return int整型
     *
     * 解法参考 leetcode 72. 编辑距离
     * 本题比leetcode原题中增加了每种操作的代价。
     *  原题的每种操作代价都是1
     *  dp[i][j] 表示 word1[0~i] 变成 word2[0~j] 需要的操作次数.
     *  dp[i][j] = 1 + Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
     *  其中：已知 dp[i-1][j] 则 dp[i][j] 删除一个元素变成 dp[i-1][j] ，由 dp[i][j-1] 插入一个字符，由 dp[i-1][j-1] 替换一个元素
     *
     */
    public int minEditCost (String str1, String str2, int ic, int dc, int rc) {
        // 如果其中一个为空
        if (str1.length() == 0) return str2.length() * ic;
        if (str2.length() == 0) return str1.length() * dc;
        int n1 = str1.length(), n2 = str2.length();
        // dp[0][0] 表示空字符串变成空字符串的代价（0），可以简化操作
        int[][] dp = new int[n1 + 1][n2 + 1];
        // 初始化：
        // 1、由 str1 变成空字符串的代价
        for (int i = 0; i <= n1; i++) dp[i][0] = i * dc;
        // 2、由空字符串变成 str2 的代价
        for (int i = 0; i <= n2; i++) dp[0][i] = i * ic;
        // 状态转移
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) dp[i][j] = dp[i-1][j-1];
                else dp[i][j] = Math.min(dp[i-1][j] + dc, Math.min(dp[i][j-1] + ic, dp[i-1][j-1] + rc));
            }
        }
        return dp[n1][n2];
    }
}