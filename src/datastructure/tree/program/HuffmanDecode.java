package datastructure.tree.program;

import datastructure.tree.TreeNode;

public class HuffmanDecode {

	public static void main(String[] args) {
		TreeNode<Character> root = new TreeNode<>('x');
		root.left = new TreeNode<>('x');
		root.right = new TreeNode<>('A');

		root.left.left = new TreeNode<>('B');
		root.left.right = new TreeNode<>('C');

		decode("1001011", root);

	}

	public static void decode(String S, TreeNode<Character> root) {
		int i = 0;
		do {
			i = decodeA(S, root, i);
		} while (i < S.length());
	}

	public static int decodeA(String S, TreeNode<Character> root, int i) {
		if (root.left == null && root.right == null) {
			System.out.print(root.data);
			return i;
		}
		if (Character.getNumericValue(S.charAt(i)) == 0)
			i = decodeA(S, root.left, i + 1);
		else if (Character.getNumericValue(S.charAt(i)) == 1)
			i = decodeA(S, root.right, i + 1);
		return i;
	}

}
