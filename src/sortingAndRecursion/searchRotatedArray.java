package sortingAndRecursion;

public class searchRotatedArray {
	public static void main(String x[]){
		int a[] = new int[]{15,16,19,20,25,1,3,4,5,7,10,14};
		new searchRotatedArray().binarySearch(a,0,a.length-1);
	}
	public void binarySearch(int a[],int start,int end){
		int mid = (start+end)/2;
		if(a[mid]==15){
			System.out.println(mid);
		}
		if(start<end){	
			if(a[mid]<15 && a[end]>15){
				binarySearch(a,mid+1,end);
			}else{
				binarySearch(a,start,mid-1);
	
			}
		}
	}
}
