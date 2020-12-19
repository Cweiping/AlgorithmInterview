/**
 * 题目描述
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * n\leq 39n≤39
 * <p>
 * 示例1
 * 输入
 * 4
 * 返回值
 * 3
 */
public class Solution {
    public int Fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        int last1 = 0, last2 = 1, cur = 0;
        for (int i = 2; i <= n; i++) {
            cur = last1 + last2;
            last1 = last2;
            last2 = cur;
        }
        return cur;
    }
}