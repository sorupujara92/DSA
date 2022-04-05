import java.util.LinkedList;
import java.util.Queue;

class stackNode{
	
	Integer data;
	stackNode(Integer data){
		this.data = data;
	}
	
	stackNode next;
}
public class stackImpl {

	
	stackNode top;
	
	public void push(stackNode item){
		if(this.top==null){
			this.top = item;
		}else{
			stackNode temp = this.top;
			this.top = item;
			item.next = temp;
		}
	}
	
	public stackNode peek(){
		return this.top;
	}
	
	public void pop(){
		stackNode temp = this.top;
		this.top = temp.next;
		temp.next = null;
	}
	
	public boolean isEmpty(){
		Queue q;
		LinkedList ll = new LinkedList();
		if(this.top==null){
			return true;
		}else
			return false;
	}
	
	public void printElements(){
		stackNode temp = this.top;
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String x[]){
		
		stackNode s1 = new stackNode(1);
		stackNode s2 = new stackNode(2);
		stackNode s3 = new stackNode(3);
		stackNode s4 = new stackNode(4);
		stackNode s5 = new stackNode(5);
		stackNode s6 = new stackNode(6);
		stackNode s7 = new stackNode(7);
		stackImpl stack = new stackImpl();
		stack.push(s1);
		stack.push(s2);
		stack.push(s3);
		stack.push(s4);
		stack.pop();
		System.out.println(stack.peek().data);
		stack.push(s5);
		stack.push(s6);
		stack.push(s7);
		stack.printElements();
	}
}
