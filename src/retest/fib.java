package retest;

import java.util.HashMap;

public class fib {
	static HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();

	public static void main(String x[]){
		int n= fib(9);
		System.out.println(n);
	}
	public static int fib(int n){
		if(hm.get(n)!=null){
			return hm.get(n);
		}
		if(n<=1){
			hm.put(n,n);
			return n;
		}
	hm.put(n, fib(n-1)+fib(n-2));
		return fib(n-1)+fib(n-2);
	}
}
