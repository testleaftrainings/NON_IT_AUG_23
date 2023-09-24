package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		
		//findelements- list<webelement>
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int totallinks = links.size();
		System.out.println("total number of link :"+ totallinks);
		
		/*
		 * for (int i = 0; i <totallinks; i++) {
		 * 
		 * System.out.println(links.get(i).getText()); }
		 */
		
		List<String> list= new ArrayList<String>();
		
		//collection we for each-loop
		
		for (WebElement data : links) {
			String text = data.getText();
			//System.out.println(text);
			
			list.add(text);
			
		}
		
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}
