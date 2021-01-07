package code_go

/**
题目描述
以字符串的形式读入两个数字，编写一个函数计算它们的乘积，以字符串形式返回。
（字符串长度不大于10000，保证字符串仅由'0'~'9'这10种字符组成）
示例1
输入
复制
"11","99"
返回值
复制
"1089"
说明
11*99=1089
*/
/**
 * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
 *
 * @param s string字符串 第一个整数
 * @param t string字符串 第二个整数
 * @return string字符串
 */
func solve(s string, t string) string {
	res := make([]int, len(s)+len(t))
	for i := len(s) - 1; i >= 0; i-- {
		for j := len(t) - 1; j >= 0; j-- {
			sum := int(s[i]-'0')*int(t[j]-'0') + res[i+j+1]
			res[i+j+1] = sum % 10
			res[i+j] += sum / 10
		}
	}
	result := []byte{}
	for i := 0; i < len(res); i++ {
		if i == 0 && res[i] == 0 {
			continue
		}
		result = append(result, byte(res[i]+'0'))
	}
	return string(result)
}
