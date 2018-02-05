package com.cache.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cache.Database;

public class DatabaseTest {
	
	Database db=new Database();
	String key,value;

	@Test
	public void testOpenconnection() {
		assertFalse(db.openconnection());
	}

	@Test
	public void testInsert() {
		assertFalse(db.insert(key, value));
	}

	@Test
	public void testRead() {
		//lst2=db.read(lst);
		assertFalse(true);
	}

	@Test
	public void testUpdate() {
		assertFalse(db.update(key, value));
	}

	@Test
	public void testRemove() {
		//assertFalse(db.remove(lst));
	}

	@Test
	public void testCloseConnection() {
		//assertFalse(db.closeConnection(););
	}

}
