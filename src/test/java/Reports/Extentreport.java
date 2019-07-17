package Reports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentreport {

	public static void main(String[] args) {

      ExtentHtmlReporter htmlreport=new ExtentHtmlReporter("extentreport.html");
      
      ExtentReports report=new ExtentReports();
      report.attachReporter(htmlreport);
      ExtentTest test=report.createTest("My firsttest","Sample test report");
      
      System.setProperty("webdriver.gecko.driver","C:\\Users\\Vega\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		test.log(Status.INFO, "Test starting");
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		test.pass("Navigated to google");
		driver.findElement(By.name("q")).sendKeys("hello");
		
		test.pass("searching for hello");
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).sendKeys(Keys.ENTER);
		
		test.pass("Entered on search button");
				driver.quit();
		test.pass("closed search");
      report.flush();

	}

}
