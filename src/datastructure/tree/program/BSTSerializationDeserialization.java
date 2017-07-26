package datastructure.tree.program;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import datastructure.tree.TreeNode;

public class BSTSerializationDeserialization {

	public static final int NULLVALUE = -1;

	public static void main(String[] args) throws IOException {
		TreeNode<Integer> root = createTree();
		File file = new File("D:\\SerializedTree");
		try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
			serialize(root, out);
		}
		try (Scanner in = new Scanner(new FileInputStream(file))) {
			TreeNode<Integer> deserializedRoot = null;
			deserializedRoot = deserialize(in, deserializedRoot);
			System.out.println(deserializedRoot);
		}
	}

	private static TreeNode<Integer> deserialize(Scanner in, TreeNode<Integer> deserializedRoot) {
		if (!in.hasNext())
			return deserializedRoot;
		int val = in.nextInt();
		if (val == -1)
			return deserializedRoot;
		deserializedRoot = new TreeNode<>(val);
		deserializedRoot.left = deserialize(in, deserializedRoot.left);
		deserializedRoot.right = deserialize(in, deserializedRoot.right);
		return deserializedRoot;
	}

	private static void serialize(TreeNode<Integer> node, BufferedWriter out) throws IOException {
		if (node == null) {
			out.write(NULLVALUE + " ");
			return;
		}
		out.write(node.data + " ");
		serialize(node.left, out);
		serialize(node.right, out);
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
}
