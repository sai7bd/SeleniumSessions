package SeleniumSeeion;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/Lego3/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com"); 
		String title = driver.getTitle();
		System.out.println(title);
		
		  if (title.equals("Google"))
		  {		
			  System.out.println("It is there");
			  
		  }
		  else
		  {
			  System.out.println("It is not there");
		  }
		  
		  driver.quit();
	}

}
