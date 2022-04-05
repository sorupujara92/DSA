package retest;

import java.util.LinkedList;

public class Bfsdfs {

	static LinkedList<Integer> ll[] = new LinkedList[6];
	
	public void addEdge(int a,int b){
		ll[a].add(b);
	}
	public static void main(String x[]){
		for(int i=0;i<6;i++){
			ll[i] = new LinkedList<Integer>();
		}
		
		ll[0].add(1);
		ll[0].add(5);
		ll[0].add(4);
		ll[1].add(4);
		ll[1].add(3);
		ll[2].add(1);
		ll[3].add(2);
		ll[3].add(4);
		boolean bn[] = new boolean[6];
		//bfs(0,bn);
		
		System.out.println("--------");
		dfs(0,bn);
	}
	
	static void bfs(int n,boolean bn[]){

		LinkedList<Integer> ll1 = ll[n];
		bn[n]=true;
		System.out.println(n);
		while(ll1.isEmpty()==false){
			Integer n1= ll1.poll();
			if(bn[n1]==false){
				bn[n1]=true;
				System.out.println(n1);
			
				ll1.addAll(ll[n1]);
			}
		}
		
	}
	
	static void dfs(int n,boolean bn[]){
		
		LinkedList<Integer> ll1 = ll[n];
		System.out.println(n);
		bn[n]=true;
		while(ll1.isEmpty()==false){
			Integer n1= ll1.poll();
			if(bn[n1]==false){
				bn[n1]=true;

				dfs(n1,bn);
			}
			
			}
		
	}
}
