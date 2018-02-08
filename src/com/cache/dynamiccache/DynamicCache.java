package com.cache.dynamiccache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cache.Cache;
import com.cache.person.Person;

public class DynamicCache implements Cache{

	@Override
	public HashMap<String,Person> readCache(List<String> lst) {
		// TODO Auto-generated method stub
		HashMap<String, Person> hm2 = new HashMap<String, Person>();
		Person test;
		for (String temp : lst) {
			System.out.println(temp);
			test=hm.get(temp);
			if(test!=null)
				hm2.put(temp, hm.get(temp));
		}
		
		return hm2;
	}

	@Override
	public boolean removeCache(List<String> lst) {
		// TODO Auto-generated method stub
		for (String temp : lst) {
			hm.remove(temp);
		}
		
		return true;
	}

	@Override
	public boolean insertCache(Map<String,Person> params) {
		// TODO Auto-generated method stub
		hm.putAll(params);
		return true;
	}

	@Override
	public boolean updateCache(Map<String, Person> params) {
		// TODO Auto-generated method stub
		 for (String key : params.keySet()){
	            //iterate over key
	            hm.replace(key, params.get(key));
	        }
		return true;
	}

	@Override
	public void displayCache() {
		// TODO Auto-generated method stub
		Person p;
		if(hm.isEmpty())
		{
			System.out.println("Cache is Empty");
			return;
		}
			
		for (String key : hm.keySet()){
            //iterate over key
            System.out.println("Key:"+key+"   Value:");
            p=hm.get(key);
            p.display();
        }
		
	}

	@Override
	public void clearCache() {
		// TODO Auto-generated method stub
		hm.clear();
		
	}

}
