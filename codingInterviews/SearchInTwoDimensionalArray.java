/**
 * 题目描述
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 示例1
 * 输入
 * 7,[[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]]
 * 返回值
 * true
 */
public class Solution {
    /**
     * 从右上角开始遍历，类似二叉树，left表示向左，down表示向下
     * @param target
     * @param array
     * @return
     */
    public boolean Find(int target, int[][] array) {
        if (array.length == 0) {
            return false;
        }
        int left = array[0].length - 1;
        int down = 0;
        for (; left >= 0 && down < array.length; ) {
            if (array[down][left] == target) {
                return true;
            } else if (array[down][left] > target) {
                left--;
            } else if (array[down][left] < target) {
                down++;
            }
        }
        return false;
    }
}