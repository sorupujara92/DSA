import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;


public class shortestPathMultipleSource {


	int n;
	LinkedList<Integer> ll[];
	shortestPathMultipleSource(int n){
		this.n = n;
		ll = new LinkedList[n];
		for(int i=0;i<n;i++){
			ll[i] = new LinkedList<Integer>();
		}
		
	}
	
	static HashMap<Integer,ArrayList<Integer>> hm= new HashMap<Integer,ArrayList<Integer>>();

	
	public void bfs(Integer n,boolean bn[],ArrayList<Integer> path){
		bn[n] = true;
		LinkedList<Integer> loop = new LinkedList<Integer>();
		HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
		
		if(n==8){
			System.out.println(path);
		}
			Iterator<Integer> itr = ll[n].iterator();
			while(itr.hasNext()){
				Integer tempInteger = itr.next();
				if(bn[tempInteger]==false){
					path.add(tempInteger);
					bfs(tempInteger,bn,path);
					path.remove(tempInteger);

				}
			}
			bn[n] = false;
	}
	void addEdge(int n,int v){
		this.ll[n].add(v);
	//	this.ll[v].add(n);
	}
	public static void main(String x[]){
		shortestPathMultipleSource g = new shortestPathMultipleSource(9);
		
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(4, 5);
		g.addEdge(5, 6);
		g.addEdge(6, 7);

		g.addEdge(7, 0);

		g.addEdge(1, 7);
		
		g.addEdge(7, 8);
		
		g.addEdge(2, 8);
		g.addEdge(8, 6);
		g.addEdge(2, 5);
		g.addEdge(3, 5);
		
		
		boolean bn[] = new boolean[g.n];
		ArrayList<Integer> path = new ArrayList<Integer>();
		g.bfs(0,bn,path);
		/*Iterator<Integer> itr = hm.keySet().iterator();
		ArrayList<Integer> values= hm.get(8);
		for(Integer k : values){
			
		}*/
	}


}
