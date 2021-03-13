package com.marcos.fibonacci;

public class TestFibonacci {
	
	public static void main(String[] args) {
		
		int number = 8;
		
		System.out.println(fr(number));
		System.out.println(fi(number));
	}
	
	//RECURSION
	static int fr(int n){
		if(n < 2)
			return n;
		else
			return fr(n-1)+fr(n-2);
	}
	
	//ITERATION
	static int fi(int n){
		int prev1 = 0;
		int prev2 = 1;
		int savePrev1;
		
		for(int i = 0; i < n; ++i){
			savePrev1 = prev1;
			prev1 = prev2;
			prev2 = savePrev1 + prev2;
		}
		
		return prev1;
	}
}

//ESTE ARCHIVO PUEDE BORRARSE ES DE PRACTICA