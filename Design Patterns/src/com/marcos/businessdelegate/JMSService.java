package com.marcos.businessdelegate;

public class JMSService implements BusinessService{

	@Override
	public void doProcessing() {
		System.out.println("JMS PROCESSING");
	}

}