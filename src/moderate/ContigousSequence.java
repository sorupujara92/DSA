package moderate;

public class ContigousSequence {
	public static void main(String x[]){
		
		int arr[] = new int[]{2,-8,3,-2,4,-10};
		
		int sum = 0;
		int maxSum = 0;
		for(int i=0;i<arr.length;i++){
			sum = sum +arr[i];
			if(sum<0){
				sum =0;
			}
			if(sum>maxSum){
				maxSum = sum;
			}
			
		}
		
		System.out.println(maxSum);
	}
}
