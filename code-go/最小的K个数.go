package code_go

/**
题目描述
输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
示例1
输入
[4,5,1,6,2,7,3,8],4
返回值
[1,2,3,4]
*/
func GetLeastNumbers_Solution(input []int, k int) []int {
	if k > len(input) {
		return nil
	}
	for i := 0; i < k; i++ {
		for j := i + 1; j < len(input); j++ {
			if input[i] > input[j] {
				tmp := input[i]
				input[i] = input[j]
				input[j] = tmp
			}
		}
	}
	return input[0:k]
}
