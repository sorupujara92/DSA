
public class binSearch {
	public static void main(String x[]){
		
		int a[] = new int[]{1,4,8,99,111,555,666,999};
		
		int element = 8;
		int low = 0;
		int high = a.length-1;
		while(low<=high){
			
			int mid = (low+high)/2;
			if(a[mid]==element){
				System.out.println("found element"+mid);
				break;
			}
			/*if(a[low]==element){
				System.out.println("found element"+low);
				break;
			}
			
			if(a[high]==element){
				System.out.println("found element"+high);
				break;
			}*/
			if(element > a[mid]){
				low = mid+1;
			}else{
				high = mid-1;
			}
		}
		
		
	}
}
