package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class EbayTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/Lego3/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximize windows
		driver.manage().deleteAllCookies(); // delete all the cookies
		// dynamic wait
		//
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//implicitly wait -- is always applied globaly -- is available for all the webelements 
		// dynamic  in nature
		//  it can be changed anywhere and at anytime in your code
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/?.src=ym&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd"); // Url
	
	Xls_Reader reader = new Xls_Reader("/Users/Lego3/workspace/Selenium/SeleniumSessions/src/com/testdata/YahooUserName.xlsx") ; 
	
	String firstName =  reader.getCellData("contacts", "username", 2);
	System.out.println(firstName);
	driver.findElement(By.xpath("//*[@id= 'login-username']")).clear();
	driver.findElement(By.xpath("//*[@id= 'login-username']")).sendKeys(firstName);
	driver.findElement(By.xpath("//*[@id= 'login-signin']")).click();
	
	}
	
}
	

