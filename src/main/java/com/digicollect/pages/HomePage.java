package com.digicollect.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.digicollect.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//span[text()='Companies']//parent::a")
	private WebElement linkCompanies;
	
	@FindBy(xpath = "//span[text()='Companies']//parent::a//following-sibling::ul//descendant::a[contains(text(),'Create New')]")
	private WebElement linkCreateNew;
	
	@FindBy(xpath = "//span[text()='jack8345@gmail.com']")
	private WebElement userNameLabel;
	
	@FindBy(xpath = "//input[@name='company_name']")
	private WebElement inputCompanyName;
	
	@FindBy(xpath = "//div[@name='company_domain']//child::input")
	private WebElement inputDomainName;
	
	@FindBy(xpath = "//span[contains(text(),'Select Industry')]")
	private WebElement dropdownIndustryType;
	
	@FindBy(xpath = "//span[contains(text(),'Finance')]")
	private WebElement valueIndustryType;
	
	@FindBy(xpath = "//input[@placeholder='Select Date']")
	private WebElement inputDateOfIncorporation;
	
	@FindBy(xpath = "//td[text()='13']")
	private WebElement valueDate;
	
	@FindBy(xpath = "//button[text()='APPLY']")
	private WebElement btnApply;
	
	@FindBy(xpath = "//div[@name='number_of_employees']//input[@role='combobox']")
	private WebElement inputNumOfEmp;
	
	@FindBy(xpath = "//input[@placeholder='Enter Tax ID']")
	private WebElement inputTaxID;
	
	@FindBy(xpath = "//span[contains(text(),'Select Currency')]")
	private WebElement dropdownCurrency;
	
	@FindBy(xpath = "//span[contains(text(),'USD')]")
	private WebElement valueCurrency;
	
	@FindBy(xpath = "//textarea[@data-vv-as='About']")
	private WebElement inputAbout;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement chkbxAllowpublicDomain;
	
	@FindBy(xpath = "//input[@name='primary_email']")
	private WebElement inputEmail;
	
	
	@FindBy(xpath = "//input[@name='phone_number']")
	private WebElement inputPrimPhNum;
	
	@FindBy(xpath = "//input[contains(@name,'branch_code')]")
	private WebElement inputBranchCode;
	
	@FindBy(xpath = "//input[contains(@name,'branch_name')]")
	private WebElement inputBranchName;
	
	@FindBy(xpath = "//input[contains(@name,'branch_department')]")
	private WebElement inputDepartment;
	
	@FindBy(xpath = "//input[@name='branch_email0']")
	private WebElement inputBranchEmail;
	
	@FindBy(xpath = "//input[@name='phone_number0']")
	private WebElement inputBranchPhonenum;
	
	@FindBy(xpath = "//input[@name='branchWebsite0']")
	private WebElement inputBranchWebsite;
	
	@FindBy(xpath = "//span[text()='Office']")
	private WebElement radioOffice;
	
	@FindBy(xpath = "//input[@name='get_location']")
	private WebElement inputLocation;
	
	@FindBy(xpath = "//input[contains(@name,'branch_building_number')]")
	private WebElement inputBuildingNo;
	
	@FindBy(xpath = "//input[@name='branch_street0']")
	private WebElement inputStreet1;
	
	@FindBy(xpath = "//input[@name='branch_street20']")
	private WebElement inputStreet2;
	
	@FindBy(xpath = "//input[@name='branch_city0']")
	private WebElement inputCity;
	
	@FindBy(xpath = "//input[contains(@name,'branch_township')]")
	private WebElement inputTownship;
	
	@FindBy(xpath = "//input[contains(@name,'branch_state')]")
	private WebElement inputState;
	
	@FindBy(xpath = "//input[contains(@name,'branch_pin_code')]")
	private WebElement inputZipcode;

	@FindBy(xpath = "//span[contains(text(),'Select Country')]")
	private WebElement inputCountry;
	
	@FindBy(xpath = "//span[text()='ANGOLA']")
	private WebElement valueCountry;
	
	@FindBy(xpath = "//input[contains(@name,'location_url')]")
	private WebElement inputLocationURL;
	
	@FindBy(xpath = "//input[@name='admin_name']")
	private WebElement inputAdminname;
	
	@FindBy(xpath = "//input[@name='admin_email']")
	private WebElement inputAdminEmail;
	
	@FindBy(xpath = "//div[@name='select_admin_domain']//input[@role='combobox']")
	private WebElement dropdownAdminEmailDomain;
	
	@FindBy(xpath = "//div[@name='admin_branch_name']//input[@role='combobox']")
	private WebElement dropdownBranchName;
	
	@FindBy(xpath = "//div[@name='admin_branch_department']//input[@role='combobox']")
	private WebElement dropdownDepartment;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement inputPassword;
	
	@FindBy(xpath = "//button[text()='SAVE']")
	private WebElement btnSave;
	
	@FindBy(xpath = "//*[text()='Success!']")
	private WebElement textSucess;
	
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement buttonOK;
	
	
	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName(){
		return userNameLabel.isDisplayed();
	}
	
	public void clickOnCompaniesLink(){
		linkCompanies.click();
	}
	
	public void clickOnCreateNewLink(){
		linkCreateNew.click();
	}
	
	public void enterCompanyData() {
		inputCompanyName.sendKeys("DigiCollect test123");
		inputDomainName.sendKeys("Test12345.com");
		dropdownIndustryType.click();
		valueIndustryType.click();
		inputDateOfIncorporation.click();
		valueDate.click();
		btnApply.click();
		inputNumOfEmp.click();
		inputNumOfEmp.sendKeys(Keys.ENTER);
		inputTaxID.sendKeys("12345");
		dropdownCurrency.click();
		valueCurrency.click();
		inputAbout.sendKeys("Test test test");
		chkbxAllowpublicDomain.click();
		inputEmail.sendKeys("test");
		inputPrimPhNum.sendKeys("9201929929");
		inputBranchCode.sendKeys("1313");
		inputBranchName.sendKeys("Test123");
		inputDepartment.sendKeys("Testing");
		inputBranchEmail.sendKeys("test@digi.com");
		inputBranchPhonenum.sendKeys("1219938372");
		inputBranchWebsite.sendKeys("crm.digicollect.com");
		radioOffice.click();
		inputBuildingNo.sendKeys("200");
		inputStreet1.sendKeys("1");
		inputStreet2.sendKeys("2");
		inputCity.sendKeys("Bangalore");
		inputTownship.sendKeys("Singapore township");
		inputState.sendKeys("Karnataka");
		inputCountry.click();
		valueCountry.click();
		inputLocationURL.sendKeys("https://crm.digicollect.com/setup");
		inputAdminname.sendKeys("Test Admin");
		inputAdminEmail.sendKeys("testadmin");
		dropdownAdminEmailDomain.click();
		dropdownAdminEmailDomain.sendKeys(Keys.ENTER);
		dropdownBranchName.click();
		dropdownBranchName.sendKeys(Keys.ENTER);
		dropdownDepartment.click();
		dropdownDepartment.sendKeys(Keys.ENTER);
		inputPassword.sendKeys("Testing@123");
		btnSave.click();
	}
	
	public void verifySuccessMessage() throws InterruptedException {
		Thread.sleep(5);
		if (textSucess.isDisplayed()) {
			Reporter.log("Company is created successfully");
			buttonOK.click();
		} else {
			Assert.fail("Company is not created");
		}
	}	

}
