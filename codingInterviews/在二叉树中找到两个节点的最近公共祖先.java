import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 */

/**
 * 给定一棵二叉树以及这棵树上的两个节点 o1 和 o2，请找到 o1 和 o2 的最近公共祖先节点。
 * 示例1
 * 输入
 * [3,5,1,6,2,0,8,#,#,7,4],5,1
 * 返回值
 * 3
 */
public class Solution {
    /**
     *
     * @param root TreeNode类
     * @param o1 int整型
     * @param o2 int整型
     * @return int整型
     */
    private ArrayList<Integer> arrays = new ArrayList<>();

    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        return each(root,o1,o2).val;
    }

    public TreeNode each(TreeNode root, int o1, int o2){
        if (root==null||root.val==o1||root.val==o2){
            return root;
        }
        TreeNode left = each(root.left,o1,o2);
        TreeNode right = each(root.right,o1,o2);
        if(left==null){
            return right;
        }
        if (right==null){
            return left;
        }
        return root;
    }
}