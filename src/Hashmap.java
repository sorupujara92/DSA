import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Hashmap {
public static void main(String x[]){
		HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
		mp.put(2, 10);
		mp.put(4, 3);
		mp.put(1, 12);
		mp.put(6, 9);
		mp.put(8, 11);
		
		
		for(Map.Entry<Integer, Integer> mpEntry  : mp.entrySet()){
			System.out.println(mpEntry.getKey()+"--"+mpEntry.getValue());
		}
		
		List<Map.Entry<Integer,Integer>> sorted = new ArrayList<Map.Entry<Integer,Integer>>();
		Collections.sort(sorted,new Comparator<Map.Entry<Integer,Integer>>(){
			
			@Override
			public int compare(Map.Entry<Integer,Integer> m1,Entry<Integer,Integer> m2){
				return m1.getValue() - m2.getValue();
			}

			
		});
		
		
	}
}
