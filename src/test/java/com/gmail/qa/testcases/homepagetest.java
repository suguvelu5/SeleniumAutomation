package com.gmail.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.gmail.qa.base.testbase;
import com.gmail.qa.pages.homepage;
import com.gmail.qa.pages.login;

public class homepagetest extends testbase {
	
	login ln1;
	homepage homepage2;
	
public homepagetest()
{
super();	
}
@BeforeMethod

public void setup()
{
	initialization();
	ln1=new login();
	homepage2=ln1.paglogin(prop.getProperty("username"), prop.getProperty("password"));
}

@Test
public void homepagetitlecheck()
{
	String hm1=homepage2.homepagetitleverify();
		Assert.assertEquals(hm1, "CRMPRO - CRM software for customer relationship management, sales, and support.","title not checked");
	}

@AfterMethod
public void teardown()
{
	driver.close();
	
	
}



	

}
