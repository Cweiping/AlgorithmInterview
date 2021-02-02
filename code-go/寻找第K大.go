package code_go

/**
题目描述
有一个整数数组，请你根据快速排序的思路，找出数组中第K大的数。

给定一个整数数组a,同时给定它的大小n和要找的K(K在1到n之间)，请返回第K大的数，保证答案存在。

示例1
输入
[1,3,5,2,2],5,3
返回值
2
*/
func findKth(a []int, n int, K int) int {
	quickSort(a, 0, n-1)
	return a[K-1]
}

func quickSort(arr []int, start int, end int) {
	if start < end {
		i, j := start, end
		mid := arr[(start+end)/2]
		for i <= j {
			for arr[i] > mid {
				i++
			}
			for arr[j] < mid {
				j--
			}
			if i <= j {
				arr[i], arr[j] = arr[j], arr[i]
				i++
				j--
			}
		}
		quickSort(arr, start, j)
		quickSort(arr, i, end)

	}
}
