package SeleniumSeeion;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleBrowserPopUp {

	public static void main(String[] args) {
		//1. alerts -- javascript Pop up -- Alert Api
		//2. File upload pop up
		//3. Browser window pop up -- advertisement pop up -- windows Handler pop up.
		 
		
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
		driver.get("http://popuptest.com"); // Url
		
		driver.findElement(By.xpath("//a[contains(text(),'Full screen trap')]")).click();
		Set<String> handler = driver.getWindowHandles();
		
		java.util.Iterator<String> it = handler.iterator();
		String parentWindowId= it.next();
		System.out.println("parent window id:" + parentWindowId);
		
		String childWindowId= it.next();
		System.out.println("child window id:" + childWindowId);
		driver.switchTo().window(childWindowId);
		System.out.println("child window popup:");
		//Actions  action = new Actions(driver);
		driver.close();
	
		driver.switchTo().window(parentWindowId);
		System.out.println("parent  window" + driver.getTitle());
	}

}
