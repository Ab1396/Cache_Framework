package com.cache.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cache.Mystore;

public class filestoretest {

	@Test
	public void test() {
		
		Mystore m = new Mystore();
		boolean result = m.openconnection();
		assertEquals(true,result);
		
		//fail("Not yet implemented");
	}

}
