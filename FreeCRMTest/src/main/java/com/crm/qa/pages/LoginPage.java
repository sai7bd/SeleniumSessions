package com.crm.qa.pages;
import org.eclipse.jetty.util.annotation.Name;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	//Page Factory - OR:
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
//	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
//	WebElement loginBtn;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	
//	WebElement loginBtn;
//	@FindBy(xpath="//a[contains(text(), 'Sign Up')]")
//	WebElement signupBtn;
	
	// initializing the page objects
	public  LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
	return driver.getTitle();
	
	}
	
	//Actions
	public HomePage login(String un, String pwd) {
		email.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
		}

	

}