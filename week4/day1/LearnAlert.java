package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://leafground.com/alert.xhtml");
		
		//simple alert
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//syntax
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		
		alert.accept();
		
		Thread.sleep(3000);
		//confirm alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();

		alert.dismiss();
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
		
		alert.accept();
	}

}
