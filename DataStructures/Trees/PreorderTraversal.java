package datastructures.trees;

public class PreorderTraversal {

	public static void main(String[] args) {
		
		/* you only have to complete the function given below.  
		Node is defined as  

		class Node {
		    int data;
		    Node left;
		    Node right;
		}

		*/

		void preOrder(Node root) {
		  
		   if (root != null) {
			  
			   System.out.print(root.data + " ");
			   
			   preOrder(root.left);
			   preOrder(root.right);
			   
			   
		   } 
		}
		
		
	}// end of main

}//end of class
