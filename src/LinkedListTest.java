
public class LinkedListTest {
	Node head;
	class Node{
		int data;
		Node next=null;
		Node(int data){
			this.data=data;
		}
	}
	
	public void addNode(int a){
		if(this.head==null){
			this.head = new Node(a);
		}else{
			
			Node temp = this.head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = new Node(a);
			
		}
	}
	
	public void printElements(){
		Node n = this.head;
		System.out.println(n.data);
		while(n.next!=null){
			n = n.next;
			System.out.println(n.data);
		}
	}
	
	public void removeElement(int index){
		int count = 1;
		Node n = this.head;
		while(n.next!=null){
			n = n.next;
			count++;
			if(count==index-1){
				n.next = n.next.next;
			}
		}
		
		
	}
	
	public void addElementIndex(int index,int node){
		int count = 0;
		Node n = this.head;
		while(n.next!=null){
			n = n.next;
			count++;
			if(count==index-1){
				Node temp = new Node(node);
				Node nextTemp = n.next;
				n.next = temp;
				n.next.next=nextTemp;
			}
		}
		
	}
	public static void main(String x[]){
		LinkedListTest ll =new LinkedListTest();
		ll.addNode(1);
		ll.addNode(2);
		ll.addNode(3);
		ll.addNode(4);
		ll.addNode(5);
		ll.addNode(6);
		ll.addNode(7);
		ll.printElements();
		System.out.println("------------------------------");
		ll.removeElement(5);
		ll.addElementIndex(2,11);

		ll.printElements();

	}
	
	
	
}
