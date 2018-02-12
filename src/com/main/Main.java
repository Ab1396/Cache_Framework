package com.main;

import java.util.*;

import org.apache.log4j.BasicConfigurator;

import com.cache.address.Address;
import com.cache.dynamiccache.DynamicCache;
import com.cache.person.Person;
import com.cache.staticcache.StaticCache;

public class Main {
	Scanner sc=new Scanner(System.in);
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
		
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter Age");
		age=sc.nextInt();
		System.out.println("Enter Adhar Number");
		adharNumber=sc.next();
		System.out.println("Enter Address information:");
		System.out.println("Enter House Number");
		houseNumber=sc.next();
		System.out.println("Enter Street");
		street=sc.next();
		System.out.println("Enter City");
		city=sc.next();
		System.out.println("Enter State");
		state=sc.next();
		System.out.println("Enter Pin code");
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
		Main m=new Main();
		StaticCache stat=new StaticCache();
		DynamicCache dynam=new DynamicCache();
		System.out.println("Enter your choice\n1:Static Cache\n2:Dynamic Cache\n");
		ch1=sc.nextInt();
		if(ch1==1)
		{
			while(true)
			{
				System.out.println("Enter your choice\n1:Insert\n2:Read\n3:Display\n4:exit");
				ch2=sc.nextInt();
				switch(ch2)
				{
				case 1:
					hm1.clear();
					System.out.println("Enter a no. of values you want to insert\n");
					count=sc.nextInt();
					for(i=0;i<count;i++)
					{
						System.out.print("Enter key:");
						key=sc.next();
						val=m.readValue();
						hm1.put(key, val);
						
					}
					stat.insertCache(hm1);
					break;
				case 2:
					System.out.println("Enter a no. of values you want to read\n");
					count=sc.nextInt();
					list.clear();
					for(i=0;i<count;i++)
					{
						System.out.print("Enter key:");
						key=sc.next();
						list.add(key);
						hm1=(HashMap<String, Person>) stat.readCache(list);	
					}
					System.out.println(hm1);
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
				System.out.println("Enter your choice\n1:Insert\n2:Read\n3:Delete\n4:Update\n5:Clear All\n6:Display\n7:exit");
				ch2=sc.nextInt();
				switch(ch2)
				{
				case 1:
					hm1.clear();
					System.out.println("Enter a no. of values you want to insert\n");
					count=sc.nextInt();
					for(i=0;i<count;i++)
					{
						System.out.print("Enter key:");
						key=sc.next();
						val=m.readValue();
						hm1.put(key, val);
						
					}
					dynam.insertCache(hm1);
					break;
				case 2:
					System.out.println("Enter a no. of values you want to read\n");
					count=sc.nextInt();
					list.clear();
					for(i=0;i<count;i++)
					{
						System.out.print("Enter key:");
						key=sc.next();
						list.add(key);
						hm1=(HashMap<String, Person>) dynam.readCache(list);	
					}
					//System.out.println(hm1);
					break;
				case 3:
					System.out.println("Enter a no. of values you want to remove\n");
					count=sc.nextInt();
					list.clear();
					for(i=0;i<count;i++)
					{
						System.out.print("Enter key:");
						key=sc.next();
						list.add(key);
						dynam.removeCache(list);
					}
					break;
				case 4:
					hm1.clear();
					System.out.println("Enter a no. of values you want to Update\n");
					count=sc.nextInt();
					for(i=0;i<count;i++)
					{
						System.out.print("Enter Old key:");
						key=sc.next();
						val=m.readValue();
						hm1.put(key, val);
						
					}
					dynam.updateCache(hm1);
					
					break;
				case 5:
					dynam.clearCache();
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
			System.out.println("Invalid Option");
			System.exit(0);
		}
		sc.close();
		
	}

}
