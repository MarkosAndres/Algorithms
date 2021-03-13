package com.marcos.quicksort;

public class QuickSort {
	private static int[] numbers;

	public static void main(String[] args) {
		int[] values = new int[]{3,5,2,1,4,8,7,6,9};

		// check for empty or null array
		if (values == null || values.length == 0){
			return;
		}
		numbers = values;
		quickSort(0, values.length - 1);
	}

	private static void quickSort(int low, int high) {
		int l = low, h = high;
		// Get the pivot element from the middle of the list
		int mid = (low + high) / 2;
		int pivot = numbers[mid];
		System.out.println("\n-----------------------------------");
		System.out.println("limits: "+low + " "+high);
		printList(false, low, high);
		System.out.println("Pivot: "+pivot);

		// Divide into two lists
		while (l <= h) {
			// If the current value from the left is smaller than the pivot,
			// then get the next element from the left list
			while (numbers[l] < pivot) {
				l++;
			}
			// If the current value from the right is greater than the pivot,
			// then get the next element from the right list
			while (numbers[h] > pivot) {
				h--;
			}

			// If we have found a value in the left list which is greater than
			// the pivot element and if we have found a value in the right list
			// which is smaller then the pivot element then we exchange the
			// values.
			// As we are done we can increase l and h
			System.out.print("Indexes found:  ");
			System.out.println(l + " " +  h);
			System.out.println("l "+l + " <= "+h+ " h  <---"+(l<=h));
			if (l <= h) {
				System.out.print("Numbers swaped: ");
				System.out.println(numbers[l] + " " + numbers[h]);
				exchange(l, h);
				printList(false, low, high);
				l++;
				h--;
			}
		}

		System.out.println("\nThis iteration has ended");
		System.out.println("low  "+low+ " < "+h+" h    <---"+(low<h));
		System.out.println("l    "+l + " < "+high+ " high <---"+(l<high));

		// Recursion
		if (low < h)
			quickSort(low, h);
		if (l < high)
			quickSort(l, high);

		System.out.println("?");
	}

	private static void exchange(int l, int h) {
		int temp = numbers[l];
		numbers[l] = numbers[h];
		numbers[h] = temp;
	}

	private static void printList(boolean newLine) {
		if(newLine) System.out.println();
		for(int f : numbers){
			System.out.print(f + " ");
		}
		System.out.println();
	}

	private static void printList(boolean newLine, int low, int high) {
		if(newLine) System.out.println();
		for(int i = low; i <= high; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}
}
