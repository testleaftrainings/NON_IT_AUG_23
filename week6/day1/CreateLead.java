package week6.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {

	/*
	 * @DataProvider(name="fetchData",indices = {0,2}) 
	 * public String[][] sendData()throws IOException{
	 * 
	 * //integration with excel //static -without creating object i can all the
	 * method //classname.methodname
	 * 
	 * //step5 return IntegrationWithTC.excelData();
	 * 
	 * }
	 */
	
	@BeforeTest
	public void setData() {
		filename="CreateLead";
	}
	
	
	
	@Test(dataProvider = "fetchData")
	public  void runCreateLead(String comName,String fName,String lName) {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(comName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		
}
	
	
}






