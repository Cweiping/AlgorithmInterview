package code_go

func solve(n int, k int) int {
	if n < 0 || k < 1 {
		return 0
	}
	dp := make([]int, k+1)
	var m int
	//     K个棋子可以扔M次
	//     计算出k个棋子的最大楼层数
	for m = 1; dp[k] < n; m++ {
		for j := k; j > 0; j-- {
			dp[j] = dp[j] + dp[j-1] + 1
		}
	}
	return m - 1
}
