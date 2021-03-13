package com.marcos.palindrome;

public class PalindromeTest {

	public static void main(String[] args) {
		String original = "anita lava la tina";
		original = original.replace(" ", "");
		
		String reverse = "";
		
		for(int i = original.length()-1; i >= 0; i--){
			reverse += original.charAt(i);
		}
		
		if(reverse.equals(original))
			System.out.println("It is palindrome");
		else
			System.out.println("It is not palindrome");
	}

}

//ESTE ARCHIVO PUEDE BORRARSE ES DE PRACTICA