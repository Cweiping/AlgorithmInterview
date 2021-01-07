package code_go

import "sort"
import "strconv"

/**
 * 最大数
 * @param nums int整型一维数组
 * @return string字符串
 */
/*题目描述
给定一个数组由一些非负整数组成，现需要将他们进行排列并拼接，使得最后的结果最大，返回值需要是string类型 否则可能会溢出
示例1
输入
复制
[30,1]
返回值
复制
"301"*/
func solve(nums []int) string {
	sort.Slice(nums, func(i, j int) bool {
		numstr1 := strconv.Itoa(nums[i])
		numstr2 := strconv.Itoa(nums[j])
		l1 := len(numstr1)
		l2 := len(numstr2)
		l := l1
		if l1 < l2 {
			l = l2
		}
		for i := 0; i < l; i++ {
			ch1 := getNext(i, numstr1)
			ch2 := getNext(i, numstr2)
			if ch1 < ch2 {
				return false
			} else if ch1 > ch2 {
				return true
			}
		}
		return true
	})
	result := ""
	for _, n := range nums {
		result += strconv.Itoa(n)
	}
	if len(result) == 0 || result[0] == '0' {
		return "0"
	}
	return result
}
func getNext(i int, s string) byte {
	n := len(s)
	if i < n {
		return s[i]
	}
	return s[n-1]
}
