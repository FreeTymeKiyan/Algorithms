package com.freetymekiyan.treetraversal;

/**
 * Post-order traversal of a tree.
 * Root is visited after left subtree and 
 * right subtree.
 *
 * @author Kiyan
 */
public class PostOrder {
	
	public static void traversal(Node root) {
		if (root == null) {
			return;
		}
		traversal(root.leftNode());
		traversal(root.rightNode());
		System.out.println(root.getNodeValue()); // visit function
	}
}
