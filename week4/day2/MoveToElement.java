package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	public static void main(String[] args) {
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		
		WebElement mouseOver = driver.findElement(By.linkText("MEN"));
		
		Actions obj= new Actions(driver);
		
		//perform()-mandatory
		
		obj.moveToElement(mouseOver).perform();
		
		
		
	}
}
