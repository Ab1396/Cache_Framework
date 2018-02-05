//package com.cache;
package com.cache.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.cache.DynamicCache;

public class DynamicCacheTest {

	@Test
	public void testReadCache() {
		//fail("Not yet implemented");
	}

	@Test
	public void testRemoveCache() 
		{
		
			DynamicCache d = new DynamicCache ();
			//boolean result = d.removeCache(null);
			//assertEquals(true, result);
			//fail("Not yet implemented");
			List<String> supplier = new ArrayList<String>();
			supplier.add("hello");
			boolean k = d.removeCache(supplier);
			assertEquals(true,k);
		}

	@Test
	public void testInsertCache() 
		{
			DynamicCache d1 = new DynamicCache();
			boolean result = d1.insertCache(null);
			assertEquals(true, result);
		//fail("Not yet implemented");
		}

		@Test
	public void testUpdateCache() 
		{
			DynamicCache d2 = new DynamicCache();
			boolean result = d2.updateCache(null);
			assertEquals(true, result);
			
		//fail("Not yet implemented");
		}

	@Test
	public void testDisplayCache() 
		{
		
		//fail("Not yet implemented");
		}

	@Test
	public void testClearCache() 
		{
		
		//fail("Not yet implemented");
	}

}



