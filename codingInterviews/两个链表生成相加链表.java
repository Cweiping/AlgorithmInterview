import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

/**
 * 题目描述
 * 假设链表中每一个节点的值都在 0 - 9 之间，那么链表整体就可以代表一个整数。
 * 给定两个这种链表，请生成代表两个整数相加值的结果链表。
 * 例如：链表 1 为 9->3->7，链表 2 为 6->3，最后生成新的结果链表为 1->0->0->0。
 * 示例1
 * 输入
 * [9,3,7],[6,3]
 * 返回值
 * {1,0,0,0}
 */
public class Solution {
    /**
     *
     * @param head1 ListNode类
     * @param head2 ListNode类
     * @return ListNode类
     */
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        Stack<Integer>  stack1 =new Stack<>();
        while(head1!=null){
            stack1.push(head1.val);
            head1=head1.next;
        }
        Stack<Integer>  stack2 =new Stack<>();
        while(head2!=null){
            stack2.push(head2.val);
            head2=head2.next;
        }
        ListNode root=null;
        int out = 0;
        while(stack1.size()>0||stack2.size()>0||out!=0){
            int s1 = stack1.size()>0? stack1.pop():0;
            int s2 = stack2.size()>0? stack2.pop():0;
            ListNode tmp= new ListNode((s1+s2+out)%10);
            out=(s1+s2+out)/10;
            tmp.next=root;
            root=tmp;
        }
        return root;
    }
}