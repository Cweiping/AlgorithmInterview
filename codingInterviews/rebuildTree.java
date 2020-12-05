/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// public class TreeNode {
//       int val;
//       TreeNode left;
//       TreeNode right;
//       TreeNode(int x) { val = x; }
//   }
import java.util.*;
public class Solution {
    /**
     * 原地递归前序和中序，生成二叉树
     * @param pre
     * @param in
     * @return
     */
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {

        if (pre.length==0){
            return null;
        }
        TreeNode root= new TreeNode(pre[0]);
        for (int i=0;i<in.length;i++){
            if(in[i]==root.val){
                root.left =reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOf(in,i));
                root.right =reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return root;
    }
}