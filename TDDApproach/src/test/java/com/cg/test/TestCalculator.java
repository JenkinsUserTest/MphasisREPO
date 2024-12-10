package com.cg.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cg.service.Calculator;

public class TestCalculator {
	Calculator calculator;

	@Before
	public void setUp() throws Exception {
		calculator=new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		calculator=null;
	}

	@Test
	public void test_sum_positive() {
		
		int no1=10;
		int no2=5;
		int expected=15;
		int actual=calculator.sum(no1,no2);
		assertEquals(expected,actual);
	}
	@Test
	public void test_sum_negative_whenNo1greaterthan999() {
		int no1=1000;
		int no2=5;
		try {
		calculator.sum(no1, no2);
		assertFalse(true);
		}catch(Exception e) {
			assertTrue(true);
		}
		
	}
	
	@Test
	public void test_sum_negative_whenNo1greaterthan999Message() {
		int no1=1000;
		int no2=5;
		try {
		calculator.sum(no1, no2);
		assertFalse(true);
		}catch(Exception e) {
			String actual=e.getMessage();
			String expected="No1 or No2 must be greater than 999";
			assertEquals(expected,actual);
		}
		
	}
	
	@Test
	public void test_sum_negative_whenNo2greaterthan999() {
		int no1=5;
		int no2=1000;
		try {
		calculator.sum(no1, no2);
		assertFalse(true);
		}catch(Exception e) {
			assertTrue(true);
		}
		
	}
	@Test
	public void test_sum_negative_whenNo2greaterthan999Message() {
		int no1=5;
		int no2=1000;
		try {
		calculator.sum(no1, no2);
		assertFalse(true);
		}catch(Exception e) {
			String actual=e.getMessage();
			String expected="No1 or No2 must be greater than 999";
			assertEquals(expected,actual);
		}
		
	}

}
