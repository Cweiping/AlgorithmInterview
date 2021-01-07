package code_go

/*
题目描述
给定数组arr，arr中所有的值都为正整数且不重复。每个值代表一种面值的货币，每种面值的货币可以使用任意张，再给定一个aim，代表要找的钱数，求组成aim的最少货币数。
如果无解，请返回-1.
【要求】
时间复杂度O(n \times aim)O(n×aim)，空间复杂度On。
示例1
输入
复制
[5,2,3],20
返回值
复制
4
示例2
输入
复制
[5,2,3],0
返回值
复制
0
示例3
输入
复制
[3,5],2
返回值*/
/**
 * 最少货币数
 * @param arr int整型一维数组 the array
 * @param aim int整型 the target
 * @return int整型
 */
func minMoney(arr []int, aim int) int {
	dp := make([]int, aim+1)
	for i := 1; i <= aim; i++ {
		dp[i] = 6000
		for _, coin := range arr {
			if i-coin >= 0 {
				if dp[i] > dp[i-coin]+1 {
					dp[i] = dp[i-coin] + 1
				}
			}
		}
	}
	if dp[aim] != 6000 {
		return dp[aim]
	}
	return -1
}
