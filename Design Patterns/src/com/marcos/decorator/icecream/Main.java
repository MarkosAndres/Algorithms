package com.marcos.decorator.icecream;

public class Main {

	public static void main(String[] args) {
		Icecream ice = new HoneyDecorator(new NuttyDecorator(new SimpleIcecream()));
		ice.makeIcecream();
	}

}
