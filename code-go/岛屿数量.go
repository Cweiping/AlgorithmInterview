package code_go

/**
题目描述
给一个01矩阵，1代表是陆地，0代表海洋， 如果两个1相邻，那么这两个1属于同一个岛。我们只考虑上下左右为相邻。
岛屿: 相邻陆地可以组成一个岛屿（相邻:上下左右） 判断岛屿个数。
示例1
输入
[[1,1,0,0,0],[0,1,0,1,1],[0,0,0,1,1],[0,0,0,0,0],[0,0,1,1,1]]
返回值
3
备注:
01矩阵范围<=200*200
*/
func solve(grid [][]byte) int {
	land := 0
	for i := 0; i < len(grid); i++ {
		for j := 0; j < len(grid[0]); j++ {
			if grid[i][j] == '1' {
				land++
				backrack(grid, i, j)
			}
		}
	}
	return land
}

func backrack(grid [][]byte, x, y int) {
	grid[x][y] = '0'
	if y-1 >= 0 && grid[x][y-1] != '0' {
		backrack(grid, x, y-1)
	}
	if y+1 < len(grid[0]) && grid[x][y+1] != '0' {
		backrack(grid, x, y+1)
	}
	if x-1 >= 0 && grid[x-1][y] != '0' {
		backrack(grid, x-1, y)
	}
	if x+1 < len(grid) && grid[x+1][y] != '0' {
		backrack(grid, x+1, y)
	}
}
