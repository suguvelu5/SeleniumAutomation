package com.gmail.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.gmail.qa.util.testutil;

public class testbase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	 public testbase() 
	{
		 try
		 {
			 prop=new Properties();
			 
			 FileInputStream ip=new FileInputStream("C:\\Users\\Vega\\eclipse-workspace1\\MavenAutomation\\src\\main\\java\\com\\gmail\\qa\\config\\config2.properties");
			 
			 prop.load(ip);
			 
		 }catch(FileNotFoundException e)
		 {
		e.printStackTrace();	 
			 
		 }catch(IOException e)
		 {
			 e.printStackTrace();
		 }
		 
		
	}
	
	public static void initialization()
	{
		String browser=prop.getProperty("browser");
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Vega\\Downloads\\chromedriver.exe");
		    driver = new ChromeDriver();
		}
		    
		    else if(browser.equals("Firefox"))
		    {
		    	System.setProperty("webdriver.gecko.driver","C:\\Users\\Vega\\Downloads\\geckodriver.exe");
			    driver = new FirefoxDriver();
		    	
		    }
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(testutil.page_load_wait, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(testutil.implicit_wait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
			
		}
	
		

	
	
	}
	 