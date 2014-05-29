package com.marcos.decorator.icecream;

public abstract class IcecreamDecorator implements Icecream{
	
	protected Icecream icecream;
	
	public IcecreamDecorator(Icecream icecream){
		this.icecream = icecream;
	}
		
//	@Override
//	public void makeIcecream(){
//		icecream.makeIcecream();
//	}
}