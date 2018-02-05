package com.cache.test;


import static org.junit.Assert.*;

import org.junit.Test;

import com.cache.Filesystem;
import com.cache.Store;

public class FilesystemTest {
	
	Store fl= new Filesystem();
	String key,value;
	
	@Test
	public void testOpenconnection() {
		assertFalse(fl.openconnection());
	}

	@Test
	public void testInsert() {
		assertFalse(fl.insert(key, value));
	}

	@Test
	public void testRead() {
		
	}

	@Test
	public void testUpdate() {
		assertFalse(fl.update(key, value));
	}

	@Test
	public void testRemove() {
		
	}

	@Test
	public void testCloseConnection() {
		
	}

}
