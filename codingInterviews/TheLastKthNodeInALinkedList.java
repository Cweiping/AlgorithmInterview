/**
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 示例1
 * 输入
 * 1,{1,2,3,4,5}
 * 返回值
 * {5}
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
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head==null){
            return null;
        }
        ArrayList arr = new ArrayList<Integer>();
        arr.add(head.val);
        ListNode node= head;
        while(node.next!=null){
            node=node.next;
            arr.add(node.val);
        }
        if (arr.size()<k){
            return null;
        }
        for (int i=0;i<arr.size()-k;i++){
            head=head.next;
        }
        return head;
    }
}