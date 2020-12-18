import java.util.*;

/**
 * 题目描述
 * 以字符串的形式读入两个数字，编写一个函数计算它们的和，以字符串形式返回。
 * （字符串长度不大于100000，保证字符串仅由'0'~'9'这10种字符组成）
 * 示例1
 * 输入
 * "1","99"
 * 返回值
 * "100"
 * 说明
 * 1+99=100
 */
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 计算两个数之和
     * @param s string字符串 表示第一个整数
     * @param t string字符串 表示第二个整数
     * @return string字符串
     */
    public String solve (String s, String t) {
        int sum =0;
        StringBuffer ss = new StringBuffer(s).reverse();
        StringBuffer tt = new StringBuffer(t).reverse();
        // 较短数组补零，对齐操作
        if (ss.length()>tt.length()){
            for(int i=tt.length();i<ss.length();i++){ tt.append("0"); }
        }else{
            for(int i=ss.length();i<tt.length();i++){ ss.append("0"); }
        }
        StringBuffer result = new StringBuffer();
        for (int i=0;i<tt.length();i++){
            sum= Integer.parseInt(""+ss.charAt(i))+Integer.parseInt(""+tt.charAt(i))+sum;
            result.append(sum%10);
            sum/=10;
        }
        //追加最后一位
        if (sum==1){ result.append("1");}
        return result.reverse().toString();
    }
}