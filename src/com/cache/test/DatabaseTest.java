package com.cache.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cache.Database;

public class DatabaseTest {
	
	Database db=new Database();
	String key,value;

	@Test
	public void testOpenconnection() {
		assertTrue(db.openconnection());
	}

	@Test
	public void testInsert() {
		assertTrue(db.insert(key, value));
	}

	@Test
	public void testRead() {
		//lst2=db.read(lst);
		assertTrue(true);
	}

	@Test
	public void testUpdate() {
		assertTrue(db.update(key, value));
	}

	@Test
	public void testRemove() {
		//assertTrue(db.remove(lst));
	}

	@Test
	public void testCloseConnection() {
		//assertTrue(db.closeConnection(););
	}

}
