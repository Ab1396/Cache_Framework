package com.store.test.filesystem;


import static org.junit.Assert.*;

import org.junit.Test;

import com.store.Store;
import com.store.filesystem.Filesystem;

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
