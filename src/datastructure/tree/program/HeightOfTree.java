package datastructure.tree.program;

import datastructure.tree.TreeNode;

/**
 * https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree
 * 
 * @author skedia
 *
 */
public class HeightOfTree {

	public static int h = 0;
	public static int maxH = 0;

	public static void main(String[] args) {
		TreeNode<Integer> root = createTree();
		System.out.println(height(root));
	}

	public static TreeNode<Integer> createTree() {
		TreeNode<Integer> root = new TreeNode<>(3);
		root.left = new TreeNode<>(2);
		root.right = new TreeNode<>(5);

		root.left.left = new TreeNode<>(1);

		root.right.left = new TreeNode<>(4);
		root.right.right = new TreeNode<>(6);

		root.right.right.right = new TreeNode<>(7);

		return root;
	}

	public static int height(TreeNode<Integer> root) {
		if (root.left != null) {
			h++;
			height(root.left);
		}
		if (root.right != null) {
			h++;
			height(root.right);
		}
		maxH = (maxH < h) ? h : maxH;
		h--;
		return maxH;
	}

}
