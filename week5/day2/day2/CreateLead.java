package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {

	@DataProvider(name="fetchData",indices = {0,2})
	public String[][] sendData(){
		
		String[][] data=new String[3][3];
		
		data[0][0]="TestLeaf";
		data[0][1]="Dilip";
		data[0][2]="V R";
		
		data[1][0]="TestLeaf";
		data[1][1]="Gokul";
		data[1][2]="S";
		
		data[2][0]="TestLeaf";
		data[2][1]="Vinoth";
		data[2][2]="S";
		
		return data;
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






