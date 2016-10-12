package com.marcos.strategy.duck;

public class FlyNoWay implements FlyBehavior
{

	@Override
	public String fly()
	{
		return "You can't fly!";
	}

}