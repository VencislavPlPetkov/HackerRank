package datastructures.trees;

public class levelOrderTraversal {

	public static void main(String[] args) {

	/* 
	    
	    class Node 
	       int data;
	       Node left;
	       Node right;
	*/
	   void levelOrder(Node root) {
	      
	       
	       Queue<Node> Q = new LinkedList<Node>();
	       Q.add(root);
	       
	       while(!Q.isEmpty()) {
	           Node n = Q.poll();
	           System.out.print(n.data + " ");
	           if(n.left != null) Q.add(n.left);
	           if(n.right != null) Q.add(n.right);
	      
	       }
		   
		   
	      
	    }

		
		
		
		
		
		
	}

}
