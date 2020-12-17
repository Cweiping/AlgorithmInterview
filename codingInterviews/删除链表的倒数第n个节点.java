
import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

/**
 * 题目描述
 * 给定一个链表，删除链表的倒数第n个节点并返回链表的头指针
 * 例如，
 * 给出的链表为:1->2->3->4->5, n= 2.
 * 删除了链表的倒数第n个节点之后,链表变为1->2->3->5.
 * 备注：
 * 题目保证n一定是有效的
 * 请给出请给出时间复杂度为\ O(n) O(n)的算法
 * <p>
 * 示例1
 * 输入
 * {1,2},2
 * 返回值
 * {2}
 */
public class Solution {
    /**
     * @param head ListNode类
     * @param n    int整型
     * @return ListNode类
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ahead = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while (ahead != null) {
            arr.add(ahead.val);
            ahead = ahead.next;
        }
        if (arr.size() == n) {
            return head.next;
        }
        ahead = head;
        for (int i = 0; i < arr.size() - n - 1; i++) {
            ahead = ahead.next;
        }
        ahead.next = ahead.next.next;
        return head;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode preHead = new ListNode(-1);        // 生成前置节点
        preHead.next = head;
        int len = 0;        // 获取总node数量
        while (head != null) {
            len++;
            head = head.next;
        }
        if (len == n) {
            return preHead.next.next;
        }         // 相等则直接返回下一个node
        head = preHead.next;
        for (int i = 0; i < len - n - 1; i++) {        // 获取倒数第n-1个node
            head = head.next;
        }
        head.next = head.next.next;        //删除倒数第n个node
        return preHead.next;
    }
}