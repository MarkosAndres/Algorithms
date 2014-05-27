package com.marcos.businessdelegate;

public class BusinessDelegate{
	BusinessService businessService = null;
	BusinessLookUp businessLookUp = new BusinessLookUp();
	String serviceType = null;
	
	public void setServiceType(String serviceType){
		this.serviceType = serviceType;
	}
	
	public void doTask(){
		businessService = businessLookUp.getBusinessService(serviceType);
		businessService.doProcessing();
	}
}