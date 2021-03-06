import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

/**
 * 题目描述
 * 将两个有序的链表合并为一个新链表，要求新的链表是通过拼接两个链表的节点来生成的，且合并后新链表依然有序。
 *
 * 示例1
 * 输入
 * {1},{2}
 * 返回值
 * {1,2}
 * 示例2
 * 输入
 * {2},{1}
 * 返回值
 * {1,2}
 */
public class Solution {
    /**
     *
     * @param l1 ListNode类
     * @param l2 ListNode类
     * @return ListNode类
     */
    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        // 设置前驱节点,避免丢失 head
        ListNode preHead = new ListNode(-1);
        ListNode head= preHead;
        while(l1!=null&&l2!=null){
            if(l1.val>l2.val){
                head.next= l2;
                l2=l2.next;
            }else {
                head.next= l1;
                l1=l1.next;
            }
            head=head.next;
        }
        if(l1!=null){ head.next=l1;}
        if(l2!=null){ head.next=l2;}
        return preHead.next;
    }
}