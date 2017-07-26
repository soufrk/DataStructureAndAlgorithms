package datastructure.tree.program;

import datastructure.tree.TreeNode;

/**
 * http://www.geeksforgeeks.org/diameter-of-a-binary-tree/
 * 
 * @author skedia
 *
 */
public class TreeDiameter {

	public static int mH = 0;
	public static int sMH = 0;
	public static int h = 0;

	public static void main(String[] args) {
		// diameter through root
		TreeNode<Integer> root = createTreeTR();
		calculateDiameter(root);
		System.out.println("Diameter: " + (sMH + mH));

		mH = 0;
		sMH = 0;
		h = 0;
		// diameter not through root
		TreeNode<Integer> root2 = createTreeNTR();
		calculateDiameter(root2);
		System.out.println("Diameter: " + (sMH + mH));
	}

	private static TreeNode<Integer> createTreeNTR() {
		TreeNode<Integer> root = new TreeNode<>(3);
		root.left = new TreeNode<>(5);
		root.right = new TreeNode<>(2);

		root.left.left = new TreeNode<>(1);
		root.left.right = new TreeNode<>(4);

		root.right.right = new TreeNode<>(6);

		root.left.left.left = new TreeNode<>(1);
		root.left.left.right = new TreeNode<>(1);

		root.left.right.right = new TreeNode<>(6);

		root.left.left.right.left = new TreeNode<>(6);

		root.left.right.right.left = new TreeNode<>(6);
		root.left.right.right.right = new TreeNode<>(6);

		root.left.left.right.left.left = new TreeNode<>(6);
		root.left.left.right.left.right = new TreeNode<>(6);

		root.left.right.right.right.right = new TreeNode<>(6);

		return root;
	}

	private static void calculateDiameter(TreeNode<Integer> node) {
		if (node.left != null) {
			h++;
			calculateDiameter(node.left);
		}
		if (node.right != null) {
			h++;
			calculateDiameter(node.right);
		}

		if (mH < h) {
			sMH = mH;
			mH = h;
		}
		h--;
	}

	public static TreeNode<Integer> createTreeTR() {
		TreeNode<Integer> root = new TreeNode<>(3);
		root.left = new TreeNode<>(5);
		root.right = new TreeNode<>(2);

		root.left.left = new TreeNode<>(1);
		root.left.right = new TreeNode<>(4);

		root.right.right = new TreeNode<>(6);

		root.left.right.left = new TreeNode<>(1);
		root.left.right.right = new TreeNode<>(1);

		root.right.right.right = new TreeNode<>(6);

		root.right.right.right.left = new TreeNode<>(6);
		root.right.right.right.right = new TreeNode<>(6);

		root.right.right.right.left.left = new TreeNode<>(6);
		root.right.right.right.left.right = new TreeNode<>(6);

		return root;
	}
}
