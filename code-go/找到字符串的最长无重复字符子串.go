package code_go

/**
题目描述
给定一个数组arr，返回arr的最长无的重复子串的长度(无重复指的是所有数字都不相同)。
示例1
输入
[2,3,4,5]
返回值
4
示例2
输入
[2,2,3,4,3]
返回值
3
*/
func maxLength(arr []int) int {
	result := 1
	m := make(map[int]int, 0)
	for left, right := 0, 1; right < len(arr); {
		key := arr[right]
		if _, ok := m[key]; !ok {
			m[key] = right
			right++
			result = max(right-left, result)
		} else {
			delete(m, arr[left])
			left++
		}
	}
	return result
}
