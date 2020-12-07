import java.util.*;

/**
 * 题目描述
 * 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
 * 示例1
 * 输入
 * "abcd"
 * 返回值
 * "dcba"
 */
public class Solution {
    /**
     * 反转字符串
     * @param str string字符串
     * @return string字符串
     */
    public String solve (String str) {
        // write code here
        char[] s = str.toCharArray();
        for(int i=0;i<s.length/2;i++){
            char tmp = s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1] = tmp;
        }
        StringBuffer result = new StringBuffer("");
        for(int i=0;i<s.length;i++){
            result.append(s[i]);
        }
        return result.toString();
    }
}