package codingInterviews

/**
 *
 * @param matrix int整型二维数组 the matrix
 * @return int整型
 */
func minPathSum(matrix [][]int) int {
	n := len(matrix)
	m := len(matrix[0])
	for i := 1; i < n; i++ {
		matrix[i][0] += matrix[i-1][0]
		for j := 1; j < m; j++ {
			matrix[0][j] += matrix[0][j-1]
			if matrix[i-1][j] > matrix[i][j-1] {
				matrix[i][j] += matrix[i][j-1]
			} else {
				matrix[i][j] += matrix[i-1][j]
			}
		}
	}
	return matrix[n-1][m-1]
}
