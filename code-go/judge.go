package code_go

/**
题目描述
给定一个字符串，请编写一个函数判断该字符串是否回文。如果回文请返回true，否则返回false。
示例1
输入
复制
"absba"
返回值
复制
true
示例2
输入
复制
"ranko"
返回值
复制
false
示例3
输入
复制
"yamatomaya"
返回值
false
 * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
 *
 * @param str string字符串 待判断的字符串
 * @return bool布尔型
*/
func judge(str string) bool {
	left := 0
	right := len(str) - 1
	for left < right {
		if str[left] != str[right] {
			return false
		}
		left++
		right--
	}
	return true
}
