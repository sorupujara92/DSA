package sortingAndRecursion;

public class QuickSort {
	
	public static void main(String x[]){
		int a[] = new int[]{10,80,40,60,25,40,66,24};
		
		new QuickSort().quickSortElements(a);
		
	}
	
	public void quickSortElements(int arr[]){
		quickSortElementsRecu(arr,0,arr.length-1);
		
		 for (int element: arr) {
	            System.out.println(element);
	        }
	}
	
	public int[] quickSortElementsRecu(int arr[],int low,int high){
		if(low<high){
			Integer pi = partitionElements(arr,low,high);
			arr = quickSortElementsRecu(arr,pi+1,high);
			arr =quickSortElementsRecu(arr,low,pi-1);
		}
		return arr;
	}
	public Integer partitionElements(int arr[],int low,int high){
		int pivotIndex = high;
		Integer pivot  = arr[high];
		boolean lowFlag = false;
		boolean highFlag=false;
		while(low<high){
			if(arr[high]<pivot){
				highFlag=true;
			}
			if(highFlag==false){
				high--;
			}
			if(arr[low]>pivot){
				lowFlag=true;
			}
			
			if(lowFlag==false){
				low++;
			}
			if(lowFlag && highFlag){
				int temp = arr[high];
				arr[high] = arr[low];
				arr[low]=temp;
				highFlag = false;
				lowFlag = false;
			}
		}
		if(arr[pivotIndex] < arr[low] )	{
			int temp = arr[pivotIndex];
			arr[pivotIndex] = arr[low];
			arr[low]=temp;
		}
		return low;
	}
}
