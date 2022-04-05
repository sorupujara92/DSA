package high;

public class Shuffle {
	
	public static void main(String x[]){
		
		int cards[] = new int[52];
		for(int i=0;i<52;i++){
			cards[i] = i+1;
		}
		for(int i=0;i<cards.length;i++){
			int k = rand(0,i);
			int temp = cards[i];
			cards[i] = cards[k];
			cards[k] = temp;
			
		}
		
		for(int i=0;i<52;i++){
			System.out.println(cards[i]);
		}
	}
	
	public static int rand(int lower,int higher){
		return lower+(int)(Math.random()*(higher-lower+1));
		
	}
}
