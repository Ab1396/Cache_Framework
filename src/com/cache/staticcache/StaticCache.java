package com.cache.staticcache;

import java.util.List;
import java.util.Map;

import com.cache.Cache;

public class StaticCache implements Cache {

	@Override
	public Map<String,String> readCache(List<String> lst) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeCache(List<String> lst) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean insertCache(Map<String, ?> params) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean updateCache(Map<String, ?> params) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void displayCache() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearCache() {
		// TODO Auto-generated method stub
		
	}

}
