package com.RecursionAndDynamicProgramming;

import java.util.ArrayList;

public class allSubsetSet {
	public static void main(String x[]){
		ArrayList<String> set = new ArrayList<String>();
		set.add("a1");
		set.add("a2");
		set.add("a3");
		set.add("a4");
		new allSubsetSet().getAllSubSet(set);
	}
	
	void getAllSubSet(ArrayList<String> set){
		ArrayList<String> subSet = new ArrayList<String>();
		for(String s: set){
		subSet =getSubSet(s,subSet);
		}
		System.out.println(subSet);
	}
	
	ArrayList<String> getSubSet(String set,ArrayList<String> subSet){
		ArrayList<String> temp = new ArrayList<String>();
		temp.addAll(subSet);
		temp.add(set);
		for(String s:subSet){
			temp.add(s+"-"+set);
		}
		return temp;
	}
}
