package com.RecursionAndDynamicProgramming;

import java.util.ArrayList;

public class sumCoins {
	public static void main(String x[]){
		Integer n = 25;
		sumCoins s = new sumCoins();
		s.calculateCoins(8);
	}
	
	void calculateCoins(Integer sum){
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ArrayList<Integer> coins = new ArrayList<Integer>();
		coins.add(1);
		coins.add(5);
		coins.add(25);
		calculateTotalCoins(sum,ar,coins);
	}
	
	public void calculateTotalCoins(Integer sum,ArrayList<Integer> ar,ArrayList<Integer>  coins){
		if(sum<0){
			return;
		}
		if(sum==0){
			System.out.println(ar);
			return;
		}
		
		for(Integer coin : coins){
				
				ar.add(coin);

				calculateTotalCoins(sum-coin,ar,coins);
				ar.remove(coin);
		

		}
		
	}

}
