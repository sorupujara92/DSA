import java.util.Iterator;
import java.util.LinkedList;


public class lastFromK {
	public static void main(String x[]){

		LinkedList<Integer> l1 = new LinkedList<Integer>();
		
		for(int i=0;i<20;i++){
			l1.add(i);
		}
	
		int k = 5;
		
		if(l1==null || l1.size()<5){
			System.out.println("not possible");
		}
		
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.addAll(l1);
		
		
		for(int i=0;i<5;i++){
			l2.removeFirst();
		}
		Iterator l2itr = l2.iterator();
		Iterator l1itr = l1.iterator();
		while(l2itr.hasNext()){
			l2itr.next();
			l1itr.next();
		}
	
		System.out.println(l1itr.next());

	}
}
