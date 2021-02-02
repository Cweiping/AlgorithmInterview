package code_go

/*
 * type ListNode struct{
 *   Val int
 *   Next *ListNode
 * }
 */
/*
题目描述
输入一个链表，反转链表后，输出新链表的表头。
示例1
输入
{1,2,3}
返回值
{3,2,1}*/
func ReverseList(pHead *ListNode) *ListNode {
	var pre *ListNode
	var next *ListNode
	for pHead != nil {
		next = pHead.Next
		pHead.Next = pre
		pre = pHead
		pHead = next
	}
	return pre
}
