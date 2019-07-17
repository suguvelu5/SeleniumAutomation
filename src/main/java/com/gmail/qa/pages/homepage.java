package com.gmail.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.qa.base.testbase;

public class homepage extends testbase{
	
		
// Object Repository OR:
	@FindBy(xpath="//a[contains(text(),'Starred')]")
	WebElement starred;
	@FindBy(xpath="//div[@class='TN bzz aHS-bu1']//div[@class='aio UKr6le']")
	WebElement snoozed;
	@FindBy(xpath="//a[contains(text(),'Sent')]")
	WebElement sent;
	
	//Initializing page objects
		public homepage()
		{
			PageFactory.initElements(driver, this);
			
		}
				
		public String homepagetitleverify()
		{
			return driver.getTitle();
			
		}
		
		
		public void clickonstarred()
		{
			starred.click();
			
		}
	    
	
	
	

}
