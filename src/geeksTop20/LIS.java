package geeksTop20;

import java.util.Arrays;
import java.util.HashMap;

public class  LIS{  
	
	static int max = 0;
	public static void main(String args[]){
			int[] a = new int[]{1,4,22,6,8,7,9,3,24,2};
			int[] max = new int[10];
			Arrays.fill(max, 1);
			for(int i=1;i<a.length;i++){
				for(int j=0;j<i;j++){
					if(a[i]>a[j])
					max[i] = Math.max(max[i], max[j]+1);
				}
			}
		for(int i=0;i<max.length;i++){
			System.out.println(max[i]);
		}
	}  

	
}  