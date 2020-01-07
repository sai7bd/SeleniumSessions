package com.crm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	

	//Page Factory - OR:
		@FindBy(xpath="//span[contains(text(),'Contacts')]")
		WebElement ContactsLink;
	
//		@FindBy(xpath="//span[@class='user-display']")
//		WebElement Test;
//		
//		@FindBy(xpath= "//input[@placeholder='Search']")
//		WebElement Search;
		
		@FindBy(xpath="//span[contains(text(),'Deals')]")
		WebElement DealsLink;
	
		@FindBy(xpath="//span[contains(text(),'Tasks')]")
		WebElement TasksLink;
		
		@FindBy(xpath="//button[contains(text(),'New')]")
		WebElement NewContackLink;
		
		public HomePage(){
			
			PageFactory.initElements(driver, this);
		}
		
		
		public String verifyHomePageTitle()
		{
			return driver.getTitle();
		}
	
		public ContactsPage clickOnContactsLink() {
			ContactsLink.click();
			return new ContactsPage();
		}
		
		public DealsPage clickOnDealsLink() {
			DealsLink.click();
			return new DealsPage();
		}
		public TaskPage clickOnTasksLink() {
			ContactsLink.click();
			return new TaskPage();
		}
		
		public void clickOnNewContactLink() {
			NewContackLink.click();
		}



}
