import java.util.*;

/**
 * 题目描述
 * 实现函数 atoi 。函数的功能为将字符串转化为整数
 * 提示：仔细思考所有可能的输入情况。这个问题没有给出输入的限制，你需要自己考虑所有可能的情况。
 *
 *
 *
 * 示例1
 * 输入
 * "123"
 * 返回值
 * 123
 */
public class Solution {
    /**
     *
     * @param str string字符串
     * @return int整型
     */
    public int atoi (String str) {
        // write code here
        if (str.length()==0)return 0;
        str = str.trim();
        int flag = 1;
        if (str.charAt(0)=='-') {
            flag=-1;
            str=str.substring(1);
        }else if (str.charAt(0)=='+'){
            str=str.substring(1);
        }
        int result=0;
        for (int i=0;i<str.length();i++){
            char s= str.charAt(i);
            if (s>='0'&&s<='9'){
                if (result > Integer.MAX_VALUE / 10 || result == Integer.MAX_VALUE / 10 && s - '7' > 0) {
                    return flag > 0?Integer.MAX_VALUE:Integer.MIN_VALUE;
                }
                result = Integer.parseInt(""+s)+result*10;
            }else{
                break;
            }
        }
        return result*flag;
    }
}