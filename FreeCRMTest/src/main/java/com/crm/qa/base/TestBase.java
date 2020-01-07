package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.crm.qa.util.TestUtil;
import com.crm.qa.util.WebEventListener;

public class TestBase {

	public static WebDriver driver; 
	public  static Properties prop ; 
	public  static EventFiringWebDriver e_driver; 
	public  static WebEventListener eventListener ; 
	
	public TestBase() {
		
	try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("/Users/Lego3/workspace/Selenium/FreeCRMTest/src/main/java/com/crm/qa/config/config.properties");
	    try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		}catch (FileNotFoundException e) {
		e.printStackTrace();
		}
	}
	
	 public static void intialization() {
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/Lego3/Downloads/chromedriver.exe");
			driver = new ChromeDriver();
		}
//		else if (browserName.equals("FF")) {
//			System.setProperty("webDriver.chrome.driver", "/Users/Lego3/Downloads/gekodriver.exe");
//			driver = new FirefoxDriver();
//		}
		 e_driver = new EventFiringWebDriver(driver);
		 eventListener = new WebEventListener();
		 e_driver.register(eventListener);
		 driver = e_driver;
		 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();;
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	

	

}










