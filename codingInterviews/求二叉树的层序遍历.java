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
 * 给定一个二叉树，返回该二叉树层序遍历的结果，（从左到右，一层一层地遍历）
 * 例如：
 * 给定的二叉树是{3,9,20,#,#,15,7},
 *
 * 该二叉树层序遍历的结果是
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 *
 * 示例1
 * 输入
 * {1,2}
 * 返回值
 * [[1],[2]]
 * 示例2
 * 输入
 * {1,2,3,4,#,#,5}
 * 返回值
 * [[1],[2,3],[4,5]]
 */

public class Solution {
    /**
     *
     * @param root TreeNode类
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here
        Queue<TreeNode> queue= new LinkedList<TreeNode>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (root==null){
            return result;
        }
        queue.offer(root);
        while(queue.size()>0){
            ArrayList<Integer>  level= new ArrayList<Integer>();
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode tmp = queue.poll();
                level.add(tmp.val);
                if(tmp.left!=null){
                    queue.offer(tmp.left);
                }if (tmp.right!=null){
                    queue.offer(tmp.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}