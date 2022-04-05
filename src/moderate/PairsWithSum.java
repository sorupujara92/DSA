package moderate;

import java.util.Arrays;

public class PairsWithSum {
	public static void main(String x[]){
		int a[] = new int[]{1,3,15,15,11,2,17};
		Arrays.sort(a);
		int i=0;
		int j=a.length-1;
		while(j>i){
			if(a[j]+a[i]==18){
				System.out.println(a[j]+"--"+a[i]);
				i++;
				j--;
			}
			if(a[j]+a[i]>18){
				j--;
			}else{
				i++;
			}
		}
	
	}
}
