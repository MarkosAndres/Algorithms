package com.marcos.quicksort;

import java.util.Random;

public class Quicksort  {
	  private int[] numbers;
	  private int number;
	  
	  public static void main(String[] args) {
		  int[] values = new int[7];
		  Random r = new Random();
		
		  for(int i = 0; i < 7; ++i){
			  values[i] = r.nextInt(100);
		  }
		  
		  values = new int[7];
		  values[0] = 3;
		  values[1] = 59;
		  values[2] = 96;
		  values[3] = 25;
		  values[4] = 95;
		  values[5] = 33;
		  values[6] = 67;
		  
		  Quicksort q = new Quicksort();
		  q.sort(values);
	  }

	  public void sort(int[] values) {
	    // check for empty or null array
	    if (values ==null || values.length==0){
	      return;
	    }
	    this.numbers = values;
	    number = values.length;
	    quicksort(0, number - 1);
	  }

	  private void quicksort(int low, int high) {
	    int i = low, j = high;
	    // Get the pivot element from the middle of the list
	    int pivot = numbers[low + (high-low)/2];
	    System.out.println("\nPivot: "+pivot);

	    // Divide into two lists
	    while (i <= j) {
	      // If the current value from the left list is smaller than the pivot
	      // element then get the next element from the left list
	      while (numbers[i] < pivot) {
	        i++;
	      }
	      // If the current value from the right list is larger than the pivot
	      // element then get the next element from the right list
	      while (numbers[j] > pivot) {
	        j--;
	      }

	      // If we have found a value in the left list which is larger than
	      // the pivot element and if we have found a value in the right list
	      // which is smaller then the pivot element then we exchange the
	      // values.
	      // As we are done we can increase i and j
	      if (i <= j) {
	        exchange(i, j);
	        i++;
	        j--;
	      }
	      
	      for(int f : numbers){
	    	  System.out.print(f+" ");
	      }
	      System.out.println();
	      
	    }
	    // Recursion
	    if (low < j)
	      quicksort(low, j);
	    if (i < high)
	      quicksort(i, high);
	    
	    System.out.println("?");
	  }

	  private void exchange(int i, int j) {
	    int temp = numbers[i];
	    numbers[i] = numbers[j];
	    numbers[j] = temp;
	  }
	} 