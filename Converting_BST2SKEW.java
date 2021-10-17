package com.greatlearning.Graded_Assessment.Projects3.Question2;
public class Converting_BST2SKEW {

	public static class Node {
		int val;
		Node left, right;

		Node(int item) {
			val = item;
			left = right = null;
		}
	}
	
	public static Node preNode = null;
	public static Node nextNode = null;

	public void BST2SKEW(Node root) {

		// The Base Case Condition
		if (root == null)
			return;

		BST2SKEW(root.left);

		Node rightNode = root.right;

        // Condition to check if the root Node of the skewed tree is defined or not
		if (nextNode == null) {
			nextNode = root;
			root.left = null;
			preNode = root;
		} else {
			preNode.right = root;
			root.left = null;
			preNode = root;
		}
		BST2SKEW(rightNode);  
	}
	public void traverseRightSkewed(Node root) {
		if (root == null)
			return;

		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}
}