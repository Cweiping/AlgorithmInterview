package code_go

/**
题目描述
一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
示例1
输入
1
返回值
1
示例2
输入
4
返回值
5
*/
func jumpFloor(number int) int {
	if number < 3 {
		return number
	}
	l1, l2 := 2, 1
	for i := 3; i < number; i++ {
		tmp := l2
		l2 = l1
		l1 = tmp + l1
	}
	return l1 + l2
}
