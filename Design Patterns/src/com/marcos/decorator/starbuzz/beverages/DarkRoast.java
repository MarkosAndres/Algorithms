package com.marcos.decorator.starbuzz.beverages;

public class DarkRoast extends Beverage{
	
	public DarkRoast(){
		setDescription("Dark Roast");
	}

	@Override
	public float cost() {
		return 1.5f;
	}
	
}