package code_go

/*题目描述
给出一个仅包含字符'('和')'的字符串，计算最长的格式正确的括号子串的长度。
对于字符串"(()"来说，最长的格式正确的子串是"()"，长度为2.
再举一个例子：对于字符串")()())",来说，最长的格式正确的子串是"()()"，长度为4.
示例1
输入
复制
"(()"
返回值
复制
2*/
/**
 *
 * @param s string字符串
 * @return int整型
 */
func longestValidParentheses(s string) int {
	l := len(s)
	dp := make([]int, l)
	max := 0
	for i := 1; i < l; i++ {
		if s[i] == ')' {
			prev := i - 1 - dp[i-1]
			if prev >= 0 && s[prev] == '(' {
				dp[i] = dp[i-1] + 2
				if prev-1 >= 0 {
					dp[i] += dp[prev-1]
				}
			}
			if max < dp[i] {
				max = dp[i]
			}
		}
	}
	return max
}
