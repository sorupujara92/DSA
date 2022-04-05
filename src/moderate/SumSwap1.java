package moderate;

import java.util.Arrays;
import java.util.Collections;

public class SumSwap1 {
	public static void main(String x[]){
		
		Integer a[] = new Integer[]{1,2,2,4,5,9,8};
		Integer b[]=new Integer[]{3,3,5,6,11};
		
		Arrays.sort(a);
		

		Arrays.sort(b);
		int sumA=0;
		int sumB=0;
		
		for(int i=0;i<a.length;i++){
			sumA = sumA+a[i];
		}
		
		for(int j=0;j<b.length;j++){
			sumB = sumB+b[j];
		}
		Integer target = (sumA-sumB)/2;
		int i=0;
		int j=0;
		while(i<a.length-1 && j<b.length-1){
			
			if(a[i]-b[j]==target){
				System.out.println(a[i]+"--"+b[j]);
				i++;
				j++;
			}
			if(a[i]-b[j]>target){
				j++;
			}else{
				i++;
			}
			
		}
		
	}
	
}
