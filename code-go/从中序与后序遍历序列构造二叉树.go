package code_go

/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func PostBuildTree(inorder []int, postorder []int) *TreeNode {
	if len(inorder) == 0 {
		return nil
	}
	root := &TreeNode{Val: postorder[len(postorder)-1]}
	idx := 0
	for ; idx < len(inorder); idx++ {
		if root.Val == inorder[idx] {
			break
		}
	}
	root.Left = PostBuildTree(inorder[:idx], postorder[:idx])
	root.Right = PostBuildTree(inorder[idx+1:], postorder[idx:len(postorder)-1])
	return root
}
