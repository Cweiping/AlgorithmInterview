package code_go

/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func flatten(root *TreeNode) {
	if root == nil {
		return
	}
	flatten(root.Left)
	flatten(root.Right)

	l := root.Left
	root.Left = nil

	r := root.Right
	root.Right = l

	p := root
	for p.Right != nil {
		p = p.Right
	}

	p.Right = r
}
