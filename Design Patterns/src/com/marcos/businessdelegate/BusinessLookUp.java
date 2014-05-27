package com.marcos.businessdelegate;

public class BusinessLookUp {
	public BusinessService getBusinessService(String serviceName){
		BusinessService service = null;
		
		if(serviceName.equals("EJB"))
			service = new EJBService();
		else if(serviceName.equals("JMS"))
			service = new JMSService();
	
		return service;
	}
}
