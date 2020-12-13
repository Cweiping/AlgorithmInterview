/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

/**
 * 题目描述
 * 将给定的单链表\ L L： L_0→L_1→…→L_{n-1}→L_ nL
 * 重新排序为： L： L_0→L_1→…→L_{n-1}→L_ nL
 * 要求使用原地算法，不能改变节点内部的值，需要对实际的节点进行交换。
 * 例如：
 * 对于给定的单链表{10,20,30,40}，将其重新排序为{10,40,20,30}.
 */
public class Solution {
    public void reorderList(ListNode head) {
        if (head==null||head.next==null){
            return;
        }
        ListNode h = head;
        while(h.next!=null&&h.next.next!=null){
            h=h.next;
        }
        ListNode tmp = h.next;
        h.next=null;
        tmp.next=head.next;
        head.next=tmp;
        reorderList(head.next.next);
    }
}