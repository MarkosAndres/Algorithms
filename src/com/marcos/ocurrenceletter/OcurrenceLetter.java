package com.marcos.ocurrenceletter;

public class OcurrenceLetter {
	public static void main(String[] args) {
	
		String s = "este es el que te estaba en eso";
		s = "anita lava la tina";
		
		int mostFrec = 0;
		char mostChrt = ' ';
		
		for(int i = 0; i < s.length(); i++){
			char chrt = s.charAt(i);
			int count = 0;
			
			for (int j = s.indexOf(chrt); j != -1; j = s.indexOf(chrt, j + 1)) {
				count++;
			}
			
			if(count > mostFrec){
				mostFrec = count;
				mostChrt = chrt;
			}
		}
		System.out.println(mostChrt);
	}
}