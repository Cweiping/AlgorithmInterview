import java.util.*;

/**
 * 题目描述
 * 给出一个有n个元素的数组S，S中是否有元素a,b,c满足a+b+c=0？找出数组S中所有满足条件的三元组。
 * 注意：
 * 三元组（a、b、c）中的元素必须按非降序排列。（即a≤b≤c）
 * 解集中不能包含重复的三元组。
 * 例如，给定的数组 S = {-10 0 10 20 -10 -40},解集为(-10, 0, 10) (-10, -10, 20)
 * <p>
 * 示例1
 * 输入
 * [-2,0,1,1,2]
 * 返回值
 * [[-2,0,2],[-2,1,1]]
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (num.length < 3) return result;
        Arrays.sort(num);
        //  遍历当前数组，使用双指针发遍历是存在满足条件的数组
        //  -num[i]==num[left]+num[right]
        for (int i = 0; i < num.length - 2; i++) {
            // 去重处理
            if (i != 0 && num[i] == num[i - 1]) continue;
            // 双指针 left 和 right 遍历数组 num[i] 右侧
            int left = i + 1, right = num.length - 1;
            while (left < right) {
                int sum = num[left] + num[right];
                if (-sum == num[i]) {
                    ArrayList<Integer> tmp = new ArrayList<>();
                    tmp.add(num[i]);
                    tmp.add(num[left]);
                    tmp.add(num[right]);
                    result.add(tmp);
                    left++;
                    right--;
                    //left 和 right 移动到下一个不相等的元素,避免重复
                    while (left < right && num[left] == num[left - 1]) left++;
                    while (left < right && num[right] == num[right + 1]) right--;
                } else if (num[i] > -sum) right--;
                else left++;
            }
        }
        return result;
    }
}