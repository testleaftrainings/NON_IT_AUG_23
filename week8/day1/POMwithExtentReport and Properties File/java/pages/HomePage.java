package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import baseclass.ProjectSpecificMethod;
public class HomePage  extends ProjectSpecificMethod{

	public HomePage(RemoteWebDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	
	
	public MyHomePage clickOnCRMSFA() throws IOException {
		try {
			driver.findElement(By.linkText("CRM/SFA")).click();
			reportStep("Crmsfa clicked Successfully","pass");

		} catch (Exception e) {
			reportStep("Crmsfa is not clicked Successfully","pass");

		}
  
		return new MyHomePage(driver);
	}
	
	public LoginPage clickOnLogOut() throws IOException {
		try {
			driver.findElement(By.className("decorativeSubmit")).click();
			reportStep("Logout button is clicked Successfully","pass");

		} catch (Exception e) {
			reportStep("Logout button is not clicked Successfully","pass");

		}
 
		return new LoginPage(driver,node);
	}
}
