package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://leafground.com/frame.xhtml");
		
		//handle frame 
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
		//need switch back main page 
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();

	}

}
