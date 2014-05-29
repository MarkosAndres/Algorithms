package com.marcos.decorator.starbuzz.beverages;

public class Decaf extends Beverage{
	
	public Decaf(){
		setDescription("Decaf");
	}

	@Override
	public float cost() {
		return 0.9f;
	}

}
