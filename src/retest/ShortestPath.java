package retest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ShortestPath {
	static LinkedList<Integer> ll[];

	public static void main(String x[]){
		ll = new LinkedList[10];
		for(int i=0;i<10;i++){
			ll[i] = new LinkedList();
		}
		ShortestPath g = new ShortestPath();
		g.addEdge(0, 1);
		g.addEdge(0, 7);

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
		g.findShortestPath(0,8);
	}
	
	void addEdge(int a,int b){
		ll[a].add(b);
	//	ll[b].add(a);
	}
	
	void findShortestPath(int start, int destination){
		ArrayList<Integer> path = new ArrayList<Integer>();
		boolean bn[] = new boolean[10];
		path=(findShortestPathPath(start,destination,path,bn));
	}
	
	ArrayList<Integer> findShortestPathPath(int start, int destination,ArrayList<Integer> path,boolean bn[]){
		bn[start]=true;
		LinkedList<Integer> ll1 = ll[start];
		Iterator<Integer> itr = ll1.iterator();
		while(itr.hasNext()){
			Integer n = itr.next();
			if(n==destination){
				System.out.println(path);
				break;
			}
			if(bn[n]==false){
				path.add(n);
				bn[n]=true;
				findShortestPathPath(n,destination,path,bn);
			}
			path.remove(n);
		}
		bn[start]=false;
		return path;
	}
}
