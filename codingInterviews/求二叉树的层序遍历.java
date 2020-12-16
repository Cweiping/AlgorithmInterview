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
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (root==null){ return result;}
        Queue<TreeNode> queue= new LinkedList<TreeNode>();
        queue.offer(root);
        while(queue.size()>0){
            int len = queue.size();
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            for (int i=0;i<len;i++){
                TreeNode n = queue.poll();
                tmp.add(n.val);
                if (n.left!=null){queue.offer(n.left);}
                if (n.right!=null){queue.offer(n.right);}
            }
            result.add(tmp);
        }
        return result;
    }
}