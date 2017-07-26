package datastructure.tree.program;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SwapNodes {
	public static void main(String[] args) {
		Node root = new Node(1, 1);
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		try (Scanner sc = new Scanner(System.in)) {
			// no of nodes
			int n = sc.nextInt();
			// using BFS technique to create the tree from input stream
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				Node t = q.poll();
				Node x = new Node(a, t.depth + 1);
				Node y = new Node(b, t.depth + 1);
				t.left = (a != -1) ? x : null;
				// System.out.println(x);
				// System.out.println(y);
				t.right = (b != -1) ? y : null;
				if (t.left != null)
					q.add(t.left);
				if (t.right != null)
					q.add(t.right);
			}
			// no of test cases
			int c = sc.nextInt();
			// perform swap for each test case
			for (int i = 0; i < c; i++) {
				q = new LinkedList<>();
				q.add(root);
				// depth at which swap needs to be performed
				int k = sc.nextInt();
				// using BFS Technique for swaps
				while (!q.isEmpty()) {
					Node t = q.poll();
					if (t.depth % k == 0) {
						System.out.println("LEFT:::" + t.left + "    RIGHT:::" + t.right);
						Node temp = t.left;
						t.left = t.right;
						t.right = temp;
					}
					if (t.left != null)
						q.add(t.left);
					if (t.right != null)
						q.add(t.right);
				}
			}
			// print inorder traversal of current test case
			// printInOrder(root);
			System.out.println("");
		}
	}

	

	public static void printInOrder(Node node) {
		if (node == null)
			return;
		if (node.left != null)
			printInOrder(node.left);
		System.out.print(node.data + " ");
		if (node.right != null)
			printInOrder(node.right);
	}

	public static void levelOrder(Node root, int i) {
		// for level order traversal create a Queue
		Queue<Node> q = new LinkedList<>();
		// enqueue root node
		q.add(root);
		// perform the following until queue is empty
		while (!q.isEmpty()) {
			// poll the queue to get the first inserted node
			Node curr = q.poll();
			// if the current node has left subtree add left subtree to the
			// queue
			if (curr.left != null)
				q.add(curr.left);
			// if the current node has right subtree add left subtree to the
			// queue
			if (curr.right != null)
				q.add(curr.right);
			// print the current node
			if (curr.depth > i)
				System.out.println("");
			System.out.print(curr.data + " ");
		}
	}

	public static class Node {
		Node left, right;
		int data;
		int depth;

		public Node(int data, int depth) {
			this.data = data;
			this.depth = depth;
		}

		@Override
		public String toString() {
			return "Node [left=" + left + ", right=" + right + ", data=" + data + ", depth=" + depth + "]";
		}

	}
}