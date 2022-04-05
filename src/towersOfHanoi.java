
public class towersOfHanoi {
public static void main(String x[]){
	
	
	int n=5;
	towersOfHanoi(5,"A","B","C");
}

public static void towersOfHanoi(int n,String from,String aux,String to){
	if(n==1)
		System.out.println("moving disc 1 from "+from +" to" + to);
	else{	
	towersOfHanoi(n-1,from,to,aux);
	System.out.println("moving disk "+ n +" from " + from +"to "+to);
	towersOfHanoi(n-1,aux,from,to);
	}
}
}
