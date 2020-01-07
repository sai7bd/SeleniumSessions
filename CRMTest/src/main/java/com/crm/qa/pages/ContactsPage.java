package com.crm.qa.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath = "//div[text()= 'Contacts']")
	WebElement contactsLabel;
	
	
	@FindBy(name="first_name")
	WebElement Fname;
	
	@FindBy(name="last_name")
	WebElement Lname;
	

//	@FindBy(xpath ="name=//input[text()='Email address']")
//	WebElement Email;
	
	@FindBy(xpath = "//button[text()='Save']")
	WebElement btnSave;
	
	
	//initializing the Page Objects:
	
	public ContactsPage()
	{
		PageFactory.initElements(driver, this);
	}

	public boolean verifyContactsLabel() {
		return contactsLabel.isDisplayed();
	}
	
	public void selectContactsByName(String name) {
		
driver.findElement(By.xpath("//td[contains(text() ,'"+name+"')]")).click();
	
	}
	
	
	public void createNewContact( String fName, String lName) {
		Fname.sendKeys(fName);
		Lname.sendKeys(lName);
		//Email.sendKeys(Mail);
		btnSave.click();
	}
	
	
}
