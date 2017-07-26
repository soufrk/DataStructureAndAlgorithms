package datastructure.stack.program;

import datastructure.stack.Stack;

/**
 * Given a string consisting of opening and closing parenthesis, find length of
 * the longest valid parenthesis substring.
 * 
 * @author skedia
 *
 */
public class LongestValidSubstring {

	public static void main(String[] args) throws Exception {
		String a = "((()";
		Stack<Character> stack = new Stack<>();
		char[] arr = a.toCharArray();
		int result = 0;
		int curr = 0;

		for (Character c : arr) {
			if (c == '(') {
				// If open parenthesis is encountered then push it onto the
				// stack
				stack.push(c);
			} else if (stack.peek() != null) {
				// if stack has elements and close parenthesis is encountered
				// then pop the stack and increment current by 2
				stack.pop();
				curr += 2;
			} else {
				// if stack is empty and close parenthesis is encountered that
				// means end of valid substring. make current equals zero
				curr = 0;
			}
			// if current is greater than result then assign the same to result.
			result = (result > curr) ? result : curr;
		}
		// print the result out.
		System.out.println("length: " + result);
	}

}
