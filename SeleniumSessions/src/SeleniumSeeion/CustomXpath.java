package SeleniumSeeion;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/Lego3/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximize windows
		driver.manage().deleteAllCookies(); // delete all the cookies
		// dynamic wait
		//
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		// driver.get("http://www.google.com"); 
		// String title = driver.getTitle();
		// System.out.println(title);

		driver.get("https://www.ebay.com/");
		// Custom Xpath Using class
		// driver.findElement(By.xpath("//input[@class='gh-tb
		// ui-autocomplete-input']")).sendKeys("Java");

		// absulate Xpath is not recommended 
		/*
		 * 1. Performance issue
		 * 2. not reliable
		 * 3. can be changed at any time in future
		*/
		//Example of absulate Xpath: /html[1]/body[1]/header[1]/div[1]/ul[2]/li[4]/div[1]/a[1]
		
		// Custom Xpath Using Name
		// driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Java");

		// Custom Xpath Using using real Xpath
		// driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Iphone");

		// Custom Xpath Using using Contains
		// driver.findElement(By.xpath("//input[contains(@class,'gh-tb
		// ui-autocomplete-input')]")).sendKeys("Iphone");
		// driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("Sai7bd");
		// driver.findElement(By.id("userid")).sendKeys("Sai7bd");

		// dynamic id input
		// id = test_123
		// id = test_456
		// id = test_456
		// id = test_456_test_889_test

		// Using Contains

		// driver.findElement(By.xpath("//input[contains(@Id,'test_')]")).sendKeys("Iphone");

		// Using Start with
		// driver.findElement(By.xpath("//input[starts-with(@id,'gh-ac')]")).sendKeys("Iphone");

		// Using end with
		// driver.findElement(By.xpath("//input[ends-with(@name,'w')]")).sendKeys("phone");

		// for links custom
		// all the links are representing by <a> html tag:

		//driver.findElement(By.xpath("//a[contains(text(),'My eBay')]")).click();
		
		// Absulate Xpath
		
		driver.findElement(By.xpath("//a[contains(text(),'My eBay')]")).click();


		// driver.quit();
	}

}
