package retest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class permWithDuplicates {
	
	public static void main(String x[]){
		ArrayList<String> al = new ArrayList<String>();
		al.add("a1");
		al.add("a2");
		al.add("a3");
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		hm.put("a1",1);
		hm.put("a2", 2);
		
		ArrayList<String> result = new ArrayList<String>();
		calculatePermutations(al,hm,"",al.size(),result);
	}
	
	static void calculatePermutations(ArrayList<String> al,HashMap<String,Integer> hm,String prefix,Integer remaining,ArrayList<String> result){
		if(remaining==0){
			result.add(prefix);
			System.out.println(result);
			return;
		}
		
		for(String temp :hm.keySet()){
			Integer value = hm.get(temp);
			if( value>0){
				hm.put(temp,  value-1);
				calculatePermutations(al,hm,prefix+temp,remaining-1,result);
				hm.put(temp,  value+1);
			}	
		}
	}
}
