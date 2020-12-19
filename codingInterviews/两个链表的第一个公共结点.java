/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
/**
 * 题目描述
 * 输入两个链表，找出它们的第一个公共结点。（注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
 */

import java.util.*;
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        while(pHead1!=null){
            ListNode p2 = pHead2;
            while(p2!=null){
                if (p2==pHead1){ return pHead1; }
                p2=p2.next;
            }
            pHead1=pHead1.next;
        }
        return null;
    }
}