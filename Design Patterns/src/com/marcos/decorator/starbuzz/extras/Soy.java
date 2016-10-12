package com.marcos.decorator.starbuzz.extras;

import com.marcos.decorator.starbuzz.beverages.Beverage;

public class Soy extends ExtrasDecorator{
	
	public Soy(Beverage beverage){
		super(beverage);
	}

	public float cost(){
		return 0.2f + getBeverage().cost();
	}

	@Override
	public String getDescription()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
