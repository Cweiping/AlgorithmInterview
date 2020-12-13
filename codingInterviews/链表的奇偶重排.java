import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

/**
 * 题目描述
 * 给定一个单链表，请设定一个函数，讲链表的奇数位节点和偶数位节点分别放在一起，重排后输出。
 * 注意是节点的编号而非节点的数值。
 *
 * 示例1
 * 输入
 * {1,2,3,4,5,6}
 * 返回值
 * {1,3,5,2,4,6}
 * 示例2
 * 输入
 * {1,4,6,3,7}
 * 复制
 * {1,6,7,4,3}
 * 奇数节点有1,6,7，偶数节点有4,3。重排后为1,6,7,4,3
 *
 */
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param head ListNode类
     * @return ListNode类
     */
    public ListNode oddEvenList (ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode h =head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(h!=null){
            arr.add(h.val);
            h=h.next;
        }
        h=head;
        for (int i=0;i<arr.size();i=i+2){
            h.val=arr.get(i);
            h=h.next;
        }
        for (int i=1;i<arr.size();i=i+2){
            h.val=arr.get(i);
            h=h.next;
        }
        return head;
    }
}