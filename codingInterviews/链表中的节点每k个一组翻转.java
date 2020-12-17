import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

/**
 * 题目描述
 * 将给出的链表中的节点每\ k k 个一组翻转，返回翻转后的链表
 * 如果链表中的节点数不是\ k k 的倍数，将最后剩下的节点保持原样
 * 你不能更改节点中的值，只能更改节点本身。
 * 要求空间复杂度 \ O(1) O(1)
 * 例如：
 * 给定的链表是1\to2\to3\to4\to51→2→3→4→5
 * 对于 \ k = 2 k=2, 你应该返回 2\to 1\to 4\to 3\to 52→1→4→3→5
 * 对于 \ k = 3 k=3, 你应该返回 3\to2 \to1 \to 4\to 53→2→1→4→5
 */
public class Solution {
    /**
     * @param head ListNode类
     * @param k    int整型
     * @return ListNode类
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) return head;
        ListNode preRoot = new ListNode(-1);
        preRoot.next = head;
        ListNode next = null, tmp = head, cur = head;
        for (int i = 1; i < k; i++) {
            cur = cur.next;
            if (cur == null)
                return head;
        }
        next = cur.next;
        while (head.next != next) {
            tmp = head.next;
            head.next = tmp.next;
            tmp.next = preRoot.next;
            preRoot.next = tmp;
        }
        head.next = reverseKGroup(next, k);
        return preRoot.next;
    }
}