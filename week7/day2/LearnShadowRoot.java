package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.sukgu.Shadow;

public class LearnShadowRoot {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev103115.service-now.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		driver.findElement(By.id("user_name")).sendKeys("admin");
		
		driver.findElement(By.id("user_password")).sendKeys("Xl$C6=jwkY4K");
		
		driver.findElement(By.id("sysverb_login")).click();
		
		Shadow dom=new Shadow(driver);
		//shadow we have implicit wait
		dom.setImplicitWait(30);
		dom.findElementByXPath("//div[text()='All']").click();
		
		
		
		
	
	}

}
