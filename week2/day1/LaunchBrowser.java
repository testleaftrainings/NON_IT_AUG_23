package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
	
		//step1- launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//step 2-load the url
		driver.get("http://leaftaps.com/opentaps/control/main");

		//step3- maximized
		driver.manage().window().maximize();
		
		//syntax
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
	//	driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//step4-close 
		driver.close();
	}

}
