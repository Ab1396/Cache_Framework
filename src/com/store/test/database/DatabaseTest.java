package com.store.test.database;

import static org.junit.Assert.*;

import org.junit.Test;

import com.store.Store;
import com.store.database.Database;

public class DatabaseTest {
	
	Store db=new Database();
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
