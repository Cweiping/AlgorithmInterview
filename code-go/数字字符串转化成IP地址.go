package code_go

/**
题目描述
现在有一个只包含数字的字符串，将该字符串转化成IP地址的形式，返回所有可能的情况。
例如：
给出的字符串为"25525522135",
返回["255.255.22.135", "255.255.221.35"]. (顺序没有关系)
示例1
输入
"25525522135"
返回值
["255.255.22.135","255.255.221.35"]
*/
func restoreIpAddresses(s string) []string {
	var result []string
	backrack(s, "", 0, 0, &result)
	return result
}

func backrack(s string, tmp string, count, idx int, res *[]string) {
	if count == 3 {
		if check(s, idx, len(s)) {
			tmp += s[idx:]
			*res = append(*res, tmp)
		}
		return
	}
	for i := 1; i <= 3; i++ {
		if check(s, idx, idx+i) {
			backrack(s, tmp+s[idx:idx+i]+".", count+1, idx+i, res)
		}
	}
}

func check(bs string, i, j int) bool {
	if j-i > 3 || j-i <= 0 {
		return false
	}
	var v int
	for k := i; k < j; k++ {
		if k >= len(bs) {
			return false
		}
		if bs[k] < '0' || bs[k] > '9' {
			return false
		}
		if k == i+1 && v == 0 {
			return false
		}
		v = v*10 + int(bs[k]-'0')
		if v > 255 {
			return false
		}
	}
	return true
}
