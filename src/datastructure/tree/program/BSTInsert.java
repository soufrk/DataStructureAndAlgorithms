package datastructure.tree.program;

import datastructure.tree.TreeNode;

public class BSTInsert {

	public static void main(String[] args) {
		TreeNode<Integer> root = insert(null, 4);
		root = insert(root, 2);
		root = insert(root, 7);
		root = insert(root, 1);
		root = insert(root, 3);
		root = insert(root, 6);

		TreeTraversal.levelOrder(root);
	}

	public static TreeNode<Integer> insert(TreeNode<Integer> root, int value) {
		if (root == null) {
			root = new TreeNode<>();
			root.data = value;
			return root;
		}
		if (value < root.data)
			root.left = insert(root.left, value);
		else if (value >= root.data)
			root.right = insert(root.right, value);
		return root;
	}

}
