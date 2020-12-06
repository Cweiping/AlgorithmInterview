/**
 * 题目描述
 * 输入一个链表，反转链表后，输出新链表的表头。
 * 示例1
 * 输入
 * {1,2,3}
 * 返回值
 * {3,2,1}
 */
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
import java.util.*;
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if (head==null){
            return null;
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(head.val);

        while(head.next!=null){
            head=head.next;
            arr.add(head.val);
        }
        ListNode root = new ListNode(arr.get(arr.size()-1).intValue());
        ListNode tmp= root;
        for (int i=arr.size()-2;i>=0;i--){
            tmp.next= new ListNode(arr.get(i).intValue());
            tmp=tmp.next;
        }
        return root;
    }
}