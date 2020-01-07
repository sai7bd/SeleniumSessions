package SeleniumSeeion;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/Lego3/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximize windows
		driver.manage().deleteAllCookies(); // delete all the cookies
		// dynamic wait
		//
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//implicitly wait -- is always applied globally -- is available for all the webelements 
		// dynamic  in nature
		//  it can be changed anywhere and at anytime in your code
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/"); // url
		
		LinkedList ls = new LinkedList();
		
		ls.add("BOOK");
		ls.add("ADD-ONS");
		ls.add("DEALS");
		ls.add("GIFT CARD");
		ls.add("SPICECLUB");
		ls.add("CARGO");
		ls.add("SPICESTYLE");
		Actions action = new Actions(driver);
		
		for (int i = 0; i < ls.size(); i ++)
			
		{
		
			action.moveToElement(driver.findElement(By.linkText((String) ls.get(i)))).build().perform();
		}
		//action.moveToElement(driver.findElement(By.linkText("DEALS"))).build().perform();
		
		//driver.findElement(By.linkText("Hot Meals")).click();

	}

}
