package baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import week6.day1.IntegrationWithTC;

public class ProjectSpecificMethod {

	public  RemoteWebDriver driver;
	
	public static Properties p;
	public String filename;
	public static ExtentReports extent;
	public String testName,testDesc,testAuthor,testCategory;
	public  ExtentTest test,node;
	
	//extenttest will not exc for parallel exc
	//overcome extestTest create subnode
	
	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter repo=new ExtentHtmlReporter("./snaps/report.html");
			repo.setAppendExisting(true);
		extent=new ExtentReports();
		extent.attachReporter(repo);	
	}
	
	@AfterSuite
	public void endReport() {
		extent.flush();
	}
	
	@BeforeClass
	public void testDetails() {
		test=extent.createTest(testName, testDesc);
		test.assignAuthor(testAuthor);
		test.assignCategory(testCategory);
	}
	
	public void reportStep(String message,String status) throws IOException {
		if(status.equalsIgnoreCase("pass")) {
			node.pass(message, MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
		}else if(status.equalsIgnoreCase("fail")) {
			node.fail(message, MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
		}
		
	}
	public int takeSnap() throws IOException {
		 int random=(int)(Math.random()*99999);
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/img"+random+".png");
		FileUtils.copyFile(scr, dest);
		return random;
		
	}
	
	
	
	
	
	
	
	@BeforeMethod
	public void preCondition() throws IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/Fr.properties");
          p= new Properties();
		p.load(fis);
		
		
		
		node = test.createNode(testName);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	
	@AfterMethod()
	public void postCondition() {
		driver.close();
	}
	
	
	@DataProvider(name="fetchData",indices = {0})
	public String[][] sendData() throws IOException{
		
	return	IntegrationWithTC.excelData(filename);
		
	}
	
}
