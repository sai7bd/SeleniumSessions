package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class contactsPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage ;
	String sheetName = "contacts"; 
	
	public contactsPageTest() {
	super();
	
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		contactsPage  = new ContactsPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		//TestUtil.runTimeInfo("error", "login successful");
		contactsPage = homePage.clickOnContactsLink();
		//TestUtil.switchToFrame();
	}

	@Test(priority=1)
	public void verifyContactsLabel() {
		Assert.assertTrue(contactsPage.verifyContactsLabel(), "contact label is missing on the page ");
	}
//	//sleepthread()
//	@Test(priority=3)
//	public void selectContactsTest() {
//		//contactsPage.selectContactsByName("gg gg");
//		contactsPage.selectContactsByName("kk ll");
//	}
	
//	@DataProvider
//	public  Object[][] getTestData() {
//	Object data[][] = TestUtil.getTestData(sheetName);
//	return data;
//	
//	}
//
//	@Test(priority=2, dataProvider="getTestData")
//	public void validateCteateNewContact(String firstname, String lastname) {
//		homePage.clickOnNewContactLink();
//		contactsPage.createNewContact(firstname, lastname);
//	}

	@DataProvider
	public Object[][] getCRMTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=4, dataProvider="getCRMTestData")
	public void validateCreateNewContact(String firstName, String lastName){
		homePage.clickOnNewContactLink();
		//contactsPage.createNewContact("Mr.", "Tom", "Peter", "Google");
		contactsPage.createNewContact( firstName, lastName);
		
	}
	
	
	@AfterMethod
	public void tearDoen() {
	//driver.quit();
	}
}
