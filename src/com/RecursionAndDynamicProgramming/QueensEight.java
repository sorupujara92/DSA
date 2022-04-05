package com.RecursionAndDynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;

public class QueensEight {
	static Integer count = 0;
	public static void main(String x[]){
		
		int board[][]=new int[8][8];
		ArrayList<String> result =new ArrayList<String>();
		new QueensEight().placeQueens(board);
	}
	
	void placeQueens(int board[][]){
		ArrayList<String> result =new ArrayList<String>();
		HashMap<Integer,Integer> resultColumns=new HashMap<Integer,Integer>();
	//	for(int i=1;i<8;i++){
			placeQueensPositions(board,resultColumns,8,count);
	//	}
	}
	
	void placeQueensPositions(int board[][],HashMap<Integer,Integer> resultColumns,Integer i,Integer count){
		resultColumns.put(count, count);
		for(int row=0;row<i;row++){
			resultColumns =checkIfValid(row,i,resultColumns);
			if(resultColumns==null){
				resultColumns = new HashMap<Integer,Integer>();
				placeQueensPositions(board,resultColumns,i,count+1);
			}
		}
		for (Integer name: resultColumns.keySet()){

            String key =name.toString();
            String value = resultColumns.get(name).toString();  
            System.out.println(key + " " + value);  


} 	}
	
	public HashMap<Integer,Integer> checkIfValid(Integer row,Integer i ,HashMap<Integer,Integer> resultColumns){
		boolean flag = false;

		Integer temp =null;
			for(int k=0;k<=8;k++){
				if(flag==true){
					temp = k-1;
					break;
				}
				if(resultColumns.values().contains(k)==false){
					for(Integer key:resultColumns.keySet()){
						
						if(Math.abs(key-row) - Math.abs(k-resultColumns.get(key))==0){
							temp = null;
							flag = false;
							continue;
						}
						flag=true;
						temp = k;
					}
					
				}
			}
			resultColumns.put(row, temp);
			if(temp==null){
				return null;
			}
		return resultColumns;
		
	}
}
