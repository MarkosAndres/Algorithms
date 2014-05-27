package com.marcos.factory;

public class Main {

	public static void main(String[] args) {
		PetFactory petFactory = new PetFactory();
		
		Pet pet = petFactory.getPet("bark");
		
		System.out.println(pet.speak());
	}

}