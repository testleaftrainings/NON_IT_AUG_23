package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Erail {

	public static void main(String[] args) {
		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("--disable-notifications");
		EdgeDriver driver = new EdgeDriver(opt);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MAS",Keys.ENTER);
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("Cape",Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		List<WebElement> trainnames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
		
		int trainSize = trainnames.size();
		
		for (int i = 1; i <=trainSize; i++) {
			String text = trainnames.get(i).getText();
			System.out.println(text);
			
		}
	}

}
