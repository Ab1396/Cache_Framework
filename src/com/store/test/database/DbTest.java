//package com.cache.test;

package com.store.test.database;
import org.junit.Test;

import org.junit.Assert;
import org.junit.Before;

import com.store.Store;
import com.store.database.Database;

import static org.mockito.Mockito.*;

import java.util.List;
public class DbTest {
Database n;
List<String> params;
@Before
public void setup() {
	Store mk= mock(Store.class);
	when(mk.remove(params)).thenReturn(true);
	n=new Database();
	n.setRs(mk);
	
}

@Test
public void testRemove() {
	Assert.assertEquals(true,n.remove(params));
}
}