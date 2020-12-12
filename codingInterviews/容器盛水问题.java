import java.util.*;

/**
 * 题目描述
 * 给定一个整形数组arr，已知其中所有的值都是非负的，将这个数组看作一个容器，请返回容器能装多少水。
 * 具体请参考样例解释
 * 示例1
 * 输入
 * [3,1,2,5,2,4]
 * 返回值
 * 5
 * 说明
 *
 * 示例2
 * 输入
 * [4,5,1,3,2]
 * 返回值
 * 2
 */
public class Solution {
    public long maxWater (int[] arr) {

        if(arr.length == 0 || arr.length <= 2)
            return 0;
        int left = 0, right = arr.length-1;
        long res = 0;
        //取低的为边界
        int min = Math.min(arr[left],arr[right]);

        while(left < right){
            if(arr[left] < arr[right]){
                left++;
                //如果当前水位小于边界，则可以装水
                if(arr[left] < min){
                    res += min-arr[left];
                }else{
                    min = Math.min(arr[left],arr[right]);
                }
            }else{
                right--;
                if(arr[right] < min){
                    res += min-arr[right];
                }else{
                    min = Math.min(arr[right],arr[left]);
                }
            }
        }
        return res;
    }
}