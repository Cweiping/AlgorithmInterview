package code_go

/**
905. 按奇偶排序数组
给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。

你可以返回满足此条件的任何数组作为答案。



示例：

输入：[3,1,2,4]
输出：[2,4,3,1]
输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。


提示：

1 <= A.length <= 5000
0 <= A[i] <= 5000
https://leetcode-cn.com/problems/sort-array-by-parity/
*/

func sortArrayByParity(A []int) []int {
	left := 0
	right := len(A) - 1
	for left < right {
		if A[left]%2 == 0 {
			left++
		} else if A[right]%2 == 1 {
			right--
		} else if A[left]%2 == 1 && A[right]%2 == 0 {
			tmp := A[left]
			A[left] = A[right]
			A[right] = tmp
			left++
			right--
		}
	}
	return A
}
