package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefinition {
    WebDriver  driver ;
    
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "/Users/Lego3/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/?.src=ym&lang=&done=https%3A%2F%2Fmail.yahoo.com%2F");
	}

//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
	//Regular expression
	//1 \"([^\"]*)\"
	//2 \"(.*)\"
	
   @Then("^Close the browser$")
	public void Close_the_browser() {
	   driver.quit();
	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}

   @Then("^user enters \"([^\"]*)\"$")
	public void user_enters_and(String username) {
	   driver.findElement(By.name("username")).sendKeys(username);
	}
	
}
