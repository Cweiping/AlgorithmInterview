/**
 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */

public class Solution {
    public String replaceSpace(StringBuffer str) {
        StringBuffer s=new StringBuffer();
        char[] chars= str.toString().toCharArray();
        for (int i=0;i< chars.length;i++){
            if (chars[i]!=' '){
                s.append(String.valueOf(chars[i]));
            }else{
                s.append("%20");
            }
        }
        return s.toString();
    }
}