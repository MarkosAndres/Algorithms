package com.marcos.singleton;

public class StaticBlockSingleton {

	private static StaticBlockSingleton singleton;
	
	private StaticBlockSingleton(){}
	
	private StaticBlockSingleton getInstance(){
		return singleton;
	}
	
	static{
		try{
			singleton = new StaticBlockSingleton();
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
}