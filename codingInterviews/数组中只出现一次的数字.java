//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
import java.util.*;

/**
 * 题目描述
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<array.length;i++){
            int key = array[i];
            map.put(key,map.containsKey(key)?2:1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for  ( Integer key :map.keySet()){
            if (map.get(key)==1){
                result.add(key);
            }
        }
        num1[0]=result.get(0);
        num2[0]=result.get(1);
    }
}