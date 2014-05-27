package com.marcos.businessdelegate;

public class Client {
	public static void main(String[] args) {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("JMS");
		
		businessDelegate.doTask();
	}
}