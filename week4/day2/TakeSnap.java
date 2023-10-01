package week4.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSnap {

	public static void main(String[] args) throws IOException {
		
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.manage().window().maximize();
			
				WebElement user = driver.findElement(By.id("username"));
				user.sendKeys("Demosalesmanager");
				
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				//snap -3steps
				
				//step-1-snap
				File scr = user.getScreenshotAs(OutputType.FILE);
				
				//step-2-folder
				File des=new File("./snaps/img1.png");
				
				//step3-merge file 
				FileUtils.copyFile(scr, des);

	}

}
