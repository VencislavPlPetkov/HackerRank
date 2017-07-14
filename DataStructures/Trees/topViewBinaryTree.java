package datastructures.trees;

public class topViewBinaryTree {

	public static void main(String[] args) {
		
	   /* 
	    
	    class Node 
	       int data;
	       Node left;
	       Node right;
	   */
	   

		void goLeft(Node node) {
		    if(node.left != null) {
		        goLeft(node.left);
		    }
		    System.out.print(node.data + " ");
		}

		void goRight(Node node) {
		    System.out.print(node.data + " ");
		    
		    if(node.right != null) {
		        goRight(node.right);
		    }
		}

		void top_view(Node root) {
		    if(root.left != null) {
		        goLeft(root.left);
		    }
		    
		    System.out.print(root.data + " ");
		    
		    if(root.right != null) {
		        goRight(root.right);
		    }
		}

	
	}

}
