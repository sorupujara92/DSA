import java.util.Map;
import java.util.TreeMap;


public class TreeMapCheck {
class student{
	int rollNo;
	String name;
	student(int rollNo,String name){
		this.rollNo = rollNo;
		this.name = name;
	}
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeMapCheck t1 = new TreeMapCheck();
		TreeMap<student,Integer> tm = new TreeMap<student,Integer>();
		tm.put(t1.new student(1,"s"),1);
		tm.put(t1.new student(2,"s"),2);
		for (Map.Entry<student, Integer> entry : tm.entrySet()) {
		     System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
		}
	}

}
