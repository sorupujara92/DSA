package sortingAndRecursion;

public class mergeSort {
	public static void main(String x[]){
		int a[] = new int[]{10,80,40,60,25,40,66,24};
		
		new mergeSort().mergeSortElements(a);
		
	}
	
	public void mergeSortElements(int arr[]){
		
		arr = mergeSortEle(arr,0,arr.length-1);
		
		
		 for (int element: arr) {
	            System.out.println(element);
	        }
	}
	
	public int[] mergeSortEle(int arr[],int low,int high){
		if(low<high){
			
			int mid = (low+high)/2;
			mergeSortEle(arr,mid+1,high);
			mergeSortEle(arr,low,mid);
			merge(arr,low,mid,high);
		}
		return arr;
	}
	
	
	public void merge(int arr[],int low,int mid,int high){
		
		int n1 = high-mid;
		int n2 = mid-low+1;
		
		int arr1[] = new int[n1];
		int arr2[]=new int[n2];
		
		
		for(int k=0;k<n1;k++){
			arr1[k] = arr[mid+k+1];
		}
		for(int k=0;k<n2;k++){
			arr2[k] = arr[low+k];
		}
		
		Integer i=0;
		Integer j=0;
		Integer k=low;
		while(i<n1 && j<n2){
			
			if(arr1[i]>arr2[j]){
				arr[k] = arr2[j];
				j++;
			}else{
				arr[k] = arr1[i];
				i++;
			}
			
			k++;
		}
		
		while(i<n1){
			arr[k] = arr1[i];
			i++;
			k++;
		}
		
		while(j<n2){
			arr[k] = arr2[j];
			j++;
			k++;
		}
	//	return arr;
	}
}
