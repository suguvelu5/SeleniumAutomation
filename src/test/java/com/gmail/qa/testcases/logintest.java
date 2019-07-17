package com.gmail.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.gmail.qa.base.testbase;
import com.gmail.qa.pages.homepage;
import com.gmail.qa.pages.login;
import com.gmail.qa.util.testutil;


public class logintest extends testbase
{
 
   login ln;
   homepage homepage1;
  testutil util;
	public logintest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		ln=new login();
		ln.paglogin(prop.getProperty("username"),prop.getProperty("password"));	
		util=new testutil();
		
		
	}
		
	@Test(priority=1)
	void titletest()
    {
		String title=ln.verifytitle();
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.","Sugashini title test fails");	
    }
	/*@Test(priority=2)
	public void labeltest()
	{
		util.switchtoframe();
		Assert.assertTrue(ln.verifylabel(), "sugashini logo fails");
	}*/
	@Test(priority=3)
	public void logintest1()
	{
		
		homepage1 = ln.paglogin(prop.getProperty("username"),prop.getProperty("password"));		
		
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
		
		
	}
	
	
	
}
	
	