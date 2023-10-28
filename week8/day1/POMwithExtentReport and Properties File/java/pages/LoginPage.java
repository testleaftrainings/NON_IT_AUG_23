package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import baseclass.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{

	public LoginPage(RemoteWebDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	
	public LoginPage enterUserName() throws IOException {
		try {
			driver.findElement(By.id("username")).sendKeys(p.getProperty("username"));
			reportStep("UserName as Enter Successfully","pass");
		} catch (Exception e) {
			reportStep("UserName as not Enter Successfully","fail");
		}

		
		return this;
	}
	
	public LoginPage enterPassword() throws IOException {
		try {
			driver.findElement(By.id("password")).sendKeys(p.getProperty("password"));
			reportStep("Password as Enter Successfully","pass");
		} catch (Exception e) {
			reportStep("Password as not Enter Successfully","fail");
		}

		return this;
	}
	
	public HomePage clickOnLogin() throws IOException {
		try {
			driver.findElement(By.className("decorativeSubmit")).click();
			reportStep("Login is Successfully","pass");

		} catch (Exception e) {
			reportStep("Login is not Successfully","fail");
		}

		return new HomePage(driver,node);
	}
}
