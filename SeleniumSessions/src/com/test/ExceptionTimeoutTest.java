package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {
	
	
//	@Test(timeOut= 2000)
//	public void infinitLoopTest()
//	{
//		int i =1;
//		while (i==1) {
//			System.out.println(i);
//		}
//	}
	//@Test(expectedExceptions= NumberFormatException.class)
	@Test
	public void infinitLoopTest()
	{
		String x  ="100A";
		Integer.parseInt(x);
		
	}

	
}
