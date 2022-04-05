class queueNode{
	
	
	Integer data;
	
	queueNode(Integer data){
		this.data = data;
	}
	
	
	queueNode next=null;
}


public class queueImpl {
	queueNode last;
	queueNode first;
	
	
	public void insert(queueNode n){
		if(this.first==null){
			this.first = n;
			this.last = n;
		}else {
			queueNode temp = this.last;
			temp.next = n;
			this.last = n;
			this.last.next=null;
		}
	}
	
	public void remove(){
		
		if(this.first!=null){
			
			if(this.first.next!=null){
				queueNode temp = this.first;
				this.first = temp.next;
				temp.next = null;
			}else{
				this.first=null;
				this.last=null;
			}
		}
	}
	
	public queueNode peek(){
		return this.first;
	}
	
	public boolean isEmpty(){
		if(this.first==null){
			return true;
		}else
			return false;
	}
	
	public void printElements(){
		queueNode temp = this.first;
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String x[]){
		queueNode q1 = new queueNode(1);
		queueNode q2 = new queueNode(2);
		queueNode q3 = new queueNode(3);
		queueNode q4 = new queueNode(4);
		queueNode q5 = new queueNode(5);
		queueNode q6 = new queueNode(6);
		queueNode q7 = new queueNode(7);
		queueNode q8 = new queueNode(8);
		queueImpl qi = new queueImpl();
		qi.insert(q1);
		qi.insert(q2);
		qi.insert(q3);
		qi.insert(q4);
		qi.remove();
		qi.insert(q5);
		qi.insert(q6);
		qi.insert(q7);
		qi.insert(q8);
		System.out.println(qi.peek().data);
		qi.printElements();
		
		
	}
}
