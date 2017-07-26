package datastructure.stack;

import java.util.LinkedList;
import java.util.List;

public class Stack<T> {

	int top;
	List<T> stack;
	int capacity;

	public Stack() {
		this.capacity = 32;
		this.top = 0;
		this.stack = new LinkedList<T>();
	}

	public void push(T data) throws Exception {
		if (stack.size() == capacity)
			throw new Exception("Stack is full");
		stack.add(data);
		top++;
	}

	public T pop() throws Exception {
		if (stack.size() == 0) {
			throw new Exception("Stack is empty");
		}
		T t = stack.remove(top - 1);
		top--;
		return t;
	}

	public T peek() {
		if (stack.size() == 0) {
			return null;
		}
		return stack.get(top - 1);
	}

	@Override
	public String toString() {
		return "Stack=" + stack;
	}

}
