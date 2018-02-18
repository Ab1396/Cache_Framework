package com.cache.staticcache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.cache.Cache;
import com.cache.person.Person;

public class StaticCache implements Cache {

	 HashMap<String, Person> hm = new HashMap<String, Person>();
	 static Logger logger=Logger.getLogger(Person.class);
	 
	@Override
	public HashMap<String,?> readCache(List<String> lst) {
		// TODO Auto-generated method stub
		HashMap<String, Person> hm2 = new HashMap<String, Person>();
		Person test;
		for (String temp : lst) {
			logger.info(temp);
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
	public boolean insertCache(Map<String,?> params) {
		// TODO Auto-generated method stub
		//hm.putAll((Map<String, ? extends Person>) params);
		for (String key : params.keySet()){
            hm.put(key, (Person) params.get(key));
        }
		return true;
	}

	@Override
	public boolean updateCache(Map<String, ?> params) {
		// TODO Auto-generated method stub
		 for (String key : params.keySet()){
	            //iterate over key
	            hm.replace(key, (Person) params.get(key));
	        }
		return true;
	}

	@Override
	public void displayCache() {
		// TODO Auto-generated method stub
		Person p;
		if(hm.isEmpty())
		{
			logger.info("Cache is Empty");
			return;
		}
			
		for (String key : hm.keySet()){
            //iterate over key
            logger.info("Key:"+key+"   Value:");
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
