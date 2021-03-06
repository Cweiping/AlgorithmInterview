# -*- coding:utf-8 -*-
'''
题目描述
有一个NxN整数矩阵，请编写一个算法，将矩阵顺时针旋转90度。

给定一个NxN的矩阵，和矩阵的阶数N,请返回旋转后的NxN矩阵,保证N小于等于300。

示例1
输入
[[1,2,3],[4,5,6],[7,8,9]],3
返回值
[[7,4,1],[8,5,2],[9,6,3]]
'''
class Rotate:
        '''
        123                     789                741
        456     (mat[::-1])->   456  ->zip(*mat)   852
        789                     123                963
        '''
        def rotateMatrix(self, mat, n):
        return zip(*mat[::-1])