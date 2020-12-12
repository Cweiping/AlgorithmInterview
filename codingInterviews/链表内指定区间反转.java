import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

/**
 * 题目描述
 * 将一个链表\ m m 位置到\ n n 位置之间的区间反转，要求时间复杂度 ，空间复杂度 。
 * 例如：
 * 给出的链表为 1\to 2 \to 3 \to 4 \to 5 \to NULL1→2→3→4→5→NULL, ，,
 * 返回 1\to 4\to 3\to 2\to 5\to NULL1→4→3→2→5→NULL.
 * 注意：
 * 给出的 满足以下条件：
 * 1 \leq m \leq n \leq 链表长度1≤m≤n≤链表长度
 * 示例1
 * 输入
 * {1,2,3,4,5},2,4
 * 返回值
 * {1,4,3,2,5}
 */
public class Solution {
    /**
     *
     * @param head ListNode类
     * @param m int整型
     * @param n int整型
     * @return ListNode类
     */
    public ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here
        ListNode preRoot = new ListNode(-1);
        preRoot.next=head;
        ListNode pre = preRoot;
        ListNode cur = head;
        for (int i=1;i<m;i++){pre=cur;cur=cur.next;}
        for (int i=m;i<n;i++){
            ListNode tmp=cur.next;
            cur.next=tmp.next;
            tmp.next=pre.next;
            pre.next=tmp;

        }
        return preRoot.next;
    }
}