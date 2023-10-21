package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.ProjectSpecificMethod;

public class MyHomePage  extends ProjectSpecificMethod{
	
	public MyHomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnLeads() {
		driver.findElement(By.linkText("Leads")).click();
	}
}
