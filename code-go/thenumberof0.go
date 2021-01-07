package code_go

/*题目描述
给定一个非负整数N，返回N!结果的末尾为0的数量
示例1
输入
复制
3
返回值
复制
0
说明
3!=6
示例2
输入
复制
5
返回值
复制
1
说明
5!=120
示例3
输入
复制
1000000000
返回值
复制
249999998*/
/**
 * the number of 0
 * @param n long长整型 the number
 * @return long长整型
 */
func thenumberof0(n int64) int64 {
	result := int64(0)
	for i := int64(5); i <= n; {
		result += n / i
		i *= 5
	}
	return result
}
