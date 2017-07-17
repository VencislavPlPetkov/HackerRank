package datastructures.trees;

public class bstInsertion {

	/*
	 * Node is defined as : class Node int data; Node left; Node right;
	 * 
	 */

	public static Node Insert(Node root, int value) {

		Node newNode = new Node();
		newNode.data = value;

		if (root == null) {
			return newNode;
		}

		if (value < root.data) {
			if (root.left != null) {
				Insert(root.left, value);
			} else {
				root.left = newNode;
			}
		}

		else if (value > root.data) {
			if (root.right != null) {
				Insert(root.right, value);
			} else {
				root.right = newNode;
			}
		}

		return root;

	}

}
