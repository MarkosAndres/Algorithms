package com.marcos.decorator.starbuzz.extras;

import com.marcos.decorator.starbuzz.beverages.Beverage;

public class Whip extends ExtrasDecorator{
	
	public Whip(Beverage beverage){
		super(beverage);
	}

	public float cost(){
		return 0.1f + getBeverage().cost();
	}
}
