package com.marcos.reverseanumber;

public class ReverseANumber {

	public static void main(String[] args) {
		System.out.println(reverseANumber(46588721));
	}
	
	public static int reverseANumber(int number){
		int reversed = 0;
		
		while(number > 0){
			reversed *= 10;
			reversed = reversed + number % 10;
			number /= 10;
		}
		
		return reversed;
	}
	
}