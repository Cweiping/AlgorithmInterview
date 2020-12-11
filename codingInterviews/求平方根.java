/**
 * 题目描述
 * 实现函数 int sqrt(int x).
 * 计算并返回x的平方根（向下取整）
 * 示例1
 * 输入
 * 2
 * 返回值
 * 1
 */
public class Solution {
    public int sqrt(int x) {
        int i = 1;
        int res = 0;
        while (x >= 0) {
            x -= i;
            res++;
            i += 2;
        }
        return res - 1;
    }
}