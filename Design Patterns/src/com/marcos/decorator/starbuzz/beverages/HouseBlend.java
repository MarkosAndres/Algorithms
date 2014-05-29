package com.marcos.decorator.starbuzz.beverages;

public class HouseBlend extends Beverage{

	public HouseBlend(){
		setDescription("HouseBlend");
	}
	
	@Override
	public float cost() {
		return 1.2f;
	}
}