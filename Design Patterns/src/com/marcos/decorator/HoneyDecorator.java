package com.marcos.decorator;

public class HoneyDecorator extends IcecreamDecorator{
	
	public HoneyDecorator(Icecream icecream){
		super(icecream);
	}
	
	@Override
	public void makeIcecream(){
		icecream.makeIcecream();
		addHoney();
	}
	
	public void addHoney(){
		System.out.println("Add honey");
	}
}