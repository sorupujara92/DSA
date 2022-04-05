package retest;

import java.util.ArrayList;
import java.util.List;

public class permutationWithoutDuplicate {
	static ArrayList<String> path = new ArrayList<String>();
	public static void main(String x[]){
		List<String> al = new ArrayList<String>();
		al.add("a1");
		al.add("b");
		al.add("c");
		calculatePerms(al);
		
	}
	public static void calculatePerms(List<String> a1){
		
		ArrayList<String> path1 = new ArrayList<String>();
		path1.add("a");
		for(String a : a1){
			path1=	calculatePermsPerms(a,path1);
		}
		System.out.println(path1);
	}
	public static ArrayList<String> calculatePermsPerms(String a1,ArrayList<String> path){
		ArrayList<String> path1 = new ArrayList<String>();
		for(String s : path){
			
			for(int i=0;i<=s.length();i++){
				String s1 = s.substring(0,i)+a1+s.substring(i,s.length());
				path1.add(s1);
			}
				
			
		}
		return path1;
	
	}
	
	
}
