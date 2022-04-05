import java.util.LinkedList;


public class deleteElement {
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
		deleteElement l2 = new deleteElement();
		LinkedList l1 = new LinkedList();

		l2.addNode(new node(1));
		l2.addNode(new node(2));
		l2.addNode(new node(3));
		
		l2.addNode(new node(4));
		l2.addNode(new node(5));
		l2.addNode(new node(6));
		
		//l2.deleteLast();
	//	l2.deleteLast();

		//l2.deleteLast();
		
	node n2 = l2.head.next.next.next;
	n2.prev.next = n2.next;
//l2.addNode(new node(10));
		l2.printElements();
		
	}
}
