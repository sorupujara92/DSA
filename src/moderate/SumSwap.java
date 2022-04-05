package moderate;

import java.util.Arrays;
import java.util.Collections;

public class SumSwap {
	public static void main(String x[]){
		
		Integer a[] = new Integer[]{1,2,2,4,5,9,8};
		Integer b[]=new Integer[]{3,3,5,6,11};
		
		Arrays.sort(a);
		
		//Arrays.sort(b);

		Arrays.sort(b,Collections.reverseOrder());
		int sumA=0;
		int sumB=0;
		
		for(int i=0;i<a.length;i++){
			sumA = sumA+a[i];
		}
		
		for(int j=0;j<b.length;j++){
			sumB = sumB+b[j];
		}
		
		for(int i=0;i<a.length-1;i++){
			int difference = sumA-a[i];
			int diff1 = sumB+a[i];
			if((diff1-difference)%2==0){
			int required = (diff1-difference)/2;
			if(Arrays.asList(b).contains(required)){
				System.out.println(a[i]+"--"+required);
			}
			}
		}
		
	}
	
}
