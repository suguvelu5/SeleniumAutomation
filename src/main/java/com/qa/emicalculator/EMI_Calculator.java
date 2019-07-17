package com.qa.emicalculator;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class EMI_Calculator {
	WebDriver driver;
	
	@Test
	public void emicalc()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vega\\Downloads\\chromedriver.exe");
		 driver = new ChromeDriver();
	    
	    driver.get("https://emicalculator.net/");
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    Actions action=new Actions(driver);
		
	    WebElement loanamount=driver.findElement(By.cssSelector("#loanamountslider>span"));
	    WebElement Interestrate=driver.findElement(By.cssSelector("#loaninterestslider>span"));
	    WebElement loantenure=driver.findElement(By.cssSelector("#loantermslider>span"));
	    
	    action.dragAndDropBy(loanamount, 83, 0).build().perform();
	    action.dragAndDropBy(Interestrate, 88, 0).build().perform();
	    action.dragAndDropBy(loantenure, -112, 0).build().perform();
	    
	   WebElement amount=driver.findElement(By.xpath("//*[@id=\"emiamount\"]/p/span"));
	   String s=amount.getText();
		  
	   System.out.println(s);
	 
	
	}     

	@AfterMethod
	public void teardown() {
		driver.close();
		
	}
	
}
