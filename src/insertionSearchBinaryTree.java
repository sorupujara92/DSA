
public class insertionSearchBinaryTree {
	class TreeNode{
		
		
		int data;
		TreeNode(int data){
			this.data = data;
			
		}
		TreeNode left = null;
		TreeNode right = null;
	}
	
	
	 TreeNode root = null;
	
	public static void main(String x[]){
	
		
		insertionSearchBinaryTree is = new insertionSearchBinaryTree();
		is.addElements(is.new TreeNode(1));		
		is.addElements(is.new TreeNode(12));		
		is.addElements(is.new TreeNode(32));		

		is.addElements(is.new TreeNode(24));		

		is.addElements(is.new TreeNode(15));		

		is.addElements(is.new TreeNode(61));		

		is.addElements(is.new TreeNode(17));		

		is.addElements(is.new TreeNode(81));
		
		is.search(is.root, is.new TreeNode(12));
		is.insertAtTop(is.new TreeNode(90));

		
		is.deleteNode(is.new TreeNode(32));

		is.preorderTraversal(is.root);
		
		
	}
	

	public void addElements(TreeNode n){
		
		root= addElementsToTree(this.root, n);
	}
	
public void insertAtTop(TreeNode n){
		TreeNode temp = this.root;
		this.root = n;
		root= addElementsToTree(this.root, temp);
	}
	
	
	 TreeNode addElementsToTree(TreeNode r , TreeNode n){
		if(r==null){
			r = n;
			return r;
		}else{
			if(r.data > n.data){
			r.left = 	addElementsToTree(r.left , n);
			}else{
				r.right =  addElementsToTree(r.right , n);

			}
		}
		
		return r;
	}
	
static void	  search(TreeNode r ,  TreeNode n){
		 
			if(r==null){
				System.out.println("not found");
			}else if(r.data==n.data){
				System.out.println("found");
			}	else{
				if(r.data > n.data){
				 	search(r.left , n);
				}else{
					 search(r.right , n);

				}
			}
			
		}



static TreeNode	  searchNode(TreeNode r ,  TreeNode n){
	 
		if(r==null){
			System.out.println("not found");
			return null;
		}else if(r.data==n.data){
			return r;
		}	else{
			if(r.data > n.data){
			 return	searchNode(r.left , n);
			}else{
			return	 searchNode(r.right , n);

			}
		}
		
	}

public void deleteNode(TreeNode n){
	root = deleteNodeData(root,n);
	System.out.println(root);
}
public TreeNode deleteNodeData(TreeNode r , TreeNode n){

	
	
	if(r.data==n.data){
		
		if(r.left==null){
			
			if(r.right==null){
				r = null;
				return r;
			}
			
			
			if(r.right!=null){
				r = r.right;
				r.right = null;
				return r;
			}
			
		}
		
		
		if(r.left!=null && r.right!=null){
			TreeNode temp = findNodeToBeDeleted(r.right);
			 deleteNodeData(r,temp);
			 r.data = temp.data;
			 return r;
		}
		
	}else{
		
		if(r.data>n.data){
			r.left =  deleteNodeData(r.left ,n);
		}else{
			r.right=	deleteNodeData(r.right ,n);
		}
			
			
			
	}
	return r;
}
	 public TreeNode findNodeToBeDeleted(TreeNode r){
		 
		 while(r.left!=null){
			 r = r.left;
		 }
		 return r;
		 
	 }
	public static void preorderTraversal(TreeNode ib){
		
		if(ib!=null) {
			System.out.println(ib.data);
		
		preorderTraversal(ib.left);
		preorderTraversal(ib.right);
		}
	}
	
	
}
