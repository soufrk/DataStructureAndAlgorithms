package datastructure.stack.program;

import datastructure.stack.Stack;

public class StackRecursiveSort {

	public static void main(String[] args) throws Exception {
		Stack<Integer> stack = new Stack<>();
		stack.push(30);
		stack.push(-5);
		stack.push(18);
		stack.push(14);
		stack.push(-3);
		System.out.println(stack);
		sort(stack);
		System.out.println(stack);
	}

	// pop everything recursively and maintain it in the method stack
	private static void sort(Stack<Integer> stack) throws Exception {
		if (stack.peek() == null)
			return;
		int temp = stack.pop();
		sort(stack);
		insert(stack, temp);
	}

	// push if greater then top else pop everything recursively until smaller
	// element is encountered and then push
	private static void insert(Stack<Integer> stack, int temp) throws Exception {
		if (stack.peek() == null) {
			stack.push(temp);
			return;
		}
		if (stack.peek() > temp) {
			int i = stack.pop();
			insert(stack, temp);
			stack.push(i);
		} else {
			stack.push(temp);
		}
		return;
	}
}
