package code_go

/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func constructMaximumBinaryTree(nums []int) *TreeNode {
	if len(nums) == 0 {
		return nil
	}
	idx := getMaxIdx(nums)
	root := &TreeNode{Val: nums[idx]}
	if idx > 0 {
		root.Left = constructMaximumBinaryTree(nums[:idx])
	}
	if idx < len(nums) {
		root.Right = constructMaximumBinaryTree(nums[idx+1:])
	}
	return root
}

func getMaxIdx(nums []int) int {
	idx := 0
	for i := 1; i < len(nums); i++ {
		if nums[idx] < nums[i] {
			idx = i
		}
	}
	return idx
}
