#
        #
        # @param matrix int整型二维数组
        # @return int整型一维数组
        #
'''
题目描述
给定一个m x n大小的矩阵（m行，n列），按螺旋的顺序返回矩阵中的所有元素。
示例1
输入
[[1,2,3],[4,5,6],[7,8,9]]
返回值
[1,2,3,6,9,8,7,4,5]
'''
class Solution:
        def spiralOrder(self , matrix ):
        res = []
        while matrix:
        res += matrix.pop(0)
        matrix = list(zip(*matrix))[::-1]
        return res