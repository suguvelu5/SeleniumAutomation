package com.gmail.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.qa.base.testbase;

public class login extends testbase
{

	// Object Repository OR:
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-small']")
	WebElement signin;
	
	@FindBy(xpath="//td[contains(text(),'User: Sugu velu')]")
	WebElement profilename;
	@FindBy(xpath="//a[contains(text(),'Alerts')]")
	WebElement alert;
	
	//Initializing page objects
	public login()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//actions
	public String verifytitle()
	{
		return driver.getTitle();
		
	}
	
	public boolean verifylabel()
	{
		return profilename.isDisplayed();
	}
	

	public homepage paglogin(String un,String pw)
	{
		username.sendKeys(un);
		password.sendKeys(pw);
		//signin.click();
		
		return new homepage();
		
	}

	
	
}