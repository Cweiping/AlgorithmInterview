import java.util.*;

/**
 * 题目描述
 * 给出n对括号，请编写一个函数来生成所有的由n对括号组成的合法组合。
 * 例如，给出n=3，解集为：
 * "((()))", "(()())", "(())()", "()()()", "()(())",
 * 示例1
 * 输入
 * 1
 * 返回值
 * ["()"]
 * 示例2
 * 输入
 * 2
 * 返回值
 * ["(())","()()"]
 */
public class Solution {
    /**
     *
     * @param n int整型
     * @return string字符串ArrayList
     */
    private int max = 0;
    ArrayList<String> result = new ArrayList<String>();
    public ArrayList<String> generateParenthesis (int n) {
        max=n;
        backTrack("",0,0);
        return result;
    }
    public void backTrack(String n,int left,int right){
        if (n.length()==max*2){
            result.add(n);
            return ;
        }
        if (left<max){
            backTrack(n+"(",left+1,right);
        }
        if (left>right){
            backTrack(n+")",left,right+1);
        }
    }
}