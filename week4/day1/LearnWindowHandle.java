package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://leafground.com/window.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//getWindowhandle - 1 address
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle +" "+ driver.getTitle());
		
//getwindowhandles- mulitple address
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		List<String>windows= new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windows.get(1));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("email")).sendKeys("dilip@testleaf.com");

		driver.close();
		//take back parent window 
		driver.switchTo().window(windows.get(0));
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
	}

}
