package code_go

/**
题目描述
给定两个字符串str1和str2,输出两个字符串的最长公共子串，如果最长公共子串为空，输出-1。
示例1
输入
"1AB2345CD","12345EF"
返回值
"2345"
*/
func LCS(str1 string, str2 string) string {
	if len(str1) == 0 || len(str2) == 0 {
		return "-1"
	}
	max := 0
	idx := -1
	dp := make([][]int, len(str1)+1)
	for i := range dp {
		dp[i] = make([]int, len(str2)+1)
	}
	for i := 1; i < len(str1)+1; i++ {
		for j := 1; j < len(str2)+1; j++ {
			if str1[i-1] == str2[j-1] {
				dp[i][j] = dp[i-1][j-1] + 1
				if max < dp[i][j] {
					max = dp[i][j]
					idx = i
				}
			}
		}
	}
	if max == 0 {
		return "-1"
	}
	return str1[idx-max : idx]
}
