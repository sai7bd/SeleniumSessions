package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {

	@Test
	
	
	public void Test1(){
		System.out.println("Login Test");
		//int i =  9/0 ;
	}
	
	
	@Test(dependsOnMethods= "Test1")
	
	public void Test2(){
		System.out.println("Login Test1");
		
	}
	
	
}
