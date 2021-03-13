package com.marcos.quicksort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuicksortTest {

	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {		
		Random random = new Random();

		for(int i = 0; i < 11; ++i){
			list.add(random.nextInt(100));
		}

		print(list);

		quickSort(0, list.size()-1);

		print(list);
	}

	static void quickSort(int low, int high){
		int i = low;
		int j = high;

		int pivot = list.get(low + (high - low)/2);

		while(i <= j){
			while(list.get(i) < pivot)
				i++;

			while(pivot < list.get(j))
				j--;

			if(i <= j){
				transfer(i, j);
				i++;
				--j;
			}

			if(low < j)
				quickSort(low, j);
			if(i < high)
				quickSort(i, high);
		}
	}

	static void transfer(int i, int j){
		int temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}

	public static void print(List<Integer> list){
		for(int i : list){
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

//ESTE ARCHIVO PUEDE BORRARSE ES DE PRACTICA