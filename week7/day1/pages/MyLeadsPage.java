package pages;

import org.openqa.selenium.By;

import baseclass.ProjectSpecificMethod;

public class MyLeadsPage extends ProjectSpecificMethod {

	
	public void clickOnCreateLeadTap() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
}
