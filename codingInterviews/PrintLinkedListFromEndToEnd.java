/**
 *    public class ListNode {
 *        int val;
 *        ListNode next = null;
 *
 *        ListNode(int val) {
 *            this.val = val;
 *        }
 *    }
 *
 */
/**
 *
 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 示例1
 输入
 {67,0,24,58}
 返回值
 [58,24,0,67]
 */

import java.util.*;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack stack =new Stack();
        ArrayList result = new ArrayList<String>();
        if (listNode==null){
            return result;
        }
        stack.push(listNode.val);
        while (listNode.next!=null){
            listNode=listNode.next;
            stack.push(listNode.val);
        }
        while (!stack.empty()){
            result.add(stack.pop());
        }
        return result;
    }
}