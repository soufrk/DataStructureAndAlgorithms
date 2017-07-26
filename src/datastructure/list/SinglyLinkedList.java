package datastructure.list;

public class SinglyLinkedList {

	public Node head = null;
	public int size = 0;

	public void add(int data) {
		Node current = head;
		if (current == null) {
			current = new Node(data);
			head = current;
			size++;
			return;
		}
		while (current.next != null)
			current = current.next;
		current.next = new Node(data);
		size++;
	}

	public void insertAtFirst(int data) {
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
		size++;
	}

	public void insertAt(int data, int index) throws Exception {
		Node current = head;
		Node prev = null;
		int i = 0;
		if (current == null || size < index)
			throw new Exception("Invalid Index");
		while (current.next != null && i++ != index) {
			prev = current;
			current = current.next;
		}
		prev.next = new Node(data);
		prev.next.next = current;
		size++;
	}

	public void deleteLast() throws Exception {
		Node current = head;
		if (current == null)
			throw new Exception("Empty List");
		while (current.next.next != null)
			current = current.next;
		current.next = null;
		size--;
	}

	public void deleteFirst() throws Exception {
		Node current = head;
		if (current == null)
			throw new Exception("Empty List");
		head = current.next;
		current = null;
		size--;
	}

	public void deleteAt(int index) throws Exception {
		Node current = head;
		Node prev = null;
		int i = 0;
		if (current == null || size < index)
			throw new Exception("Invalid Index");
		while (current.next != null && i++ != index) {
			prev = current;
			current = current.next;
		}
		prev.next = current.next;
		size--;
	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "\t");
			current = current.next;
		}
		System.out.print("\n");
	}

	@Override
	public String toString() {
		return "SinglyLinkedList [head=" + head + ", size=" + size + "]";
	}

}
