package com.digicollect.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.digicollect.base.TestBase;
import com.digicollect.pages.HomePage;
import com.digicollect.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	
	@Test
	public void login()
	{
		initialization();
		loginPage = new LoginPage();
		boolean flag = loginPage.validatedigiLogo();
		Assert.assertTrue(flag);
		homePage = loginPage.login(prop.getProperty("loginID"), prop.getProperty("password"));
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "DigiCollect CRM");
		driver.quit();
	}
	
}