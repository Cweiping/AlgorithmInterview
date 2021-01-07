package codingInterviews

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

/**
 *
 * @param root TreeNode类
 * @return int整型
 */
var max = 0

func maxPathSum(root *TreeNode) int {
	// write code here
	if root == nil {
		return 0
	}
	max = root.Val
	maxPath(root)
	return max
}
func maxPath(root *TreeNode) int {
	if root == nil {
		return 0
	}
	leftSum := maxPath(root.Left)
	rightSum := maxPath(root.Right)
	tmp := root.Val
	if leftSum > 0 {
		tmp += leftSum
	}
	if rightSum > 0 {
		tmp += rightSum
	}
	if tmp > max {
		max = tmp
	}
	// 左右子树的较大值且>0
	if rightSum > leftSum && rightSum > 0 {
		return root.Val + rightSum
	} else if rightSum < leftSum && leftSum > 0 {
		return root.Val + leftSum
	} else {
		return root.Val
	}
}
