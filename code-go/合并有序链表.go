package code_go

/**
题目描述
将两个有序的链表合并为一个新链表，要求新的链表是通过拼接两个链表的节点来生成的，且合并后新链表依然有序。

示例1
输入
{1},{2}
返回值
{1,2}
*/
func mergeTwoLists2(l1 *ListNode, l2 *ListNode) *ListNode {
	Prehead := &ListNode{}
	cur := Prehead
	for l1 != nil && l2 != nil {
		if l1.Val < l2.Val {
			cur.Next = l1
			l1 = l1.Next
		} else {
			cur.Next = l2
			l2 = l2.Next
		}
		cur = cur.Next
	}
	if l1 != nil {
		cur.Next = l1
	}
	if l2 != nil {
		cur.Next = l2
	}
	return Prehead.Next
}
