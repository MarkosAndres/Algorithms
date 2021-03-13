package com.marcos.bubblesort;

public class BubbleSort {
	
	public void findTheBlank(int[] theNumbers) {
        int sumOfAllNumbers = 0;
        int sumOfNumbersPresent = 0;
        int blankSpace = 0;
 
        for (int i = 0; i < theNumbers.length; i++) {
        	System.out.print("sumOfAllNumbers = "+sumOfAllNumbers+" + ("+i+" + 1)");
        	sumOfAllNumbers += (i + 1);            
        	System.out.println(" = "+sumOfAllNumbers);
            sumOfNumbersPresent += theNumbers[i];
            if (theNumbers[i] == 0)
                blankSpace = i;
        }
        System.out.println(
        		"Missing number = " + (sumOfAllNumbers - sumOfNumbersPresent) + 
        		" at location " + blankSpace +" of the array");
    }
	
	
	public static void main(String[] args) {
		new BubbleSort().findTheBlank(new int[]{0,6,5,1,3,2,4});
	}	
}