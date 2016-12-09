package com.java;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class CalculatorTest {
	Calculator obj;
	
	@Before
	public void setUp() {
		obj = new Calculator();
	}
	
	@Test
	public void testAdd() {
		int result = obj.add(5, 4);
		assertEquals(9, result);
	}
	
	@Test
	public void testSub() {
		int result = obj.sub(5, 4);
		assertEquals(1, result);
	}
	
	@Test
	public void testMultiply() {
		int result = obj.multiply(5, 4);
		assertEquals(20, result);
	}
	
	@Test
	public void testDiv() {
		int result = obj.div(5, 4);
		assertEquals(1, result);
	}
	@Test
    public void testAddMock(){
    	
    }
	@After
	public void tearDown(){
		obj = null;
	}
	

}
