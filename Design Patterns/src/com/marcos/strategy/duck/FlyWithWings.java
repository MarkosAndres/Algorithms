package com.marcos.strategy.duck;

public class FlyWithWings implements FlyBehavior
{

	@Override
	public String fly()
	{	
		return "I'm flying!!";
	}

}