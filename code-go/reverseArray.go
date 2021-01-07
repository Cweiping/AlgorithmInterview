package code_go

/*题目描述
一个数组A中存有N（N&gt0）个整数，在不允许使用另外数组的前提下，将每个整数循环向右移M（M>=0）个位置，即将A中的数据由（A0 A1 ……AN-1 ）变换为（AN-M …… AN-1 A0 A1 ……AN-M-1 ）（最后M个数循环移至最前面的M个位置）。如果需要考虑程序移动数据的次数尽量少，要如何设计移动的方法？
示例1
输入
复制
6,2,[1,2,3,4,5,6]
返回值
复制
[5,6,1,2,3,4]
备注:
(1<=N<=100,M>=0)*/

func solve(n int, m int, a []int) []int {
	m = m % n
	if m == 0 {
		return a
	}
	reverse(a, 0, n-m-1)
	reverse(a, n-m, n-1)
	reverse(a, 0, n-1)
	return a
}
func reverse(a []int, left, right int) {
	for left < right {
		tmp := a[left]
		a[left] = a[right]
		a[right] = tmp
		left++
		right--
	}
}
