package code_go

/**
题目描述
请实现有重复数字的升序数组的二分查找。
输出在数组中第一个大于等于查找值的位置，如果数组中不存在这样的数，则输出数组长度加一。
示例1
输入
5,4,[1,2,4,4,5]
返回值
3
说明
输出位置从1开始计算
*/
/**
 * 二分查找
 * @param n int整型 数组长度
 * @param v int整型 查找值
 * @param a int整型一维数组 有序数组
 * @return int整型
 */
func upper_bound_(n int, v int, a []int) int {
	left, right := 0, n
	for left < right {
		mid := (right + left) / 2
		if a[mid] < v {
			left = mid + 1
		} else {
			right = mid
		}
	}
	return left + 1
}
