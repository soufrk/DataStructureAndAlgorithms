package datastructure.tree.program;

import java.util.LinkedList;
import java.util.Queue;

import datastructure.tree.TreeNode;

/**
 * https://www.hackerrank.com/challenges/tree-inorder-traversal
 * https://www.hackerrank.com/challenges/tree-preorder-traversal
 * https://www.hackerrank.com/challenges/tree-postorder-traversal
 * 
 * @author skedia
 *
 */
public class TreeTraversal {

	public static void main(String[] args) {
		TreeNode<Integer> root = createTree();
		System.out.println("DFS");
		System.out.println("In Order");
		inOrder(root);
		System.out.println("\nPre Order");
		preOrder(root);
		System.out.println("\nPost Order");
		postOrder(root);
		System.out.println("\nBFS or Level Order");
		levelOrder(root);
	}

	public static TreeNode<Integer> createTree() {
		TreeNode<Integer> root = new TreeNode<>(3);
		root.left = new TreeNode<>(5);
		root.right = new TreeNode<>(2);

		root.left.left = new TreeNode<>(1);
		root.left.right = new TreeNode<>(4);

		root.right.left = new TreeNode<>(6);

		return root;
	}

	public static void inOrder(TreeNode<Integer> root) {
		if (root.left != null)
			inOrder(root.left);
		System.out.print(root.data + " ");
		if (root.right != null)
			inOrder(root.right);
	}

	public static void preOrder(TreeNode<Integer> root) {
		// print root
		System.out.print(root.data + " ");
		// recursively traverse the left tree if exists
		if (root.left != null)
			preOrder(root.left);
		// recursively traverse the right tree if exists
		if (root.right != null)
			preOrder(root.right);
	}

	public static void postOrder(TreeNode<Integer> root) {
		if (root.left != null)
			postOrder(root.left);
		if (root.right != null)
			postOrder(root.right);
		System.out.print(root.data + " ");
	}

	public static void levelOrder(TreeNode<Integer> root) {
		// for level order traversal create a Queue
		Queue<TreeNode<Integer>> q = new LinkedList<>();
		// enqueue root node
		q.add(root);
		// perform the following until queue is empty
		while (!q.isEmpty()) {
			// poll the queue to get the first inserted node
			TreeNode<Integer> curr = q.poll();
			// if the current node has left subtree add left subtree to the
			// queue
			if (curr.left != null)
				q.add(curr.left);
			// if the current node has right subtree add left subtree to the
			// queue
			if (curr.right != null)
				q.add(curr.right);
			// print the current node
			System.out.print(curr.data + " ");
		}
	}
}
