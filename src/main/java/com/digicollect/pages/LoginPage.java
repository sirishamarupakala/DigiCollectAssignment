package com.digicollect.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.digicollect.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath = "//img[@alt='crm']")
	private WebElement digiLogo;
	
	@FindBy(xpath = "//input[@name='userid']")
	private WebElement inputLoginID;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement inputPassword;
	
	@FindBy(xpath = "//button[text()='Sign In']")
	private WebElement btnSignin;
	
	@FindBy(xpath = "//input[@value='Personal']")
	private WebElement radioPersonal;
	
	@FindBy(xpath = "//input[@value='Business']")
	private WebElement radioBusiness;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validatedigiLogo(){
		return digiLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd){
		inputLoginID.sendKeys(un);
		inputPassword.sendKeys(pwd);
		btnSignin.click();
		return new HomePage();
	}
	
}
