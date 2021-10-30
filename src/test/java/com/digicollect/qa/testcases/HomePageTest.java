package com.digicollect.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.digicollect.base.TestBase;
import com.digicollect.pages.HomePage;
import com.digicollect.pages.LoginPage;
import com.digicollect.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;

	
	public HomePageTest() {
		super();
	}

	@Test
	public void createCompany() throws InterruptedException {
		
		// driver init
		initialization();
		
		// login
		loginPage = new LoginPage();
		boolean flag = loginPage.validatedigiLogo();
		Assert.assertTrue(flag);
		homePage = loginPage.login(prop.getProperty("loginID"), prop.getProperty("password"));
		
		// verify home page title
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "DigiCollect CRM");
		Assert.assertTrue(homePage.verifyCorrectUserName());
		
		// create new company
		homePage.clickOnCompaniesLink();
		homePage.clickOnCreateNewLink();
		homePage.enterCompanyData();
		homePage.verifySuccessMessage();
		
		// close browser
		driver.quit();
		
	}

}
