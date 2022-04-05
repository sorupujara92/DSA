
class node1{
	
	int data;
	
	node1(int data){
		this.data = data;
	}
	
	node1 next;
	node1 prev;
	
}

public class sumLinkedList {

	node1 head = null;
	node1 last = null;
	
	
	String printElements(){
		String s= "";
		node1 n = this.head;
		s = s +n.data;
		while(n.next!=null){
			
			n = n.next;
			s = s +n.data;
		}
		return s;
		
	}
	
	void addElements(node1 n){
		
		
		if(this.head==null){
			this.head = n;
			this.last = n;
		}else{
			
			node1 n2 = this.last;
			n2.next = n;
			this.last = n;
			
			
		}
		
	}
	public static void main(String x[]){
		sumLinkedList s1 = new sumLinkedList();
		s1.addElements(new node1(7));
		s1.addElements(new node1(1));
		s1.addElements(new node1(6));
		
		s1.addElements(new node1(1));
		s1.addElements(new node1(7));

		
		
		
	}
}
