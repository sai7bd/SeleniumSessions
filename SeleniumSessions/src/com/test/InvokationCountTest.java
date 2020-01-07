package com.test;

import org.testng.annotations.Test;

public class InvokationCountTest {

	@Test(invocationCount=10)
	
	public void sum() {
	int a =10;	
	int b =20;
	int c =30;
	int d =40;
	System.out.println("Sum is =="+ c);
	}
	
	
}
