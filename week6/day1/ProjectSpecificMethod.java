package week6.day1;

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

public class ProjectSpecificMethod {

	public RemoteWebDriver driver;
	//step-2
	public String filename;
	
	@Parameters({"url","password","username","browser"})
	
	//input agrs you need create in same order of @Parameters
	
	@BeforeMethod
	public void preCondition(String url,String pass,String uname,String browser) {
		
		 if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	
	@AfterMethod()
	public void postCondition() {
		driver.close();
	}
	
	//step1
	@DataProvider(name="fetchData",indices = {0})
	public String[][] sendData() throws IOException{
		
	return	IntegrationWithTC.excelData(filename);
		
	}
}
