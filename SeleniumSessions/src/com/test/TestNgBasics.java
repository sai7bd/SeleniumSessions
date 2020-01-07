package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	/*
	setup system for chrome 
	login method
	launch chrome browser
	enter URL
	Google Title test
	logout from App
	Close Browser
	logout from App
	*/
	
	
	// Pre-conditions -- starting with @Before	
	
@BeforeSuite //1

	public void SetUp()
	{
		System.out.println("setup system for chrome ");
		
	}
	
@BeforeTest //2
public void launchBrowser()
{
	System.out.println("launch chrome browser");
	
}
@BeforeClass //3
public void login()
{
	System.out.println("login method");
	
}

	@BeforeMethod //4
	public void enterURL()
	{
		System.out.println("enter URL");
		
	}
	
	
	//test cases -- starting with @Test
	@Test // 5
	public void googleTitleTest()
	{
		System.out.println("Google Title test");
	}
	
	
	@Test // 5
	public void SearchTest()
	{
		System.out.println(" Search test");
	}
	//post condition -- starting with after 
	
	@AfterMethod //6
	public void logOut()
	{
		System.out.println("logout from App");
	}

	@AfterTest // 7
	public void CloseBrowser()
	{
		System.out.println("Close Browser");
	}
	public void deleteAllCookies()
	{
		System.out.println("logout from App");
	}
	
	@AfterClass
	
	


	@AfterSuite
	public void GenerateTestReport()
	{
		System.out.println("Generate Test Report");
	}

	
}
