import java.util.*;

/**
 * 题目描述
 * 给出一组可能包含重复项的数字，返回该组数字的所有排列。
 * 示例1
 * 输入
 * [1,1,2]
 * 返回值
 * [[1,1,2],[1,2,1],[2,1,1]]
 */
public class Solution {
    ArrayList<ArrayList<Integer>> result =new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        Arrays.sort(num);
        backStack(num,new boolean[num.length],new LinkedList<Integer>());
        return result;
    }

    public void backStack(int[] num,boolean[] used, LinkedList<Integer> res){
        if (res.size()==num.length){
            result.add(new ArrayList<Integer>(res));
            return;
        }
        for (int i=0;i<used.length;i++){
            if(used[i] || i>0 && num[i] == num[i-1] && !used[i-1]){
                continue;
            }
            used[i]=true;
            res.add(num[i]);
            backStack(num,used,res);
            res.removeLast();
            used[i]=false;
        }

    }
}