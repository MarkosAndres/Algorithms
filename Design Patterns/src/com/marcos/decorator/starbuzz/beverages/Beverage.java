package com.marcos.decorator.starbuzz.beverages;

/**
 * 
 * @author Markos
 * 5/28/2014
 *
 */
public abstract class Beverage {
	private String description = "Unknown Beverage";
	
	public String getDescription(){
		return this.description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public abstract float cost();
}