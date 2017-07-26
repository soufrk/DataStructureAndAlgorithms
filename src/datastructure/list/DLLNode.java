package datastructure.list;

public class DLLNode {

	DLLNode previous;
	int data;
	DLLNode next;

	public DLLNode() {
	}

	public DLLNode(int data) {
		this.previous = null;
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString() {
		return "DLLNode [previous=" + previous + ", data=" + data + ", next=" + next + "]";
	}
}
