package com.marcos.strategy.duck;

public class DecoyDuck extends Duck
{
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	
	@Override
	public void display()
	{
		System.out.println("Decoy Duck");
	}
}