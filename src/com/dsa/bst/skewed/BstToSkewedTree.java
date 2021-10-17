package com.dsa.bst.skewed;

/**
 * Convert BST Tree to Right Skewed Tree.
 * 
 * @author fullstack8
 *
 */
public class BstToSkewedTree {
	public Node node;
	static Node prevNode = null;
	static Node headNode = null;

	static void convertBstToRightSkewedTree(Node root) {

		if (root == null) {
			return;
		}

		// Recursive call
		convertBstToRightSkewedTree(root.left);

		Node rightNode = root.right;

		// root node of skewed tree
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		// Recursive call
		convertBstToRightSkewedTree(rightNode);
	}

	static void traverseRightSkewedTree(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.value + " ");
		traverseRightSkewedTree(root.right);
	}
}

class Node {
	int value;
	Node left, right;

	Node(int item) {
		value = item;
		left = right = null;
	}
}
