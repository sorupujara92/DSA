package moderate;

import java.util.Arrays;

public class SubSort {
	public static void main(String x[]){
		int arr[] = new int[]{21,2,7,10,11,7,6,7,16,2,19};
		
		int i=1;
		int j=arr.length-2;
		int min = arr[0];
		int max = arr[arr.length-1];
		
		
		boolean iFlag = false;
		boolean jFlag = false;
		while(i<=arr.length-2 || j>=1){
			
			if(!iFlag && arr[i+1]<arr[i]){
				 min = arr[i+1];
				 iFlag=true;//minIndex = i+1;
			}
			
			if(iFlag){
				if(arr[i+1]<min){
					min = arr[i+1];
				}
			}
			
			i++;
			
			if(!jFlag && arr[j-1]>arr[j]){
				max = arr[j-1];
				jFlag = true;
			}
			
			if(jFlag){
				if(arr[j-1]>max){
					max = arr[j-1];
				}
			}
			j--;
		}
		
		System.out.println(min+"--"+max);
		Arrays.sort(arr);
		int smallIndex = find(arr,min);
		int largeIndex = find(arr,max);
		System.out.println(smallIndex+"--"+largeIndex);

	}
	
	public static int find(int[] a, int target)
	{
		for (int i = 0; i < a.length; i++)
			if (a[i] == target)
				return i;

		return -1;
	}
}
