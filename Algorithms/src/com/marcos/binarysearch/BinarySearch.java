package com.marcos.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BinarySearch {
	
	private ArrayList<Integer> list;
	
	public static void main(String[] args) {
		
		BinarySearch bs = new BinarySearch();
		
		int key = bs.list.get(new Random().nextInt(bs.list.size()-1));
		int start = 0;
		int end = bs.list.size()-1;
		bs.binarySearch(key, start, end, bs.list);
	}	
	
	public void binarySearch(int key, int start, int end, List array){
		System.out.println("key: "+key);
		System.out.println("start: "+start);
		System.out.println("end: "+end+"\n");
		
		int position;
		int comparisonCount = 0;
		
		position = (start + end) / 2;
		
		while(list.get(position) != key && start <= end){
			++comparisonCount;
			
			if(list.get(position) > key){
				end = position - 1;
			}else{
				start = position + 1;
			}
			
			position = (start + end) / 2;
		}
		
		if(start <= end){
			System.out.println("The number was found in array index: " + position);
			System.out.println("The binary search found the number after " + comparisonCount + " comparisons.");
		} else
	          System.out.println("Sorry, the number is not in this array.  The binary search made "+comparisonCount  + " comparisons.");
	  
		System.out.println();
		for(int i : list)
			System.out.print(i + " ,");
	}
	
	//CONSTRUCTOR
	public BinarySearch(){
		this.list = new ArrayList<Integer>();
		Random randomNumber = new Random();
		
		for(int i = 0; i <= 12; ++i){
			list.add(randomNumber.nextInt(100));
		}
		
		Collections.sort(list);
	}
}