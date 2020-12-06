/**
 * 题目描述
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *
 * 比如n=3时，2*3的矩形块有3种覆盖方法：
 *
 * 示例1
 * 输入
 * 4
 * 返回值
 * 5
 */
public class Solution {
    public int RectCover(int target) {
        if (target<=3){
            return target;
        }
        return RectCover(target-2)+RectCover(target-1);
    }
}