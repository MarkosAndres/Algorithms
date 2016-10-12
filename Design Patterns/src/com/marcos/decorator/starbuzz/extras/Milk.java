package com.marcos.decorator.starbuzz.extras;

import com.marcos.decorator.starbuzz.beverages.Beverage;

public class Milk extends ExtrasDecorator{
	
	public Milk(Beverage beverage){
		super(beverage);
	}

	public float cost(){
		return 0.6f + getBeverage().cost();
	}

	@Override
	public String getDescription()
	{
		return null;
	}
}
