package high;

public class RandomSet {

	
	public static void main(String x[]){
		int m=5;
		int n=10;
		int original[] = new int[10];
		pickMiIteratively(original,m);
	}
	
	static void pickMiIteratively(int original[],int m){
		
		int  subset[] = new int[m];
		
		for(int i=0;i<m;i++){
			subset[i] = original[i];
		}
		
		for(int k=m;k<original.length;k++){
			int rand = rand(0,k);
			if(rand<m)
			subset[rand] = original[k];
		}
		
	}
	
	public static int rand(int lower,int higher){
		return lower+(int)(Math.random()*(higher-lower+1));
		
	}
}
