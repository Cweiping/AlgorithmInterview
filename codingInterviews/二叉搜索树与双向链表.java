/**
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
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Solution {
    private TreeNode head=null;
    private TreeNode ahead=null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        each(pRootOfTree);
        return head;
    }
    public void each (TreeNode root){
        if (root==null){
            return ;
        }
        each(root.left);
        if (head==null){
            head=root;
            ahead=root;
        }else{
            ahead.right=root;
            root.left=ahead;
            ahead=root;
        }
        each(root.right);
    }
}