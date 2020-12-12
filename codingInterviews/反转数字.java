import java.util.*;

/**
 * 题目描述
 * 将给出的32位整数x翻转。
 * 例1:x=123，返回321
 * 例2:x=-123，返回-321
 *
 * 你有注意到翻转后的整数可能溢出吗？因为给出的是32位整数，则其数值范围为[−2^{31}, 2^{31} − 1][−2
 * 31
 *  ,2
 * 31
 *  −1]。翻转可能会导致溢出，如果反转后的结果会溢出就返回 0。
 *
 * 示例1
 * 输入
 * -123
 * 返回值
 * -321
 */
public class Solution {
    /**
     *
     * @param x int整型
     * @return int整型
     */
    public int reverse (int x) {
        // write code here
        if (x<10&&x>-10){ return x;}
        boolean flag =false;
        if (x<0){flag=true; x*=-1;}
        StringBuffer str =new StringBuffer();
        str.append(x);
        if (flag){ str.append("-");}
        String result = str.reverse().toString();
        if (result.length()<33){
            return Integer.parseInt(result);
        }
        return 0;
    }
}