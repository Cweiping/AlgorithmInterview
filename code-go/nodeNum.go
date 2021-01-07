package code_go

import "math"

/*
题目描述
给定一棵完全二叉树的头节点head，返回这棵树的节点个数。如果完全二叉树的节点数为N，请实现时间复杂度低于O(N)的解法。
示例1
输入
{1,2,3}
返回值
3*/
/**
 *
 * @param head TreeNode类
 * @return int整型
 */
func nodeNum(head *TreeNode) int {
	if head == nil {
		return 0
	}
	r := complateTreeHeight(head.Right)
	l := complateTreeHeight(head.Left)
	if r == l {
		return int(math.Pow(float64(2), float64(l))) + nodeNum(head.Right)
	} else {
		return int(math.Pow(float64(2), float64(r))) + nodeNum(head.Left)
	}
}
func complateTreeHeight(head *TreeNode) int {
	count := 0
	for head != nil {
		count++
		head = head.Left
	}
	return count
}
