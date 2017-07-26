package datastructure.stack.program;

import datastructure.stack.Stack;

public class InfixToPostfixExpression {

	public static void main(String[] args) throws Exception {
		String expression = "2 + 3 * 3 + (2 * 8) / 4 ";
		Stack<Character> operatorStack = new Stack<Character>();
		char[] charArray = expression.toCharArray();

		for (Character c : charArray) {
			// if c is empty skip the iteration
			if (c == ' ')
				continue;
			// if c is a number then output it
			if (c != '+' && c != '-' && c != '*' && c != '/' && c != '^' && c != '(' && c != ')') {
				System.out.print(c + " ");
				continue;
			}
			if (c == '(') {
				operatorStack.push(c);
				continue;
			}

			// if c is close parenthesis pop the stack until open parenthesis is
			// encountered
			if (c == ')') {
				while (operatorStack.peek() != '(')
					System.out.print(operatorStack.pop() + " ");
				operatorStack.pop();
				continue;
			}
			// while c is an operator of less precedence than the operator on
			// top of the stack pop the stack until the precedence at the top is
			// less than the current operator or null
			while (operatorStack.peek() != null && getPrecedence(c) <= getPrecedence(operatorStack.peek()))
				System.out.print(operatorStack.pop() + " ");
			operatorStack.push(c);
		}

		while (operatorStack.peek() != null)
			System.out.print(operatorStack.pop() + " ");

	}

	private static int getPrecedence(Character op) throws Exception {
		switch (op) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		default:
			return -1;
		}
	}

}
