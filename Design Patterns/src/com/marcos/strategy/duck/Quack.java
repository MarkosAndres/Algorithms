package com.marcos.strategy.duck;

public class Quack implements QuackBehavior
{
	@Override
	public String quack()
	{
		return "Quack";
	}

}