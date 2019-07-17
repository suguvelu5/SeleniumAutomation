package com.gmail.qa.util;

import com.gmail.qa.base.testbase;

public class testutil extends testbase {
	
	public static long page_load_wait = 40 ;
	public static long implicit_wait = 40;
	
	public void switchtoframe()
	
	{
		driver.switchTo().frame("mainpanel");
				
	}
	

}
