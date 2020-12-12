import java.util.*;

/**
 * 题目描述
 * 给定一个十进制数M，以及需要转换的进制数N。将十进制数M转化为N进制数
 * 示例1
 * 输入
 * 7,2
 * 返回值
 * "111"
 */
public class Solution {
    /**
     * 进制转换
     * @param M int整型 给定整数
     * @param N int整型 转换到的进制
     * @return string字符串
     */
    public String solve (int M, int N) {
        // write code here
        if (M==0)return "0";
        boolean flag=false;
        if (M<0){
            flag=true;
            M*=-1;
        }
        StringBuffer result= new StringBuffer();
        int sum =1;
        while(M>0){
            int val = M%N;
            if (val<10){
                result.append(val);
            }else{
                result.append((char)('A' + (val - 10)));
            }
            M/=N;
        }
        if (flag) result.append("-");
        return result.reverse().toString();
    }
}