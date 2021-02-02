package code_go

/**
题目描述
给定一个链表，删除链表的倒数第n个节点并返回链表的头指针
例如，
 给出的链表为:1->2->3->4->5, n= 2.
 删除了链表的倒数第n个节点之后,链表变为1->2->3->5.
备注：
题目保证n一定是有效的
请给出请给出时间复杂度为\ O(n) O(n)的算法

示例1
输入
{1,2},2
返回值
{2}
*/
func removeNthFromEnd(head *ListNode, n int) *ListNode {
	preHead := &ListNode{}
	slow, fast := preHead, preHead
	preHead.Next = head
	for i := 0; i <= n; i++ {
		fast = fast.Next
	}
	for fast != nil {
		fast = fast.Next
		slow = slow.Next
	}
	slow.Next = slow.Next.Next
	return preHead.Next
}
