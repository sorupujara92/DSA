package com.RecursionAndDynamicProgramming;

import java.util.ArrayList;
class Point{
	
	int x;
	int y;
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString(){
		return x+"-"+y;
	}
}
public class RobotInGrid {

	
	
	public static void main(String x[]){
		
		Integer arr[][] = new Integer[6][8];
		//ArrayList<Integer> path = new ArrayList<Integer>();
		
		RobotInGrid rg = new RobotInGrid();
		rg.findPath(arr);
		
	}
	
	void findPath(Integer arr[][]){
		ArrayList<Point> path = new ArrayList<Point>();
		boolean b[][] = new boolean[6][8];
		if(findSourceToDest(arr,path,0,0,b)){
			System.out.println(path);
		}
		
	}
	
	boolean findSourceToDest(Integer arr[][],ArrayList<Point> path,Integer row,Integer column,boolean b[][]){

		if(row>5 || column>7){
			return false;
		}
		if(b[row][column]==true){
			return false;
		}
		b[row][column]=true;
		if(row==5 && column==7){
			return true;
		}
		
	    if((findSourceToDest(arr,path,row+1,column,b)) || (findSourceToDest(arr,path,row,column+1,b))){
			path.add(new Point(row,column));

			return true;
		}

	    return true;
	
	}
}
