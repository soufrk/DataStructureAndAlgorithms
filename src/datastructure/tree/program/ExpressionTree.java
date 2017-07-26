package datastructure.tree.program;

import java.util.Stack;

import datastructure.tree.TreeNode;

public class ExpressionTree {/*

	public static void main(String[] args) {
		String expression = "a+b";
		char[] oprArray = expression.toCharArray();
		TreeNode<Character> exprTreeRoot = constructExprTree(oprArray);

	}

	private static TreeNode<Character> constructExprTree(char[] oprArray) {
		Stack<Character> oprtr = new Stack<>();
		Stack<Character> oprnd = new Stack<>();
		TreeNode<Character> node = null;

		for (Character c : oprArray) {
			if (c == ' ')
				continue;
			if (Character.isDigit(c)) {
				oprnd.push(c);
			} else if (c == '(')
				oprtr.push(c);
			while (c == ')' && oprtr.peek() != '(') {
				TreeNode<Character> tempNode = new TreeNode<>(oprtr.pop());
				tempNode.right = new TreeNode<>(oprnd.pop());
				tempNode.right = new TreeNode<>(oprnd.pop());
				if (node == null) {
					node = tempNode;
				} else {
					
				}

			}

		}
	}

*/}
