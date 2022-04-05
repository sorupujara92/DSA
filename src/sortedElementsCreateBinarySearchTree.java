import java.util.ArrayList;
import java.util.List;



public class sortedElementsCreateBinarySearchTree {
	 static TreeNode root = null;

	class TreeNode{
		
		
		int data;
		TreeNode(int data){
			this.data = data;
			
		}
		TreeNode left = null;
		TreeNode right = null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortedElementsCreateBinarySearchTree is = new sortedElementsCreateBinarySearchTree();
		List<Integer> listElements = new ArrayList<Integer>();

		for(int i=0;i<12;i++){
			listElements.add(i);
		}
		
		is.root = is.addElements(is.root,listElements,0,listElements.size()-1);
		is.preorderTraversal(is.root);
		Integer height = is.findDepth(is.root);
		System.out.println(root.data);
	}
    public  TreeNode addElements(TreeNode n,List<Integer> listElements,int start,int end){
    	
    	
    //	if(listElements.size()>0){
		//while(listElements.size()>0){
			Integer index =(start+end)/2;
			Integer element = listElements.get(index);
			if(end < start){
				return null;
			}
			
	//		listElements.remove(element);
			n = new TreeNode(element);
		
			
				n.left = addElements(n.left,listElements,start,index-1);
				n.right =	addElements(n.right,listElements,index+1,end);
			
	//	}
		return n;
	}
	
    public  Integer findDepth(TreeNode n){
    	if(n==null){
    		return -1;
    	}
    	Integer i = findDepth(n.left);
    	Integer j = findDepth(n.right);
    	System.out.println(i+"--"+j);
    	return (Math.max(findDepth(n.left), findDepth(n.right))+1);
    	
    	}
    	
    
    
	public static void preorderTraversal(TreeNode ib){
		
		if(ib!=null) {
			System.out.println(ib.data);
		
		preorderTraversal(ib.left);
		preorderTraversal(ib.right);
		}
	}
	
	
}
