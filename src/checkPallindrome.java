import java.util.Iterator;
import java.util.LinkedList;


public class checkPallindrome {
	public static void main(String x[]){

	LinkedList<Integer> l1 = new LinkedList<Integer>();
	//l1.add(7);
	l1.add(7);
	l1.add(1);
	l1.add(6);
	l1.add(1);
	l1.add(7);
	l1.add(7);
	
	LinkedList<Integer> l2 = new LinkedList<Integer>();
	l2.addAll(l1);
	
	String firstHalf = "";
	Iterator<Integer> itr = l1.iterator();
	Iterator<Integer> itr1 = l2.iterator();
	Integer count=0;
	while(itr1.hasNext()){
		count++;
		 itr1.next();
		 if(itr1.hasNext()){
		 itr1.next();
		 count++;
		 }
		 firstHalf = firstHalf + itr.next();

	}
	
	if(count%2!=0){
		firstHalf = firstHalf.substring(0, firstHalf.length()-1);
	}
	String secondHalf = "";
	while(itr.hasNext()){
		secondHalf = secondHalf + itr.next();
		
	}
	
	if(secondHalf.equalsIgnoreCase(new StringBuffer(firstHalf).reverse().toString())){
		System.out.println("yes");
		
	}else{
		System.out.println("no");
	}
	
	}
	
}
