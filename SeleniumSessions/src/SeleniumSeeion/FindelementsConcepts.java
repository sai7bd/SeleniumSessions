package SeleniumSeeion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelementsConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/Lego3/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximize windows
		driver.manage().deleteAllCookies(); // delete all the cookies
		// dynamic wait
		//
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//implicitly wait -- is always applied globaly -- is available for all thewebelements 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		// driver.get("http://www.google.com"); 
		// String title = driver.getTitle();
		// System.out.println(title);

		driver.get("https://www.ebay.com/"); // url
		
		// get the count of linkc on the  page
		List <WebElement> linklist =  driver.findElements(By.tagName("a"));
		// get the text of each link on the page
		
		// How to size of arraylist
		
		System.out.println(linklist.size());
		
		for (int i =0 ; i<linklist.size(); i ++)
		{
			String linlText = linklist.get(i).getText();
			System.out.println(linlText);
		}
		
		
		
		

	}

}
