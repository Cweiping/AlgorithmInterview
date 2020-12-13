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
 * 给定一棵二叉树，判断琪是否是自身的镜像（即：是否对称）
 * 例如：下面这棵二叉树是对称的
 *      1
 *     /  \
 *   2    2
 *  / \    / \
 * 3 4  4  3
 * 下面这棵二叉树不对称。
 *     1
 *     / \
 *   2   2
 *     \    \
 *     3    3
 * 备注：
 * 希望你可以用递归和迭代两种方法解决这个问题
 * 示例1
 * 输入
 * {1,2,2}
 * 返回值
 * true
 */
public class Solution {
    /**
     *
     * @param root TreeNode类
     * @return bool布尔型
     */
    public boolean isSymmetric (TreeNode root) {
        // write code here
        if (root==null){
            return true;
        }else if (root.left==null&&root.right==null){
            return true;
        }else if (root.left!=null&&root.right!=null&&root.left.val==root.right.val){
            return equal(root.left.left,root.right.right)&&equal(root.left.right,root.right.left);
        }
        return false;
    }
    public boolean equal(TreeNode l,TreeNode r){
        if (l==null&&r==null){
            return true;
        }else if (l!=null&&r!=null&&l.val==r.val){
            return equal(l.left,r.right)&&equal(l.right,r.left);
        }
        return false;
    }
}