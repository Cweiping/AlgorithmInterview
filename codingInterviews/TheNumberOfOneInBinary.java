/**
 * 题目描述
 * 输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
 * 示例1
 * 输入
 * 10
 * 返回值
 * 2
 */
public class Solution {
    public int NumberOf1(int n) {
        String s=Integer.toBinaryString(n);
        char[] split=s.toCharArray();
        int sum=0;
        for(int i = 0; i < split.length; i++) {
            if (split[i]=='1')
            {
                sum++;
            }
        }
        return sum;
    }
}