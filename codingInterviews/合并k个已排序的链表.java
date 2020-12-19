/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */

import java.util.*;

/**
 * 题目描述
 * 合并\ k k 个已排序的链表并将其作为一个已排序的链表返回。分析并描述其复杂度。
 * 示例1
 * 输入
 * [{1,2,3},{4,5,6,7}]
 * 返回值
 * {1,2,3,4,5,6,7}
 */
public class Solution {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if (lists == null | lists.size() == 0) return null;
        PriorityQueue<ListNode> queue = new PriorityQueue(lists.size(), new Comparator<ListNode>() {
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        ListNode preHead = new ListNode(-1);
        ListNode head = preHead;
        for (ListNode node : lists)
            if (node != null) queue.offer(node);
        while (queue.size() > 0) {
            head.next = queue.poll();
            head = head.next;
            if (head.next != null) queue.offer(head.next);
        }
        return preHead.next;
    }
}