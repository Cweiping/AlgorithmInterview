package code_go

type Node struct {
	Val   int
	Left  *Node
	Right *Node
	Next  *Node
}

func connect(root *Node) *Node {
	if root == nil {
		return root
	}
	connectNode(root.Left, root.Right)
	return root
}
func connectNode(left, right *Node) {
	if left == nil || right == nil {
		return
	}
	left.Next = right
	connectNode(left.Left, left.Right)
	connectNode(left.Right, right.Left)
	connectNode(right.Left, right.Right)
}
