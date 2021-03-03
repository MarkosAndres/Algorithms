package com.marcos.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BinarySearch {
	public static void main(String[] args) {
		int index = doBinarySearch(1024);
		System.out.println("Value is at index: " + index);
	}

	public static int doBinarySearch(int value) {
		Integer[] numbers = new Integer[]{1,9,23,24,38,41,45,49,50,51,66,963,1024,2222,3564,8888};

		int low = 0;
		int high = numbers.length - 1;
		int mid = 0;
		int guess = 0;

		int iterations = 0;
		int index = -1;

		while(low <= high) {
			iterations++;
			mid = (high + low) / 2;
			guess = numbers[mid];

			if(guess == value) {
				index = mid;
				break;
			}
			else if(guess < value) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}

		System.out.println("Number of iterations: "+iterations);
		return index;
	}
}