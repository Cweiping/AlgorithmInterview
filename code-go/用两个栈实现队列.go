package code_go

/**
题目描述
用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
*/
// Push
var stack1 []int

// Pop
var stack2 []int

func Push(node int) {
	stack1 = append(stack1, node)
}

func Pop() int {
	if len(stack2) == 0 {
		stack2 = append(stack2, stack1...)
		stack1 = []int{}
	}
	res := stack2[0]
	stack2 = stack2[1:]
	return res
}
