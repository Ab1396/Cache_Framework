package com.cache;

import java.util.*;

import com.cache.person.Person;
public interface Cache {
	public HashMap<String,Person> readCache(List<String> lst);//done
	public boolean removeCache(List<String> lst);  
	public boolean insertCache(Map<String,Person> params);//done
    public boolean updateCache(Map<String, Person> params);
    public void displayCache();  // used to display all cache contents
    public void clearCache();    // All cache contents will be removed
    
    HashMap<String, Person> hm = new HashMap<String, Person>();
}

