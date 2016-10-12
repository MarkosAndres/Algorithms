package com.marcos.strategy.duck;

public class App
{
	public static void main(String[] args)
	{
		Duck mallardDuck = new MallardDuck();
		Duck rubberDuck = new RubberDuck();
		Duck decoyDuck = new DecoyDuck();
		
		System.out.println(mallardDuck.performFly());
		System.out.println(mallardDuck.performQuack());
		System.out.println("-----------------------");
		System.out.println(rubberDuck.performFly());
		System.out.println(rubberDuck.performQuack());
		System.out.println("-----------------------");
		System.out.println(decoyDuck.performFly());
		System.out.println(decoyDuck.performQuack());
	}
}