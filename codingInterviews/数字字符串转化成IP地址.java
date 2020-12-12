import java.util.*;

/**
 * 题目描述
 * 现在有一个只包含数字的字符串，将该字符串转化成IP地址的形式，返回所有可能的情况。
 * 例如：
 * 给出的字符串为"25525522135",
 * 返回["255.255.22.135", "255.255.221.35"]. (顺序没有关系)
 * 示例1
 * 输入
 * "25525522135"
 * 返回值
 * ["255.255.22.135","255.255.221.35"]
 */
public class Solution {
    /**
     *
     * @param s string字符串
     * @return string字符串ArrayList
     */
    ArrayList<String> result = new ArrayList<>();
    public ArrayList<String> restoreIpAddresses (String s) {
        // write code here
        if (s.length()>12||s.length()<4){
            return result;
        }
        each(s,0,3);
        return result;
    }
    public void each (String s ,int idx,int count){
        if (count==0){
            String[] strs=s.split("\\.");
            if (strs.length==4){
                for(String str:strs){
                    if(str.length() > 1 && str.charAt(0) == '0') return;  //最前面的数字不能为0
                    if(Integer.valueOf(str) > 255) return;  //每一位都不能大于255
                }
                result.add(s);
                return;
            }
        }
        if (idx<s.length()-1){
            each(s.substring(0,idx+1)+'.'+s.substring(idx+1,s.length()),idx+2,count-1);
        }if (idx<s.length()-2){
            each(s.substring(0,idx+2)+'.'+s.substring(idx+2,s.length()),idx+3,count-1);
        }if (idx<s.length()-3){
            each(s.substring(0,idx+3)+'.'+s.substring(idx+3,s.length()),idx+4,count-1);
        }
    }
}