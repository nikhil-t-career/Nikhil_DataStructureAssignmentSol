package com.dsa.bst.skewed;

import static com.dsa.bst.skewed.BstToSkewedTree.*;

public class DriverTransactionsBstToSkewedTree {

	public static void main(String[] args) {

		BstToSkewedTree transactionsTree = new BstToSkewedTree();


		transactionsTree.node = new Node(50);
		transactionsTree.node.left = new Node(30);
		transactionsTree.node.right = new Node(60);
		transactionsTree.node.left.left = new Node(10);
		transactionsTree.node.right.left = new Node(40);


		convertBstToRightSkewedTree(transactionsTree.node);
		System.out.println("The Transactions in ascending Order are : ");
		traverseRightSkewedTree(headNode);
	}

}
