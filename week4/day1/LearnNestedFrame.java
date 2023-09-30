package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) {
ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://leafground.com/frame.xhtml");
		//2frame handle
		
		//1st frame
		
		driver.switchTo().frame(2);
		
		//2nd frame
		
		driver.switchTo().frame("frame2");
		
		//action click
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();

		driver.switchTo().parentFrame();
		
	}

}
