import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

/**
 * 题目描述
 * 给定一个无序单链表，实现单链表的排序(按升序排序)。
 * 示例1
 * 输入
 * [1,3,2,4,5]
 * 返回值
 * {1,2,3,4,5}
 */
public class Solution {
    /**
     *
     * @param head ListNode类 the head node
     * @return ListNode类
     */
    public ListNode sortInList (ListNode head) {
        // write code here
        if (head==null|| head.next==null){
            return head;
        }
        ArrayList<Integer> array = new ArrayList<>();
        while(head!=null){
            array.add(head.val);
            head=head.next;
        }
        array.sort(Comparator.naturalOrder());
        ListNode root = new ListNode(array.get(0));
        ListNode h = root;
        for (int i=0;i<array.size();i++){
            h.next=new ListNode(array.get(i));
            h=h.next;
        }
        return root.next;
    }
}