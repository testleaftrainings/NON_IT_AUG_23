package baseclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week6.day1.IntegrationWithTC;

public class ProjectSpecificMethod {

	public  RemoteWebDriver driver;
	
	
	public String filename;
	/*
	 * public static RemoteWebDriver driver;
	 * 
	 * static is not given it throw nullpointer 
	 * if we need execution parallel meansi should not use static 
	 * driver is the issue
	 */
	
	
	@BeforeMethod
	public void preCondition() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	
	@AfterMethod()
	public void postCondition() {
		driver.close();
	}
	
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException{
		
	return	IntegrationWithTC.excelData(filename);
		
	}
	
}
