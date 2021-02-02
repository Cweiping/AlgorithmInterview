package code_go

/**
题目描述
对于一个给定的链表，返回环的入口节点，如果没有环，返回null
拓展：
你能给出不利用额外空间的解法么？
*/
func detectCycle(head *ListNode) *ListNode {
	slow, fast := head, head
	isCycle := false
	for fast != nil && fast.Next != nil {
		fast = fast.Next.Next
		slow = slow.Next
		if slow == fast {
			isCycle = true
			break
		}
	}
	if isCycle {
		fast = head
		for fast != slow {
			fast = fast.Next
			slow = slow.Next
		}
		return fast
	}
	return nil
}
