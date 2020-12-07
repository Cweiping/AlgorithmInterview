package main

/**
 *
 * @param numbers int整型一维数组
 * @param target int整型
 * @return int整型一维数组
 */
/**
题目描述
给出一个整数数组，请在数组中找出两个加起来等于目标值的数，
你给出的函数twoSum 需要返回这两个数字的下标（index1，index2），需要满足 index1 小于index2.。注意：下标是从1开始的
假设给出的数组中只存在唯一解
例如：
给出的数组为 {20, 70, 110, 150},目标值为90
输出 index1=1, index2=2


示例1
输入
[3,2,4],6
返回值
[2,3]
*/
func twoSum(numbers []int, target int) []int {
	m := make(map[int]int)
	m[numbers[0]] = 0
	for i := 1; i < len(numbers); i++ {
		index, ok := m[target-numbers[i]]
		if ok {
			result := make([]int, 0)
			return append(result, index+1, i+1)
		} else {
			m[numbers[i]] = i
		}
	}
	return nil
}
