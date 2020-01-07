package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	WebDriver driver ;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/Lego3/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); // delete all the cookies
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com/"); // url
		
	}

	//2
	@Test()
	public void googletitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
		// Validation test
		Assert.assertEquals(title, "Google66", "Title is not matched");
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
