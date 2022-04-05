package moderate;

import java.sql.PseudoColumnUsage;

public class MasterMind {

	static int  findCode(String grade){
		
		switch(grade){
		
		case "R":
			return 0;
		case "Y":
			return 1;
		case "G":
			return 2;
		case "B":
			return 3;
		default:
			return -1;
		
		}		
	}
	
	public static void main(String x[]){
		int[] frequencies = new int[4];
		int hit=0;
		int pseduoHit=0;
		String solution="RGBY";
		String guss="GGYR";
		
		for(int i=0;i<solution.length();i++){
			if(solution.charAt(i)==guss.charAt(i)){
				hit++;
			}else{
				int code = findCode(String.valueOf(solution.charAt(i)));
				frequencies[code]++;
				
			}
		}
		
		for(int i=0;i<guss.length();i++){
			if(solution.charAt(i)!=guss.charAt(i) && frequencies[findCode(String.valueOf(guss.charAt(i)))]>0){
				pseduoHit++;
				frequencies[findCode(String.valueOf(guss.charAt(i)))]--;
			}
		}	
		System.out.println(hit+"--"+pseduoHit);	
		
	}
	
	
}
