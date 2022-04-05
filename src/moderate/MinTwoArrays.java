package moderate;

import java.util.Arrays;

public class MinTwoArrays {
	public static void main(String x[]){
		
		int a[] = new int[]{1,3,15,11,2};
		int b[] = new int[]{23,127,235,19,8};
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int i=0,j=0;
		Integer min = Integer.MAX_VALUE;
		while(i<a.length && j<b.length){
			
			if(min>Math.abs(a[i]-b[j])){
				min = Math.abs(a[i]-b[j]);
			}
			
			if(a[i]>b[j]){
				j++;
			}else
				i++;
		}
		
		System.out.println(min);
	}
}
