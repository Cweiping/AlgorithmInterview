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

    ArrayList<Integer> pre = new ArrayList<Integer>();
    ArrayList<Integer> mid = new ArrayList<Integer>();
    ArrayList<Integer> post = new ArrayList<Integer>();

    /**
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
    public int[][] threeOrders(TreeNode root) {
        each(root);
        int[][] result = new int[3][];
        result[0] = pre.stream().mapToInt(Integer::intValue).toArray();
        result[1] = mid.stream().mapToInt(Integer::intValue).toArray();
        result[2] = post.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }

    public void each(TreeNode root) {
        if (root == null) {
            return;
        }
        pre.add(root.val);
        each(root.left);
        mid.add(root.val);
        each(root.right);
        post.add(root.val);
    }
}