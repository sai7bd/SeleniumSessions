package SeleniumSeeion;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class eBayRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				System.setProperty("webdriver.chrome.driver", "/Users/Lego3/Downloads/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize(); // maximize windows
				driver.manage().deleteAllCookies(); // delete all the cookies
				//dynamic wait
				
				driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.get("http://www.google.com"); 
				String title = driver.getTitle();
				System.out.println(title);
				
				 driver.get("https://www.ebay.com/");
				 driver.findElement(By.id("gh-ug")).click();
				// driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("Sai7bd");
				 
				driver.findElement(By.id("userid")).sendKeys("Sai7bd");
				  //driver.quit();
	}

}
