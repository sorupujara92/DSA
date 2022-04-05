package com.RecursionAndDynamicProgramming;

import java.util.ArrayList;

public class CountSteps {
static Integer ways = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer count = 4;
		CountSteps cs = new CountSteps();
		cs.countSteps(count);
		
		
		
	}
	
	void countSteps(Integer count){
		//while(count>0){
			count = countHops(count);
			
	//	}
		System.out.println(count);
	}

	
	 Integer countHops(Integer count){
		 if(count==0){
			 return 1;
		 }else if(count<0){
			 return 0;
		 }else{
		 count =  countHops(count-1)+countHops(count-2)+countHops(count-3);
		 return count;
		 }
	}
}
