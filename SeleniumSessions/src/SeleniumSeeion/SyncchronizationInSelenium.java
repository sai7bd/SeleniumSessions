package SeleniumSeeion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncchronizationInSelenium {

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
		driver.get("https://www.facebook.com/"); // url
		 //driver.findElement(By.id("gh-ug")).click();
		WebElement firstname = driver.findElement(By.name("firstname")); 
		WebElement lastname = driver.findElement(By.name("lastname")); 
		sendKeys(driver, firstname, 10, "Tom");
		sendKeys(driver, lastname, 5, "Peter");
		
		WebElement forgotpassword = driver.findElement(By.linkText("Forgot account?"));
		clickOn(driver, forgotpassword, 5);
	}
	
// Explicit Wait:
	// 1. no explicit keyword or method
	// 2. available with WebDriverWait  with some ExpectedConditions
	// 3. specific to element
	// 4. dynamic in nature
	// 5. we should never use Explicit and Implict wait together. because selenium web driver wait for the element first because 
	// of IMPLICIT and then EXPLICIT  wait will be applied. hence total sync wait will be increased for each element.
	
	public static void sendKeys(WebDriver driver, WebElement element , int timeout, String value) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		
	}

	public static void clickOn(WebDriver driver, WebElement element , int timeout) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.click();
		
	}

	
}
