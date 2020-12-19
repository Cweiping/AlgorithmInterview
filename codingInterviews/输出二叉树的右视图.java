import java.util.*;

/**
 * 题目描述
 * 请根据二叉树的前序遍历，中序遍历恢复二叉树，并打印出二叉树的右视图
 * <p>
 * 示例1
 * 输入
 * [1,2,4,5,3],[4,2,5,1,3]
 * 返回值
 * [1,3,5]
 * 备注:
 * 二叉树每个节点的值在区间[1,10000]内，且保证每个节点的值互不相同。
 */
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 求二叉树的右视图
     *
     * @param xianxu int整型一维数组 先序遍历
     * @param zhongxu int整型一维数组 中序遍历
     * @return int整型一维数组
     */
    private ArrayList<Integer> result = new ArrayList<>();

    public int[] solve(int[] xianxu, int[] zhongxu) {
        TreeNode root = each(xianxu, zhongxu);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (queue.size() > 0) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                if (i == len - 1) result.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public TreeNode each(int[] xianxu, int[] zhongxu) {
        if (xianxu.length == 0 || zhongxu.length == 0) return null;
        TreeNode root = new TreeNode(xianxu[0]);
        for (int i = 0; i < zhongxu.length; i++) {
            if (xianxu[0] == zhongxu[i]) {
                root.left = each(Arrays.copyOfRange(xianxu, 1, i + 1), Arrays.copyOfRange(zhongxu, 0, i));
                root.right = each(Arrays.copyOfRange(xianxu, i + 1, xianxu.length), Arrays.copyOfRange(zhongxu, i + 1, zhongxu.length));
            }
        }
        return root;
    }
}