/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
/**
 * 题目描述
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。
 * 示例1
 * 输入
 * {5,3,7,2,4,6,8},3
 * 返回值
 * {4}
 * 说明
 * 按结点数值大小顺序第三小结点的值为4
 */

import java.util.*;

public class Solution {
    public TreeNode KthNode(TreeNode pRoot, int k){
        if (k==0){return null;}
        ArrayList<Integer> result = each(pRoot);
        return result.size()>=k ?new TreeNode(result.get(k-1)):null;
    }
    public ArrayList<Integer> each (TreeNode root){
        ArrayList<Integer>  result =  new ArrayList<>();
        if (root==null){
            return result;
        }
        result.addAll(each(root.left));
        result.add(root.val);
        result.addAll(each(root.right));
        return result;
    }
}