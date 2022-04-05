package retest;

import java.util.LinkedList;

public class insertionSearchBinTree {
	class TreeNode{
		int n;
		TreeNode(int n){
			this.n = n;
		}
		TreeNode left = null;
		TreeNode right = null;
	}
	
	TreeNode root;
	
	void addElements(int n){
		TreeNode n1 = new TreeNode(n);
		root = addElementsToTree(this.root,n1);
	}
	TreeNode addElementsToTree(TreeNode root,TreeNode n1){
		
		if(root==null){
			root = n1;
		}else if(n1.n>root.n){
			root.right = addElementsToTree(root.right,n1);
		}else{
			root.left = addElementsToTree(root.left,n1);
		}
		return root;
	}
	
	void searchNode(int n){
		TreeNode n2 =searchNodeTree(this.root,n);
		if(n2==null){
			System.out.println("not fou d");
			
		}else{
			System.out.println("found"+n2.n);

		}
	}
	TreeNode searchNodeTree(TreeNode root , int n){
		if(root == null){
			return null;
		}else if(root.n==n){

			return root;
		}
		else if(n>root.n){
		root =	searchNodeTree(root.right , n);
		}else{
			root = searchNodeTree(root.left , n);
		}
		return root;
	}
	void preOrderTraversal(TreeNode root){
		System.out.println(root.n);
		if(root.left!=null){
			preOrderTraversal(root.left);
		}
		if(root.right!=null){
			preOrderTraversal(root.right);

		}
	}
	
	
	void levelOrderTraversal(TreeNode root){
		LinkedList<TreeNode> ll= new LinkedList<TreeNode>();
		ll.add(root);
		while(ll.isEmpty()==false){
			TreeNode n1 = ll.poll();
			System.out.println(n1.n);
			if(n1.left!=null){
				ll.add(n1.left);
			}
			if(n1.right!=null){
				ll.add(n1.right);		
			
			}
		}
	}
	
	Integer depthOfTree(TreeNode root){
		
		if(root==null){
			return -1;
		}else{
			
			return Math.max(depthOfTree(root.left),depthOfTree(root.right))+1;
		}
	}
	
	void deleteNode(int n){

		this.root = deleteNodeNodeTree(this.root,n);
	}
	TreeNode deleteNodeNodeTree(TreeNode root,int n){
		if(root == null){
			return root;
		}else if(root.n==n){
			
			if(root.left==null && root.right!=null){
				root = root.right;
				root.right = null;
			}else if(root.left!=null){
				root = root.left;
				root.left = null;
				
			}
			return root;
		}
		else if(n>root.n){
			root.right =	deleteNodeNodeTree(root.right , n);
		}else{
			root.left = deleteNodeNodeTree(root.left , n);
		}
		return root;
	}
	public static void main(String x[]){
		insertionSearchBinTree isb = new insertionSearchBinTree();
		isb.addElements(51);
		isb.addElements(12);
		isb.addElements(32);
		isb.addElements(24);
		isb.addElements(15);
		isb.addElements(61);
		isb.addElements(17);
		isb.addElements(81);
		//isb.preOrderTraversal(isb.root);

		isb.searchNode(17);
		isb.searchNode(900);
	//	isb.deleteNode(12);
	//	isb.levelOrderTraversal(isb.root);
		Integer depth = isb.depthOfTree(isb.root);
		System.out.println(depth);
	//	isb.preOrderTraversal(isb.root);
	}
}
