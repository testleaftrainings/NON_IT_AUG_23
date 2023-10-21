package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{

	//create the constructor for driver instance
	
	public LoginPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	
//static parameter-need create input agrs inside method and replace hardcode value	
	public LoginPage enterUserName(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);

		//m1
		/*
		 * LoginPage lp = new LoginPage();
		 *  return lp;
		 */
		
		//m2
		return this;
	}
	
	public LoginPage enterPassword(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);

		return this;
	}
	
	public HomePage clickOnLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

		return new HomePage(driver);
	}
}
