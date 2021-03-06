/**
 * 题目描述
 * 给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1，m<=n），每段绳子的长度记为k[1],...,k[m]。请问k[1]x...xk[m]可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * 输入描述:
 * 输入一个数n，意义见题面。（2 <= n <= 60）
 * 返回值描述:
 * 输出答案。
 * 示例1
 * 输入
 * 8
 * 返回值
 * 18
 */
public class Solution {
    public int cutRope(int target) {
        if (target<2){
            return 0;
        }if(target==2){
            return 1;
        }if (target==3){
            return 2;
        }
        int result = 1;
        for(int i=0;i<target/3-1;i++){
            result *=3;
        }
        if (target%3==1){
            result*=4;
        }else if(target%3==2){
            result*=6;
        }else {
            result*=3;
        }
        return result;
    }
}