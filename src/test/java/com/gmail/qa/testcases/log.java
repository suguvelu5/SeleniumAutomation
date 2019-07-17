package com.gmail.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.gmail.qa.base.testbase;
import com.gmail.qa.pages.homepage;
import com.gmail.qa.pages.login;


public class log extends testbase
{
 
   login ln;
   homepage homepage1;
	public log()
	{
		super();
	}
	
	@BeforeTest
	public void setup()
	{
		initialization();
		ln=new login();
		
		}
	
	@Test
	void titletest()
    {
		String title=ln.verifytitle();
		Assert.assertEquals(title, "Gmail");	
    }
}