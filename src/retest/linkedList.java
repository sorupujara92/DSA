package retest;

public class linkedList {
	node head = null;
	node last = null;
	class node{
		int data;
		
		node(int data){
			this.data=data;
		}
		
		node next=null;
		node prev=null;
	}
	
	void addElements(int n){
		node n1 = new node(n);
		if(this.head==null && this.last==null){
			this.head = n1;
			this.last = n1;
		}else{
			node lastNode = this.last;
			lastNode.next = n1;
			n1.prev = lastNode;
			this.last = n1;
		}
	}
	void printElements(){
		node n1 = this.head;
		while(n1!=null){
			System.out.println(n1.data);
			n1 = n1.next;
		}
	}
	
	void deleteNode(int n){
		node n1 = this.head;
		while(n1!=null){
			if(n1.data == n){
				n1.prev.next = n1.next;
				//n1.next = null;
				break;
			}
			n1 =n1.next;
		}
	}
	public static void main(String x[]){
		linkedList ll = new linkedList();
		ll.addElements(1);
		ll.addElements(2);
		ll.addElements(3);
		ll.addElements(4);
		ll.addElements(5);
		ll.printElements();
		
		ll.deleteNode(3);
		ll.printElements();
	}
}
