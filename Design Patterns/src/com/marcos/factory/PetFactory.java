package com.marcos.factory;

public class PetFactory {
	
	public Pet getPet(String type){
		Pet pet = null;
		
		if(type.equals("bark")){
			pet = new Dog();
		}else if(type.equals("quack")){
			pet = new Duck();
		}
		
		return pet;
	}
	
}