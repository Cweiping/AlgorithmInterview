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
 * 判断给定的链表中是否有环。如果有环则返回true，否则返回false。
 * 扩展：
 * 你能给出空间复杂度的解法么？
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head==null){
            return false;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }
}