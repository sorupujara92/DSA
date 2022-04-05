package com.RecursionAndDynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;

public class permWithDuplicate {

	public static void main(String x[]){
		permWithDuplicate pw = new permWithDuplicate();
		ArrayList<String> set = new ArrayList<String>();
		ArrayList<String> result = new ArrayList<String>();

		set.add("a1");
		set.add("a2");
		set.add("a2");
		//set.add("a4");
		HashMap<String,Integer> calCount = new HashMap<String,Integer>();
		calCount = pw.getCount(set,calCount);
		pw.printPerms(calCount,"",set.size(),result);
		System.out.println(result);
	}
	
	public void printPerms(HashMap<String,Integer> calCount,String prefix,Integer remaining,ArrayList<String> result){
		if(remaining==0){
			result.add(prefix);
			return;
		}
		for(String s :calCount.keySet()){
			Integer count = calCount.get(s);
			if(count>0){
			calCount.put(s, count-1);
			printPerms(calCount, prefix+s,remaining-1,result);
			calCount.put(s, count);

			}
		}
	}
	
	public HashMap<String,Integer> getCount(ArrayList<String> set,HashMap<String,Integer> calCount){
		for(String s:set){
			if(calCount.get(s)==null){
				calCount.put(s, 1);
			}else
				calCount.put(s, calCount.get(s)+1);
		}
		return calCount;
	}
}
