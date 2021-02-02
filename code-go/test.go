package code_go

import "math"

// 给定一组字符串 从中找出最长不含有重复字符串的子串
// input : "aabccd"
// output: "abc"

func getMaxSubStr(str string) string {
	dp := make([]int, len(str)+1)
	m := make(map[byte]bool, 0)
	maxLen := math.MinInt64
	start := 0
	dp[0] = 1
	for i := 1; i < len(str); i++ {
		key := str[i]
		_, ok := m[key]
		if !ok {
			m[key] = true
		} else {
			start++
			if maxLen < i-start {
				maxLen = i - start
			}
		}
	}
	return str[start : start+maxLen]
}
