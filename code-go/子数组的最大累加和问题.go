package code_go

/**
题目描述
给定一个数组arr，返回子数组的最大累加和
例如，arr = [1, -2, 3, 5, -2, 6, -1]，所有子数组中，[3, 5, -2, 6]可以累加出最大的和12，所以返回12.
题目保证没有全为负数的数据
[要求]
时间复杂度为O(n)O(n)，空间复杂度为O(1)O(1)

示例1
输入
[1, -2, 3, 5, -2, 6, -1]
返回值
12
*/
func maxsumofSubarray(arr []int) int {
	dp := make([]int, len(arr))
	dp[0] = arr[0]
	for i := 1; i < len(arr); i++ {
		dp[i] = max(dp[i-1], dp[i-1]+arr[i])
	}
	return dp[len(arr)-1]
}
func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
