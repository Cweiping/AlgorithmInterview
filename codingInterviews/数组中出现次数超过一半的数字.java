import java.util.*;

/**
 * 题目描述
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * 示例1
 * 输入
 * [1,2,3,2,2,2,5,4,2]
 * 返回值
 * 2
 */
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array.length<2){
            return array.length;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<array.length;i++){
            int key = array[i];
            if (!map.containsKey(key)){
                map.put(key,1);
                continue;
            }
            if (map.get(key)>array.length/2-1){
                return key;
            }
            map.put(key,map.get(key)+1);
        }
        return 0;
    }
}