

public class commonAncestors {
	static TreeNode root = null;

	class TreeNode{
		
		
		int data;
		TreeNode(int data){
			this.data = data;
			
		}
		TreeNode left = null;
		TreeNode right = null;
	}
	
	public static void main(String x[]){
		commonAncestors ca = new commonAncestors();
		ca.root = ca.new TreeNode(1);
		ca.root.left =ca.new TreeNode(2);
		ca.root.right =ca.new TreeNode(3);
		
		ca.root.left.left =ca.new TreeNode(4);
		ca.root.left.right =ca.new TreeNode(5);
		ca.root.left.right.right =ca.new TreeNode(9);
		ca.root.left.left.left =ca.new TreeNode(6);
		
		
		ca.root.right.left =ca.new TreeNode(7);
		ca.root.right.right =ca.new TreeNode(8);
		
		TreeNode res = ca.findCommonAncestor(ca.root,5 ,9);
System.out.println(res.data);
	}
	public TreeNode findCommonAncestor(TreeNode n,Integer s , Integer d){
		
		
		if(n==null){
			return null;
		}
		
		if(n.data==s || n.data==d){
			return n;
		}
		TreeNode x = findCommonAncestor(n.left, s ,  d);
		
		if(x!=null && x.data!=s && x.data!=d){
			return x;
		}
		
		TreeNode y = findCommonAncestor(n.right, s ,  d);
		
		if(y!=null && y.data!=s && y.data!=d){
			return y;
		}
		
		if(x!=null &&y!=null){
			return n;
		}else if(n.data==s || n.data==d){
			return n;
		}
		
		if(x!=null){
			return x;
		}else {
			return y;
		}
	//	return n;
	}
}
