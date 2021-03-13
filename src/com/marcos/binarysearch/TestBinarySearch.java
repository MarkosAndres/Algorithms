package com.marcos.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TestBinarySearch {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		
		for(int i = 0; i < 11; i++){
			list.add(random.nextInt(100));
		}
		
		Collections.sort(list);
		
		binarySearch(list.get(random.nextInt(list.size()-1)), 0, list.size()-1, list);
	
		for(Integer i: list)
			System.out.print(i+" ");
	}
	
	public static void binarySearch(int key, int lowerbound, int upperbound, List<Integer> list){
		System.out.println("Key: "+ key);
		int position = (lowerbound + upperbound)/2;
		
		while(list.get(position) != key && lowerbound <= upperbound){
			position = (lowerbound + upperbound)/2;
			
			if(list.get(position) < key)
				lowerbound = position + 1;
			else if(list.get(position) > key)
				upperbound = position - 1;
		}
		System.out.println("Found in index: "+position);
	}

}

//ESTE ARCHIVO PUEDE BORRARSE ES DE PRACTICA