import java.util.*;

/**
 * 题目描述
 * 给一个01矩阵，1代表是陆地，0代表海洋， 如果两个1相邻，那么这两个1属于同一个岛。我们只考虑上下左右为相邻。
 * 岛屿: 相邻陆地可以组成一个岛屿（相邻:上下左右） 判断岛屿个数。
 * 示例1
 * 输入
 * [[1,1,0,0,0],[0,1,0,1,1],[0,0,0,1,1],[0,0,0,0,0],[0,0,1,1,1]]
 * 返回值
 * 3
 */
public class Solution {
    /**
     * 判断岛屿数量
     *
     * @param grid char字符型二维数组
     * @return int整型
     */
    public int solve(char[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    result++;
                    dfs(grid, i, j);
                }
            }
        }
        return result;
    }

    public void dfs(char[][] grid, int i, int j) {
        grid[i][j] = '0';
        if (i > 0 && grid[i - 1][j] == '1') dfs(grid, i - 1, j);
        else if (i < grid.length - 1 && grid[i + 1][j] == '1') dfs(grid, i + 1, j);
        else if (j < grid[0].length - 1 && grid[i][j + 1] == '1') dfs(grid, i, j + 1);
        else if (j > 0 && grid[i][j - 1] == '1') dfs(grid, i, j - 1);
    }
}