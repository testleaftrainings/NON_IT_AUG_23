package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("dilip@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("dilip@2023");
		driver.findElement(By.name("login")).click();
		
		
	}

}
