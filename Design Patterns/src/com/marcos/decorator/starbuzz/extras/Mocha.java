package com.marcos.decorator.starbuzz.extras;

import com.marcos.decorator.starbuzz.beverages.Beverage;

public class Mocha extends ExtrasDecorator{
	
	public Mocha(Beverage beverage){
		super(beverage);
	}
	
	public float cost(){
		return 0.3f + getBeverage().cost();
	}

	@Override
	public String getDescription()
	{
		// TODO Auto-generated method stub
		return null;
	}
}