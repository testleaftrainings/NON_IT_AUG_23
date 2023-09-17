package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicXpath {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		
		String actual="Leaftaps - TestLeaf Automation Platform";
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//compare string value ,use .equals()
		if(title.equals(actual)) {
			System.out.println("login successfull");
		}else {
			System.out.println("login not successfull");
		}
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	}

}
