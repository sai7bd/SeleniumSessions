package com.crm.qa.tests;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage ;
	 TestUtil testUtil;
	public HomePageTest() {
	super();
	
	}
	
	@BeforeMethod

	public void setUp() {
	
	intialization();
	contactsPage  = new ContactsPage();
	  loginPage = new LoginPage();
	  homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	 // testUtil= new TestUtil();
	}

	@Test(priority = 1)
	public void verifyHomePageTitleTest() {
	String HomePageTitle = homePage.verifyHomePageTitle();
	Assert.assertEquals(HomePageTitle, "Cogmento CRM");
	}
	@Test(priority = 2)
	
	public void verifyContactslinkTest() {
		contactsPage = homePage.clickOnContactsLink();
		
	
		}
	@Test(priority = 3)
	public void verifyContactsLinkTest() {
	
	}
	
	@AfterMethod
	public void tearDoen() {
	driver.quit();
}
}
