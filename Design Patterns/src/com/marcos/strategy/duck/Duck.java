package com.marcos.strategy.duck;

public abstract class Duck
{
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	public abstract void display();
	
	public String performFly(){
		return flyBehavior.fly();
	}
	
	public String performQuack(){
		return quackBehavior.quack();
	}

	
	
	
	public FlyBehavior getFlyBehavior()
	{
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior)
	{
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior()
	{
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior)
	{
		this.quackBehavior = quackBehavior;
	}
}