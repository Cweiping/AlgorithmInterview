import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 */

/**
 * 题目描述
 * 分别按照二叉树先序，中序和后序打印所有的节点。
 * 示例1
 * 输入
 * {1,2,3}
 * 返回值
 * [[1,2,3],[2,1,3],[2,3,1]]
 * 备注:
 * n \leq 10^6n≤10
 * 6
 */
public class Solution {
    /**
     *
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
    public int[][] threeOrders (TreeNode root) {
        // write code here
        int[][] result = new int[3][];
        result[0]=beforeEach(root).stream().mapToInt(x->x).toArray();
        result[1]=midEach(root).stream().mapToInt(x->x).toArray();
        result[2]=afterEach(root).stream().mapToInt(x->x).toArray();
        return result;
    }

    public ArrayList<Integer> beforeEach(TreeNode root){
        ArrayList<Integer> result = new ArrayList<>();
        if (root==null){
            return result;
        }
        result.add(root.val);
        result.addAll(beforeEach(root.left));
        result.addAll(beforeEach(root.right));
        return result;
    }
    public ArrayList<Integer>  midEach(TreeNode root){
        ArrayList<Integer> result = new ArrayList<>();
        if (root==null){
            return result;
        }
        result.addAll(midEach(root.left));
        result.add(root.val);
        result.addAll(midEach(root.right));
        return result;
    }

    public ArrayList<Integer>  afterEach(TreeNode root){
        ArrayList<Integer> result = new ArrayList<>();
        if (root==null){
            return result;
        }
        result.addAll(afterEach(root.left));
        result.addAll(afterEach(root.right));
        result.add(root.val);
        return result;
    }
}