package retest;

import java.util.ArrayList;

public class countSteps {

	static int count = 0;
	public static void main(String x[]){
		ArrayList<String> path = new ArrayList<String>();
		int n=5;
		int diff = 0;
		count(n,diff,path);
		System.out.println(count);
		
	}
	static ArrayList<String> count(int n,int diff,ArrayList<String> path){
		n = n-diff;
		path.add(String.valueOf(diff));

		if(n<0){
			return path;
		}

			if(n==0){
				count = count +1;
				System.out.println(path);
				return path;
			}
			

			path = count(n,1,path); 
			
		//	n = n+1;
			path.remove("1");
			

			path = count(n,2,path); 
			//n = n+2;
	
			path.remove("2");
			

			path = count(n,5,path); 
			//n = n+5;
	
			path.remove("5");
		
		return path;
	}
}
