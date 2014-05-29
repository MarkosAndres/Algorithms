package com.marcos.decorator.starbuzz.beverages;

import com.marcos.decorator.starbuzz.extras.Mocha;
import com.marcos.decorator.starbuzz.extras.Whip;

public class App {

	public static void main(String[] args) {
		Whip whip = new Whip(new Mocha(new DarkRoast()));
		System.out.println("Cost: "+whip.cost());
	}
}