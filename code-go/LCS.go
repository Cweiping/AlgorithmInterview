package code_go

/**
最长公共子序列
 *题目描述
给定两个字符串str1和str2，输出连个字符串的最长公共子序列。如过最长公共子序列为空，则输出-1。
示例1
输入
复制
"1A2C3D4B56","B1D23CA45B6A"
返回值
复制
"123456"
说明
"123456"和“12C4B6”都是最长公共子序列，任意输出一个。
*/
func LCS(s1 string, s2 string) string {
	dp := make([][]int, len(s1)+1)
	for i := 0; i < len(s1)+1; i++ {
		dp[i] = make([]int, len(s2)+1)
	}
	for i := 1; i < len(s1)+1; i++ {
		for j := 1; j < len(s2)+1; j++ {
			if dp[i-1][j] > dp[i][j-1] {
				dp[i][j] = dp[i-1][j]
			} else {
				dp[i][j] = dp[i][j-1]
			}
			if s1[i-1] == s2[j-1] {
				dp[i][j] += 1
			}
		}
	}
	result := ""
	idx := 1
	idxRow := 1
	idxCol := 1
	for i := 1; i <= len(s1); i++ {
		for j := 1; j <= len(s2); j++ {
			if idx == dp[i][j] && idxCol < i && idxRow < j {
				result += string(s2[j-1])
				idxRow = j
				idxCol = i
				idx++
			}
		}
	}
	return result
}
