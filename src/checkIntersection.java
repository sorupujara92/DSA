import java.util.Iterator;
import java.util.LinkedList;


public class checkIntersection {
	public static void main(String x[]){

	LinkedList<Integer> l1 = new LinkedList<Integer>();
	
	LinkedList<Integer> l2 = new LinkedList<Integer>();
	Integer i1 = new Integer(1);
	Integer i2 = new Integer(2);
	Integer i3 = new Integer(3);
	Integer i4 = new Integer(4);
	Integer i5 = new Integer(5);
	Integer i6 = new Integer(6);
	Integer i7 = new Integer(7);
	
	Integer i8 = new Integer(8);
	Integer i9 = new Integer(9);
	//l1.add(7);
	l1.add(i1);
	l1.add(i2);
	l1.add(i3);
	l1.add(i4);
	l1.add(i8);
	l1.add(i9);
	
	
	l2.add(i5);
	l2.add(i6);
	l2.add(i7);
	//l2.add(i8);
	//l2.add(i9);
if(l1.size()>l2.size()){
	
}
	LinkedList<Integer> shorter = l1.size() > l2.size() ? l2 : l1;
	LinkedList<Integer> longer = l1.size() > l2.size() ? l1 : l2;
	
	Iterator shorterItr = shorter.iterator();
	Iterator longerItr = longer.iterator();
	Integer diff = longer.size() - shorter.size();
	for(int i=0;i<diff;i++){
		longerItr.next();
	}
	
	while(longerItr.hasNext() && shorterItr.hasNext()){
		if(longerItr.next()==shorterItr.next()){
			System.out.println("found"+longerItr.next());
		}
	}
	
	
		
	}
	
	
	
	
}
