package moderate;

import java.util.ArrayList;

public class DivingBoard {
	int shorter=1;
	int larger=2;
	public static void main(String x[]){
		ArrayList<String> finalPath = new ArrayList<String>();
		int totalSize = 5;
		int i=0;
		int size=0;

		checkPath(finalPath,size);
		
	}
	
	public static void checkPath(ArrayList<String> finalPath,int size){
		if(size<6){
			
			if(size==5){
				System.out.println(finalPath);
			}
			finalPath.add("1");
			size++;
			checkPath(finalPath,size);
			finalPath.remove("1");
			finalPath.add("2");
			size++;
			checkPath(finalPath,size);
			finalPath.remove("2");
		}
	}
	
}
