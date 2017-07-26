package datastructure.stack.program;

import java.util.Arrays;

import datastructure.stack.Stack;

/**
 * The stock span problem is a financial problem where we have a series of n
 * daily price quotes for a stock and we need to calculate span of stock’s price
 * for all n days. The span Si of the stock’s price on a given day i is defined
 * as the maximum number of consecutive days just before the given day, for
 * which the price of the stock on the current day is less than or equal to its
 * price on the given day. For example, if an array of 7 days prices is given as
 * {100, 80, 60, 70, 60, 75, 85}, then the span values for corresponding 7 days
 * are {1, 1, 1, 2, 1, 4, 6}
 * 
 * @author skedia
 *
 */
public class StockSpanProblem {

	public static void main(String[] args) throws Exception {
		int[] priceArray = { 100, 80, 60, 70, 60, 75, 85 };
		int[] spanArray = new int[priceArray.length];

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		spanArray[0] = 1;

		// store all the peaks of the array in the stack and while comparing
		// remove the smaller peaks before the bigger peak as if any peak is
		// bigger than this peak then it has to bigger than the smaller peaks.
		for (int i = 1; i < priceArray.length; i++) {
			int item = priceArray[i];
			// Pop elements from stack while stack is not empty and top of
			// stack is smaller than price[i]
			while (stack.peek() != null && priceArray[stack.peek()] <= item)
				stack.pop();

			// If stack becomes empty, then price[i] is greater than all
			// elements on left of it, i.e., price[0], price[1],..price[i-1] or
			// else price[i] is greater than elements after top of stack
			spanArray[i] = (stack.peek() == null) ? i + 1 : i - stack.peek();

			// push the current element on the stack;
			stack.push(i);
		}

		System.out.println(Arrays.toString(spanArray));
	}
}
