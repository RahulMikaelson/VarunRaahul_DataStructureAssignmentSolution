package com.greatlearning.Graded_Assessment.Projects3.Question2;
import com.greatlearning.Graded_Assessment.Projects3.Question2.Converting_BST2SKEW.Node;
public class MNC_Transaction_Driver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Converting_BST2SKEW cnvbs = new Converting_BST2SKEW();
		//Assigning memory to nodes
		Node root = new Node(50);
	    Node node1 = new Node(30);
		Node node2 = new Node(60);
		Node node3 = new Node(10);
		Node node4 = new Node(40);
		// Linking Nodes
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		
		// Calling methods in class Converting_BST2SKEW(ConvertingBinarySearchTree2SKEW)
		cnvbs.BST2SKEW(root);
		cnvbs.traverseRightSkewed(Converting_BST2SKEW.nextNode);
	}
}
