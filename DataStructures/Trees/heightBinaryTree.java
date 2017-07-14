package datastructures.trees;

public class heightBinaryTree {

	public static void main(String[] args) {
		
		/*
	    class Node 
	    	int data;
	    	Node left;
	    	Node right;
		*/
		
		static int height(Node root) {
	      	
		    int heightTree = -1;

	        if (root == null) {
	            return heightTree;
	        } else {
	            heightTree = 1 + Math.max(height(root.left), height(root.right));
	        }

	        return heightTree;
		 }
		
		
		
	}

}
