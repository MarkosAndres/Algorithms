package com.marcos.decorator.starbuzz.extras;

import com.marcos.decorator.starbuzz.beverages.Beverage;

public abstract class ExtrasDecorator extends Beverage{
	
	private Beverage beverage;	
	
	public ExtrasDecorator(Beverage beverage){
		this.setBeverage(beverage);
	}
	
	public abstract String getDescription();

	public Beverage getBeverage() {
		return beverage;
	}

	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}
}
