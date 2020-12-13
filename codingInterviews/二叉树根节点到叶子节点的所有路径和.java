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
 * 给定一个仅包含数字\ 0-9 0−9 的二叉树，每一条从根节点到叶子节点的路径都可以用一个数字表示。
 * 例如根节点到叶子节点的一条路径是1\to 2\to 31→2→3,那么这条路径就用\ 123 123 来代替。
 * 找出根节点到叶子节点的所有路径表示的数字之和
 * 例如：
 *
 * 这颗二叉树一共有两条路径，
 * 根节点到叶子节点的路径 1\to 21→2 用数字\ 12 12 代替
 * 根节点到叶子节点的路径 1\to 31→3 用数字\ 13 13 代替
 * 所以答案为\ 12+13=25 12+13=25
 * 示例1
 * 输入
 * {1,0}
 * 返回值
 * 10
 * 示例2
 * 输入
 * {1,#,9}
 * 返回值
 * 19
 */
public class Solution {
    /**
     *
     * @param root TreeNode类
     * @return int整型
     */
    private int cur=0;
    private int sum=0;
    public int sumNumbers (TreeNode root) {
        // write code here
        if (root==null){return 0;}
        cur=cur*10+root.val;
        if (root.left==null&&root.right==null){
            sum+=cur;
        }else{
            sumNumbers(root.left);
            sumNumbers(root.right);
        }
        cur/=10;
        return sum;
    }
}