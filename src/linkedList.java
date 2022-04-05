import java.util.LinkedList;

class node{
	
	int data;
	
	node(int data){
		this.data = data;
	}
	
	node next;
	node prev;
	
	
}
public class linkedList {
	node head = null;
	node last = null;
	void addNode(node n){
		if(this.head==null){
			this.head = n;
			this.last = n;
		}else{
			this.last.next = n;
			n.prev = this.last;
			this.last = n;	
			this.last.next=null;
		}
	}

	
	void addFirst(node n){
		if(this.head==null){
			this.head = n;
			this.last = n;
		}else{
			node n2 = this.head;
			this.head = n;
			n.next = n2;
		}
	}
	
	
	void deleteLast(){
		node n = this.last;
		
		this.last  = n.prev;
		this.last.next = null;
	}
	
	void printElements(){
		node n1 = this.head;
		
		while(n1!=null){
			System.out.println(n1.data);
			n1 = n1.next;
		}
	}
	
	
	public static void main(String x[]){
		linkedList l2 = new linkedList();
		LinkedList l1 = new LinkedList();

		l2.addNode(new node(1));
		l2.addNode(new node(2));
		l2.addFirst(new node(3));
		
		l2.addNode(new node(4));
		l2.addNode(new node(5));
		l2.addNode(new node(6));
		
		l2.deleteLast();
		l2.deleteLast();

		l2.deleteLast();
l2.addNode(new node(10));
		l2.printElements();
		
	}
}
