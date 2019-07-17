package Reports;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentreportTestNG {
	
	WebDriver driver;
	ExtentHtmlReporter htmlreport;
	ExtentReports report;
	ExtentTest test;
	
	@BeforeMethod
	public void setup()
	{
		 htmlreport=new ExtentHtmlReporter("TestNGextentreport.html");
	       report=new ExtentReports();
	      report.attachReporter(htmlreport);
	       test=report.createTest("My firsttest","Sample test report");
	      
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\Vega\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
		
	}
	@Test
	public void test() throws IOException {
	test.log(Status.INFO, "Test starting");
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	test.pass("Navigated to google");
	driver.findElement(By.name("q")).sendKeys("hello");
	
	test.pass("searching for hello");
	driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).sendKeys(Keys.ENTER);
	
	test.pass("Entered on search button");
	//test.addScreenCaptureFromPath("image.png");
	}
	
	@AfterMethod
	public void teardown() {
		
		report.flush();
		driver.close();
	}

}
