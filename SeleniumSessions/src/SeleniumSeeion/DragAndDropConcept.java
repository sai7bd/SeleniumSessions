package SeleniumSeeion;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		driver.get("https://jqueryui.com/droppable/"); // Url
		driver.switchTo().frame(0);
		Actions  action = new Actions(driver);
	
		action.clickAndHold(driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]")))
		.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']")))
		.release()
		.build()
		.perform(); 
	}

}
