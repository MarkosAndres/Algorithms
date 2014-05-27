package com.marcos.palindrome;

public class Palindrome {
	public static void main(String[] args) {
		
		String original = "anita lava la tina";
		String reverse = "";
		
		//remove spaces
		original = original.replaceAll(" ","");
		
		int length = original.length();
		
		for(int i = length - 1; i >= 0; i--){
			reverse = reverse + original.charAt(i);
		}
		
		if(original.equals(reverse))
			System.out.println("Its a palindrome");
		else
			System.out.println("Not a palindrome");
	}
}