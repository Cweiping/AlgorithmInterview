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
    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        if (root==null){
            return -1;
        }
        if (root.val==o1||root.val==o2){
            return root.val;
        }
        int left = lowestCommonAncestor(root.left,o1,o2);
        int right = lowestCommonAncestor(root.right,o1,o2);
        // o1 和 o2 同时在右子树
        if (left==-1){
            return right;
        }
        // o1 和 o2 同时在左子树
        if (right==-1){
            return left;
        }
        // o1 和 o2 分别在左右子树
        return root.val;
    }
}
/**
 * DFS框架遍历该二叉树
 * 公共先祖共有三种情况：
 *   1. o1 和 o2 分别在左右树
 *   2. o1 和 o2 同时在左子树
 *   3. o1 和 o2 同时在右子树
 */