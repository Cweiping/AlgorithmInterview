import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

/**
 * 题目描述
 * 给定一个链表，请判断该链表是否为回文结构。
 * 示例1
 * 输入
 * [1,2,2,1]
 * 返回值
 * true
 */
public class Solution {
    /**
     *
     * @param head ListNode类 the head
     * @return bool布尔型
     */
    public boolean isPail (ListNode head) {
        // write code here
        ArrayList<Integer> arr = new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        if (arr.size()<3){
            return true;
        }
        int left=0;
        int right= arr.size()-1;
        while(left<right){
            if (arr.get(left)==arr.get(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}