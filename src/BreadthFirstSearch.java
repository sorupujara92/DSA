import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;


public class BreadthFirstSearch {
	
	
		int n;
		LinkedList<Integer> ll[];
		
		
		BreadthFirstSearch(int n){
			this.n = n;
			ll = new LinkedList[n];
			for(int i=0;i<n;i++){
				ll[i] = new LinkedList<Integer>();
			}
			
		}
		
		void addEdge(int n,int v){
			this.ll[n].add(v);
		}
	
	
	public void bfs(Integer n){
		boolean bn[] = new boolean[this.n];
		bn[n] = true;
		LinkedList<Integer> loop = new LinkedList<Integer>();
		HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
		loop.add(n);
		while(!loop.isEmpty()){
			Integer temp = loop.poll();
		//	System.out.println(temp);
			Iterator<Integer> itr = ll[temp].iterator();
			while(itr.hasNext()){
				Integer tempInteger = itr.next();
				if(bn[tempInteger]==false){
					bn[tempInteger] = true;
					hm.put(tempInteger, temp);
					loop.add(tempInteger);
				}
			
			}
		}
	
		Integer destination = 4;
		Integer source = 6;
		Integer temp  = hm.get(destination);
		String s= String.valueOf(temp);
		while(temp!=source){
			temp = hm.get(temp);
			s = s+temp;
		}
		System.out.println(s);
	}
	
	public void dfs(Integer n,boolean bn[]){
		LinkedList<Integer> loop = new LinkedList<Integer>();
		loop.add(n);
		//System.out.println(n);
		bn[n] = true;
		while(!loop.isEmpty()){
			
			Integer ll2 = loop.poll();
			System.out.println(ll2);
			Iterator<Integer> itr = this.ll[ll2].iterator();
			while(itr.hasNext()){
				Integer temp = itr.next();
				if(bn[temp]==false)
				dfs(temp,bn);
			}
			
			
		}
	}
	public static void main(String x[]){
		BreadthFirstSearch g = new BreadthFirstSearch(9);
		
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(2, 6);
		g.addEdge(3, 4);
		g.addEdge(4, 5);
		g.addEdge(6, 1);
		g.addEdge(6, 8);
//		
//		g.bfs(6);
		boolean bn[] = new boolean[g.n];
g.dfs(2, bn);


	}
}
