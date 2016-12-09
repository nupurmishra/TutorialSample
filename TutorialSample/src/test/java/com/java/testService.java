package com.java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.util.reflection.Whitebox;

import com.deosample.Dao;
import com.deosample.Service;

public class testService {

	@Mock Dao dao;

	@Before
	public void setUp() throws Exception{

		MockitoAnnotations.initMocks(this);
		Mockito.when(dao.getResult()).thenReturn(5);
		

	}

	@Test
	public void test() {

		Service obj = new Service();
		int  a = obj.findById(dao);

		Assert.assertEquals(5, a);
		try {
			Mockito.verify(dao).getResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//	@Test(expected=Exception.class)
	//	public void test1() throws Exception{
	//		Service obj = new Service();
	//		try {
	//			int  a = obj.findById(dao);
	//				
	//			Assert.assertEquals(5, a);
	//			Mockito.verify(dao).getResult();
	//		} catch (Exception e) {
	//			throw new Exception();
	//		}
	//	}
}
