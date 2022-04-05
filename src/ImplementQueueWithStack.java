import java.util.Stack;


public class ImplementQueueWithStack {
	Stack<Integer> oldStack = new Stack();
	Stack<Integer> newStack = new Stack();
	public void add(Integer item){
		newStack.push(item);
	}
	
	public void remove(){
		
		if(!oldStack.isEmpty()){
			oldStack.pop();
		}else{
			
			while(!newStack.isEmpty()){
				oldStack.push(newStack.pop());
			}
			oldStack.pop();
		}
		
	}
	public Integer peek(){
		
		if(!oldStack.isEmpty()){
			return oldStack.peek();
		}else{
			
			while(!newStack.isEmpty()){
				oldStack.push(newStack.pop());
			}
			return oldStack.peek();
		}
		
	}
	
	public void printElements(){
	Stack<Integer> temp = new Stack<Integer>();
		while(!oldStack.isEmpty()){
			System.out.println(oldStack.pop());
		}
		
		while(!newStack.isEmpty()){
			oldStack.push(newStack.pop());
		}
		
		while(!oldStack.isEmpty()){
			System.out.println(oldStack.pop());
		}
	}
	public static void main(String x[]){
		
		ImplementQueueWithStack iq = new ImplementQueueWithStack();
		iq.add(1);
		iq.add(2);
		iq.add(3);
		iq.add(4);
		iq.add(5);
		iq.peek();
		iq.add(6);
		iq.remove();
		iq.remove();

		iq.remove();

		iq.remove();
		iq.add(7);

		iq.remove();

		iq.printElements();
		
	}
}
