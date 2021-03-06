import java.util.*;
import java.lang.*;

/**
 * 给出一个仅包含字符'(',')','{','}','['和']',的字符串，判断给出的字符串是否是合法的括号序列
 * 括号必须以正确的顺序关闭，"()"和"()[]{}"都是合法的括号序列，但"(]"和"([)]"不合法。
 * 示例1
 * 输入
 * "["
 * 返回值
 * false
 * 示例2
 * 输入
 * "[]"
 * 返回值
 * true
 */
public class Solution {
    /**
     *
     * @param s string字符串 
     * @return bool布尔型
     */
    public boolean isValid (String s) {
        if (s.length()%2==1){ return false; }
        Stack<Character>  stack = new Stack<Character>();
        for (int i=0; i< s.length();i++){
            char ch = s.charAt(i);
            if (ch=='('){
                stack.push(')');
            }else if ( ch == '{'){
                stack.push('}');
            }else if ( ch == '['){
                stack.push(']');
            }else if (stack.empty()||stack.pop()!=ch){
                return false;
            }
        }
        return stack.size()==0;
    }
}