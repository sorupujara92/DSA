package moderate;

import java.util.Arrays;

public class LivingPeople {

	public static void main(String x[]){
		int birth[]=new int[]{12,20,10,01,10,23,13,90,83,75};
		int death[]=new int[]{15,90,98,72,98,82,98,98,99,94};
		int maxPeopleAlive=0;
		int maxYearPeopleAlive=0;
		Arrays.sort(birth);
		Arrays.sort(death);
		int i=0,j=0;
		int peopleAlive=0;
		while(i<birth.length){
			
			if(i<birth.length){
				if(birth[i]<death[j]){
					peopleAlive++;
					i++;

					if(peopleAlive>maxPeopleAlive){
						maxPeopleAlive=peopleAlive;
						maxYearPeopleAlive=birth[i];
					}
				}else if(j<death.length){
					peopleAlive--;
					j++;
				}
			}
			
		}
		
		System.out.println(maxPeopleAlive+"--"+maxYearPeopleAlive);
	}
}
