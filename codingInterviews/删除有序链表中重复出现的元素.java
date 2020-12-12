import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

/**
 * 题目描述
 * 给出一个升序排序的链表，删除链表中的所有重复出现的元素，只保留原链表中只出现一次的元素。
 * 例如：
 * 给出的链表为1 \to 2\to 3\to 3\to 4\to 4\to51→2→3→3→4→4→5, 返回1\to 2\to51→2→5.
 * 给出的链表为1\to1 \to 1\to 2 \to 31→1→1→2→3, 返回2\to 32→3.
 *
 * 示例1
 * 输入
 * {1,2,2}
 * 返回值
 * {1}
 */
public class Solution {
    /**
     *
     * @param head ListNode类
     * @return ListNode类
     */
    public ListNode deleteDuplicates (ListNode head) {
        // write code here
        if (head==null||head.next==null) return head;
        ListNode preRoot = new ListNode(head.val-1);
        preRoot.next=head;
        ListNode cur=head;
        ListNode pre = preRoot;
        while(cur!=null&&cur.next!=null){
            if (cur.val!=cur.next.val){
                pre=pre.next;
            }else{
                while(cur.next!=null&&cur.val==cur.next.val)
                    cur = cur.next;
                pre.next=cur.next;
            }
            cur=cur.next;
        }
        return preRoot.next;
    }
}