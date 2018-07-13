2package com.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.cache.address.Address;
import com.cache.dynamiccache.DynamicCache;
import com.cache.person.Person;
import com.cache.staticcache.StaticCache;
import com.cipher.aes.CipherAES;
import com.store.database.Database;

public class Main {
	Scanner sc=new Scanner(System.in);
	static Logger logger=Logger.getLogger(Person.class);
	Person readValue()
	{
		Person p;
		Address address;
		String name;
		Integer age;
		String adharNumber;
		
		String street;
		String city;
		String state;
		Integer pinCode;
		String houseNumber;
		
		logger.info("Enter Name");
		name=sc.next();
		logger.info("Enter Age");
		age=sc.nextInt();
		logger.info("Enter Adhar Number");
		adharNumber=sc.next();
		logger.info("Enter Address information:");
		logger.info("Enter House Number");
		houseNumber=sc.next();
		logger.info("Enter Street");
		street=sc.next();
		logger.info("Enter City");
		city=sc.next();
		logger.info("Enter State");
		state=sc.next();
		logger.info("Enter Pin code");
		pinCode=sc.nextInt();
		address=new Address(houseNumber,street,city,state,pinCode);
		p=new Person(name, age, address, adharNumber);
		return p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Person> hm1 = new HashMap<String, Person>();
		List<String> list = new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		BasicConfigurator.configure();
		int count,ch1=0,ch2=0,i;
		Person val;
		String key;
		String encrypted;
		int savechoice = 0;
		Main m=new Main();
		Database dbobj = new Database();
		StaticCache stat=new StaticCache();
		DynamicCache dynam=new DynamicCache();
		CipherAES ciobj = new CipherAES();
		logger.info("Enter your choice\n1:Static Cache\n2:Dynamic Cache\n");
		ch1=sc.nextInt();
		if(ch1==1)
		{
			while(true)
			{
				logger.info("Enter your choice\n1:Insert\n2:Read\n3:Display\n4:exit");
				ch2=sc.nextInt();
				logger.info("Where you want to save the data?\n1:Database\n2:File\n3:Memory");
				savechoice = sc.nextInt();
				switch(ch2)
				{
				case 1:
					hm1.clear();
					logger.info("Enter a no. of values you want to insert\n");
					count=sc.nextInt();
					for(i=0;i<count;i++)
					{
						System.out.print("Enter key:");
						key=sc.next();
						val=m.readValue();
						hm1.put(key, val);
					}
						
						
//						String namelocal = val.name;
//						System.out.println(namelocal);
//						String encypted = ciobj.encrypt(namelocal, "Shrestha");
//						System.out.println(encypted);
//						dbobj.insert(key, encypted);
//						dbobj.insert(key, namelocal);
					stat.insertCache(hm1);
//					
						//dbobj.insert("A", "BG");
						
					
					if (savechoice==1)
					{
						//call DB insert function.
						for (Map.Entry<String, Person> entry: hm1.entrySet())
							{
								String key1 = entry.getKey();
								Person p = entry.getValue();
								dbobj.openconnection();
								encrypted = ciobj.encrypt(p.name,"key_nonce");
								dbobj.insert(key1, encrypted);
								
							}
					}
					else if (savechoice==2)
					{
						//call file function
					}
					
					else if (savechoice==3)
					{	//call memory function
					}
					
					else
						logger.info("Wrong choice");
					
					
					break;
				case 2:
					logger.info("Enter a no. of values you want to read\n");
					count=sc.nextInt();
					list.clear();
					for(i=0;i<count;i++)
					{
						System.out.print("Enter key:");
						key=sc.next();
						list.add(key);
						hm1=(HashMap<String, Person>) stat.readCache(list);	
					}
					logger.info(hm1);
					break;
				case 3:
					stat.displayCache();
					break;
				default:System.exit(0);
					
				}
			}
			
		}
		else if(ch1==2)
		{
			while(true)
			{
				logger.info("Enter your choice\n1:Insert\n2:Read\n3:Delete\n4:Update\n5:Clear All\n6:Display\n7:exit");
				ch2=sc.nextInt();
				logger.info("Where you want to save the data?\n1:Database\n2:File\n3:Memory");
				savechoice = sc.nextInt();
				switch(ch2)
				{
				case 1:
					hm1.clear();
					logger.info("Enter a no. of values you want to insert\n");
					count=sc.nextInt();
					for(i=0;i<count;i++)
					{
						System.out.print("Enter key:");
						key=sc.next();
						val=m.readValue();
						hm1.put(key, val);
						
					}
					if (savechoice==1)
					{
						//call DB insert function.
					}
					else if (savechoice==2)
					{
						//call file function
					}
					
					else if (savechoice==3)
					{	//call memory function
					}
					
					else
						logger.info("Wrong choice");
					dynam.insertCache(hm1);
					break;
				case 2:
					logger.info("Enter a no. of values you want to read\n");
					count=sc.nextInt();
					list.clear();
					for(i=0;i<count;i++)
					{
						System.out.print("Enter key:");
						key=sc.next();
						list.add(key);
						hm1=(HashMap<String, Person>) dynam.readCache(list);	
					}
					//logger.info(hm1);
					break;
				case 3:
					logger.info("Enter a no. of values you want to remove\n");
					count=sc.nextInt();
					list.clear();
					for(i=0;i<count;i++)
					{
						System.out.print("Enter key:");
						key=sc.next();
						list.add(key);
						dynam.removeCache(list);
					}
					if (savechoice==1)
					{
						//call DB insert function.
					}
					else if (savechoice==2)
					{
						//call file function
					}
					
					else if (savechoice==3)
					{	//call memory function
					}
					
					else
						logger.info("Wrong choice");
					break;
				case 4:
					hm1.clear();
					logger.info("Enter a no. of values you want to Update\n");
					count=sc.nextInt();
					for(i=0;i<count;i++)
					{
						System.out.print("Enter Old key:");
						key=sc.next();
						val=m.readValue();
						hm1.put(key, val);
						
					}
					dynam.updateCache(hm1);
					if (savechoice==1)
					{
						//call DB insert function.
					}
					else if (savechoice==2)
					{
						//call file function
					}
					
					else if (savechoice==3)
					{	//call memory function
					}
					
					else
						logger.info("Wrong choice");
					
					
					break;
				case 5:
					dynam.clearCache();
					if (savechoice==1)
					{
						//call DB insert function.
					}
					else if (savechoice==2)
					{
						//call file function
					}
					
					else if (savechoice==3)
					{	//call memory function
					}
					
					else
						logger.info("Wrong choice");
					break;
				case 6:
					dynam.displayCache();
					break;
				default:System.exit(0);
					
				}
			}
			
		}
		else
		{
			logger.info("Invalid Option");
			System.exit(0);
		}
		sc.close();
		
	}

}
