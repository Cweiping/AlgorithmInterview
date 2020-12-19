import java.util.*;

/**
 * 题目描述
 * 实现一个特殊功能的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作。
 * 示例1
 * 输入
 * [[1,3],[1,2],[1,1],[3],[2],[3]]
 * 复制
 * [1,2]
 */
public class Solution {
    /**
     * return a array which include all ans for op3
     *
     * @param op int整型二维数组 operator
     * @return int整型一维数组
     */
    public int[] getMinStack(int[][] op) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int[] o : op) {
            if (o[0] == 1) {
                stack.push(o[1]);
                arr.add(o[1]);
            } else if (o[0] == 2) arr.remove(stack.pop());
            else if (o[0] == 3) result.add(Collections.min(arr));
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}