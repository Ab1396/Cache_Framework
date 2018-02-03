package com.cache;

import java.util.List;

public class Mystore implements Store {

	@Override
	public boolean openconnection() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean insert(String key, String value) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<String> read(List<String> key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(String key, String value) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean remove(List<String> key) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void closeConnection() {
		// TODO Auto-generated method stub
		
	}

}
