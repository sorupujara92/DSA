import java.util.Stack;


public class sortStack {
	
	public static void main(String x[]){
		 Stack<Integer> s1 = new Stack<Integer>();
		 s1.push(3);
		 s1.push(8);
		 s1.push(12);
		 s1.push(5);
		 s1.push(10);
		 Stack<Integer> s2 = new Stack<Integer>();

		 

		 while(!s1.isEmpty()){
			 
			 int temp = s1.pop();
			 
			 while(!s2.isEmpty() && s2.peek()>temp){
				 s1.push(s2.pop());
			 }
			 s2.push(temp);
			 
		 }
		 while(!s2.isEmpty()){
			 s1.push(s2.pop());
		 }
		 
		 while(!s1.isEmpty()){
			 System.out.println(s1.pop());
		 }
		 
	}
}
