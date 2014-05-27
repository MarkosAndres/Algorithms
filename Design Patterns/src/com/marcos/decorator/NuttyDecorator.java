package com.marcos.decorator;

public class NuttyDecorator extends IcecreamDecorator{
	
	public NuttyDecorator(Icecream icecream){
		super(icecream);
	}
	
	@Override
	public void makeIcecream(){
		icecream.makeIcecream();
		addNuts();
	}
	
	public void addNuts(){
		System.out.println("Add nuts");
	}
}