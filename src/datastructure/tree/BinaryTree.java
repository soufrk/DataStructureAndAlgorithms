package datastructure.tree;

public class BinaryTree<T> {
	TreeNode<T> root;

	public BinaryTree(T data) {
		root = new TreeNode<>(data);
	}
}
