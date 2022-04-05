package moderate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class T9 {
	static ArrayList<String> validWords = new ArrayList<String>();
	public static void main(String x[]){
		validWords.add("tree");
		validWords.add("used");
		validWords.add("usda");
		validWords.add("usba");
		
		String input = "8733";
		String a[]= new String[10];
		a[2]="abc";
		a[3]="def";
		a[4]="ghi";
		a[5]="jkl";
		a[6]="mno";
		a[8]="tuv";
		a[7]="pqrs";
		a[9]="wxyz";
	//	a[3]="def";
		HashMap<Character,Integer> letterToKeyMap = new HashMap<Character,Integer>();
		for(int k=2;k<a.length;k++){
			
			String s = a[k];
			for(int k1=0;k1<s.length();k1++){
				letterToKeyMap.put(s.charAt(k1), k);
			}
			
		}

		HashMap<String,List<String>> validValues = new HashMap<String,List<String>>();
		
		for(String words: validWords){
			
			String temp="";
			for(int k=0;k<words.length();k++){
				temp = temp+letterToKeyMap.get(words.toCharArray()[k]);
			}
			if(validValues.get(temp)==null){
				ArrayList<String> temp1 = new ArrayList<String>();
				temp1.add(words);
				validValues.put(temp, temp1);
			}else{
				ArrayList<String> temp1 = (ArrayList<String>) validValues.get(temp);
				temp1.add(words);
				validValues.put(temp, temp1);
			}
			
		}
		
		System.out.println(validValues.get(input));
	}

	
}
