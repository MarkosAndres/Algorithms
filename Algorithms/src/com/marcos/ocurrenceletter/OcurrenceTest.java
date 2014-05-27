package com.marcos.ocurrenceletter;

import java.util.HashMap;

public class OcurrenceTest {

	public static void main(String[] args) {
		
		String s ="eosooote es el que toooe llllllllllllllllllllestaba en eso";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int mostFreq = 0;
		char mostChar = ' ';
		
		for(int i = 0; i < s.length(); ++i){
			char ch = s.charAt(i);
			
			if(!map.containsKey(ch))
				map.put(ch, 1);
			else
				map.put(ch, map.get(ch) + 1);
			
			if(map.get(ch) > mostFreq){
				mostFreq = map.get(ch);
				mostChar = ch;
			}
		}
		System.out.println(mostChar);
	}
}
//ESTE ARCHIVO PUEDE BORRARSE ES DE PRACTICA