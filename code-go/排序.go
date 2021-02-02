package code_go

/*
题目描述
给定一个数组，请你编写一个函数，返回该数组排序后的形式。
示例1
输入
[5,2,3,1,4]
返回值
[1,2,3,4,5]
示例2
输入
[5,1,6,2,5]
返回值
[1,2,5,5,6]
备注:
数组的长度不大于100000，数组中每个数的绝对值不超过10^910
9*/
func MySort(arr []int) []int {
	quartSort(arr, 0, len(arr)-1)
	return arr
}
func quartSort(arr []int, left, right int) {
	mid := getMid(arr, left, right)
	if left < mid-1 {
		quartSort(arr, left, mid-1)
	}
	if right > mid+1 {
		quartSort(arr, mid+1, right)
	}
}

func getMid(arr []int, left, right int) int {
	mid := arr[left]
	for left < right {
		for arr[right] >= mid && left < right {
			right--
		}
		arr[left] = arr[right]
		for arr[left] < mid && left < right {
			left++
		}
		arr[right] = arr[left]
	}
	arr[left] = mid
	return left
}
