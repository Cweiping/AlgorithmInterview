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
     * @param op int整型二维数组 operator
     * @return int整型一维数组
     */
    private ArrayList<Integer> result = new ArrayList<Integer>();
    public int[] getMinStack (int[][] op) {
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int[] o: op){
            if (o[0]==1){
                stack.push(o[1]);
                arr.add(o[1]);
            }else if(o[0]==2){
                Integer val = stack.pop();
                arr.remove(val);
            }else if (o[0]==3){
                Collections.sort(arr);
                result.add(arr.get(0));
            }
        }
        int [] res = new int[result.size()];
        for (int i= 0;i<result.size();i++){
            res[i]=result.get(i).intValue();
        }
        return res;

    }
}