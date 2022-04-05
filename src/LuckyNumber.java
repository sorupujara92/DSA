import java.util.Date;


public class LuckyNumber {

	// input : date range  : start and end date dd-mm-yyyy
	// days in range which lucky days
	//
	// 1-30 : 3-- 10
	public static void main(String[] args) {
		int daysInMonth[] = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		int luckyNumber = 3;
		int startMonth = 1;
		int startDate = 5;
		int endMonth = 2;
		int endDate = 20;
		int totalNoOfDays=0;
		
		totalNoOfDays = totalNoOfDays+ daysInMonth[startMonth]/luckyNumber - startDate/luckyNumber;				
		totalNoOfDays = totalNoOfDays+ endDate/luckyNumber;		
		
		
		for(int k=startMonth+1;k<endMonth;k++){
				totalNoOfDays = totalNoOfDays+ daysInMonth[k]/luckyNumber;
		}
		
		System.out.println(totalNoOfDays);

	}

}
