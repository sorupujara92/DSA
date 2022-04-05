class TreeNode{
	
	
	int data;
	TreeNode(int data){
		this.data = data;
		
	}
	TreeNode left = null;
	TreeNode right = null;
}
public class BinTreeTraversal {
	TreeNode root = null;
	
	public static void main(String x[]){
		
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		TreeNode n8 = new TreeNode(8);

		TreeNode n9 = new TreeNode(9);
		TreeNode n10 = new TreeNode(10);
		TreeNode n11 = new TreeNode(11);
	
		
		BinTreeTraversal ib = new BinTreeTraversal();
		ib.root = n1;
		
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n4.left = n8;
		n5.left = n9;
		
		n3.left = n6;
		n3.right = n7;
		n6.right = n10;
		n7.left= n11;
		
		postorderTraversal(ib.root);
	}
	
	
	public static void inorderTraversal(TreeNode ib){
		if(ib!=null){
			inorderTraversal(ib.left);
			System.out.println(ib.data);
			inorderTraversal(ib.right);
		}
	}
	
	public static void preorderTraversal(TreeNode ib){
	
		if(ib!=null) {
			System.out.println(ib.data);
		}
		inorderTraversal(ib.left);
		inorderTraversal(ib.right);
	}
	
	public static void postorderTraversal(TreeNode ib){
		if(ib!=null) {
		postorderTraversal(ib.left);
		postorderTraversal(ib.right);
		System.out.println(ib.data);
		}
	}
	
	
}
