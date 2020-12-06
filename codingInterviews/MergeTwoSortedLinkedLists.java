/**
 * 题目描述
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * 示例1
 * 输入
 * {1,3,5},{2,4,6}
 * 返回值
 * {1,2,3,4,5,6}
 */
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null){
            return list2;
        }else if(list2==null){
            return list1;
        }
        ListNode root = new ListNode(list1.val);
        list1=list1.next;
        ListNode tmp =root;
        while(list1!=null&& list2!=null){
            if(list1.val<list2.val){
                tmp.next= new ListNode(list1.val);
                tmp=tmp.next;
                list1=list1.next;
            }else{
                tmp.next= new ListNode(list2.val);
                tmp=tmp.next;
                list2=list2.next;
            }
        }
        if(list1!=null){
            tmp.next=list1;
        }else{
            tmp.next=list2;
        }
        return root;
    }
}