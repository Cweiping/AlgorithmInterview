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
 * 给定一个二叉树，返回该二叉树的之字形层序遍历，（第一层从左向右，下一层从右向左，一直这样交替）
 * 例如：
 * 给定的二叉树是{3,9,20,#,#,15,7},
 *
 * 该二叉树之字形层序遍历的结果是
 * [
 * [3],
 * [20,9],
 * [15,7]
 * ]
 * 示例1
 * 输入
 * {1,#,2}
 * 返回值
 * [[1],[2]]
 */
public class Solution {
    /**
     *
     * @param root TreeNode类
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder (TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root== null){ return result; }
        queue.offer(root);
        boolean flag=true;
        while(queue.size()>0){
            int len = queue.size();
            ArrayList<Integer> tmp = new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode node = queue.poll();
                tmp.add(flag?tmp.size():0,node.val);
                if (node.left!=null){ queue.offer(node.left); }
                if (node.right!=null){ queue.offer(node.right); }
            }
            flag=!flag;
            result.add(tmp);
        }
        return result;
    }
}