package com.cg.service;

public class Calculator {

	//changed
	public int sum(int no1, int no2) {
		if(no1>999 || no2>999)
		{
			throw new RuntimeException("No1 or No2 must be greater than 999");
		}
		return no1+no2;
	}

}
