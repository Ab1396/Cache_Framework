package com.cache.person;

import org.apache.log4j.Logger;

import com.cache.address.Address;

public class Person {
	String name;
	Integer age;
	Address address;
	String adharNumber;
	Logger logger=Logger.getLogger(Person.class);
	//BasicConfigurator.configure();
	
	public Person(String name,Integer age,Address address,String adharNumber)
	{
		this.name=name;
		this.age=age;
		this.address=address;
		this.adharNumber=adharNumber;
	}

	public void display()
	{
		
		logger.info("Name:"+this.name);
		logger.info("Age:"+this.age);
		this.address.display();
		logger.info("Adhar:"+this.adharNumber);
		logger.info("----------------");
	}
}
