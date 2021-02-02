package code_go

/**
题目描述
给定一个二叉树和一个值\ sum sum，请找出所有的根节点到叶子节点的节点值之和等于\ sum sum 的路径，
例如：
给出如下的二叉树，\ sum=22 sum=22，

返回
[
[5,4,11,2],
[5,8,9]
]
示例1
输入
{1,2},1
返回值
[]
示例2
输入
{1,2},3
返回值
[[1,2]]
*/
func pathSum(root *TreeNode, sum int) [][]int {
	tmp := make([]int, 0)
	var result [][]int
	backrack(root, sum, tmp, &result)
	return result
}

func backrack(root *TreeNode, sum int, tmp []int, res *[][]int) {
	if root == nil {
		return
	}
	tmp = append(tmp, root.Val)
	if root.Left == nil && root.Right == nil && sum == root.Val {
		t := make([]int, len(tmp))
		copy(t, tmp)
		*res = append(*res, t)
		tmp = tmp[:len(tmp)-1]
		return
	}
	backrack(root.Left, sum-root.Val, tmp, res)
	backrack(root.Right, sum-root.Val, tmp, res)
	tmp = tmp[:len(tmp)-1]
}
