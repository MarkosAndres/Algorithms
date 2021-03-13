package com.marcos.reverseanumber;

public class ReverseANumberTest {

	public static void main(String[] args) {
		int original = 513648542;
		
		System.out.println(original);
		System.out.println(reverse(original));
	}
	
	public static int reverse(int n){
		int reverse = 0;
		
		while(n > 0){		
			reverse *= 10;
			reverse += n % 10;
			n /= 10;
		}
		
		return reverse;
	}
}

//ESTE ARCHIVO PUEDE BORRARSE ES DE PRACTICA