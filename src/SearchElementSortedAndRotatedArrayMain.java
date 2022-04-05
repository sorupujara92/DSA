public class SearchElementSortedAndRotatedArrayMain {
 
	public static void main(String[] args) {
		
		int arrival[] = {100, 140, 150, 200, 215, 400};
		int departure[] = {110, 300, 220, 230, 315, 600};
		
		int i=0;
		int j=0;
		Integer count = 0;
		Integer maxCount = 0;
		while(i<arrival.length && j<departure.length){
			if(departure[j]>arrival[i]){
				count++;
				if(count>maxCount){
					maxCount = count;
				}
				i++;
			} else {
				count --;
				j++;
			}
			
		}
		
		System.out.println(maxCount);
	}
}
 