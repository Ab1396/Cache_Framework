package com.cache.address;

import org.apache.log4j.Logger;

public class Address {
	
	String street;
	String city;
	String state;
	Integer pinCode;
	String houseNumber;
	Logger logger=Logger.getLogger(Address.class);
	
	public Address(String houseNumber,String street,String city,String state,Integer pinCode) {
		// TODO Auto-generated constructor stub
		this.street=street;
		this.city=city;
		this.state=state;
		this.pinCode=pinCode;
		this.houseNumber=houseNumber;
	}
	
	public void display()
	{
		
		logger.info("Address: "+this.houseNumber+" "+this.street+" "+this.city+" "+this.state+" "+this.pinCode);
	}
}
