package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		//step 1- locator dropdown webelement
		
		//findElement -Ctrl+2+l -> return type ->webElement
		WebElement select = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//step-2 create object for Select Class
		
		Select opt=new Select(select);
		
		//step-3 call objectname.methodname
	//	opt.selectByValue("LEAD_DIRECTMAIL");
		
	//	opt.selectByVisibleText("Direct Mail");
		
		opt.selectByIndex(4);
		
	}

}
