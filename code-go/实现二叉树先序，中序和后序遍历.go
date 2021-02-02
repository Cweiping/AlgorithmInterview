package code_go

/**
题目描述
分别按照二叉树先序，中序和后序打印所有的节点。
示例1
输入
复制
{1,2,3}
返回值
复制
[[1,2,3],[2,1,3],[2,3,1]]
备注:
n \leq 10^6n≤10
6
*/
var pre, mid, last []int

func threeOrders(root *TreeNode) [][]int {
	pre, mid, last = []int{}, []int{}, []int{}
	each(root)
	return [][]int{pre, mid, last}
}

func each(root *TreeNode) {
	if root != nil {
		pre = append(pre, root.Val)
		if root.Left != nil {
			each(root.Left)
		}
		mid = append(mid, root.Val)
		if root.Right != nil {
			each(root.Right)
		}
		last = append(last, root.Val)
	}
}
