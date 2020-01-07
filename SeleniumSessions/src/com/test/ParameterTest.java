package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class ParameterTest {


	WebDriver driver;
	
	@Test
	@Parameters({ "browser","url", "emailid" })
	
	public void yahooLoginTest(String browser, String url, String emailId){
		
		if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/Lego3/Downloads/chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/Lego3/Downloads/gecko.exe");
			driver = new FirefoxDriver();
		}
		driver.get(url);
		
		driver.findElement(By.xpath("//*[@id= 'login-username']")).clear();
		driver.findElement(By.xpath("//*[@id= 'login-username']")).sendKeys(emailId);
		driver.findElement(By.xpath("//*[@id= 'login-signin']")).click();
		
	
	



}
		
}
