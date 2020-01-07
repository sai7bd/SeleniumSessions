package SeleniumSeeion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp {

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
		driver.get("https://html.com/input-type-file/"); // Url
		driver.findElement(By.xpath(".//*[@id='fileupload']")).sendKeys("/Users/Lego3/Downloads/sai1.txt");
	

	}

}
