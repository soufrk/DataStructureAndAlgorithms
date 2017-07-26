package datastructure.stack.program;

import datastructure.stack.Stack;

public class StackReverseUsingRecursion {

	public static void main(String[] args) throws Exception {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		reverse(stack);
		System.out.println(stack);
	}

	// Hold all the elements in the method stack and call insert once the stack
	// becomes empty
	public static void reverse(Stack<Integer> stack) throws Exception {
		if (stack.peek() == null)
			return;
		int temp = stack.pop();
		reverse(stack);
		insert(temp, stack);
	}

	// Hold all the elements in the method stack and push all the data once
	// stack becomes empty
	private static void insert(int i, Stack<Integer> stack) throws Exception {
		if (stack.peek() == null) {
			stack.push(i);
		} else {
			int temp = stack.pop();
			insert(i, stack);
			stack.push(temp);
		}
	}

}
