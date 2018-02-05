package com.cache.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.cache.DynamicCache;

public class Dynamictest {

	@Test
	public void test() {
		//MyclassDynamic d = new MyclassDynamic();
		//boolean result = d.removeCache(null);
		//assertEquals(true,result);
		DynamicCache d = new DynamicCache();
		boolean result = d.removeCache(null);
		assertEquals(true, result);
		//fail("Not yet implemented");
	}
	
	public void test1()
	{
		DynamicCache d1 = new DynamicCache();
		boolean result = d1.insertCache(null);
		assertEquals(true, result);
		
	}
	public void test2() {
		
		DynamicCache d2 = new DynamicCache();
		//boolean result = d.openconnection();
		//assertEquals(true,result);
		
		List<String> supplier = new ArrayList<String>();
		supplier.add("hello");
		boolean k = d2.removeCache(supplier);
		assertEquals(true,k);

}
}
