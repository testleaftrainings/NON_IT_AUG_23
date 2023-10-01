package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/table.xhtml");
		
		String firstData = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody//td")).getText();
		
		System.out.println(firstData);
		
		String rowcol = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[2]/td[2]")).getText();
		
		System.out.println(rowcol);
		
		
		List<WebElement> rowNum = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
		
		int rowData = rowNum.size();
		
		System.out.println("Row Size : "+rowData);
		
		
		
		List<WebElement> colNum = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
		
		int colData = colNum.size();
		
		System.out.println("Col Size : "+ colData);
		
		
		//print all data in the table
		
		//its rowdata
		for (int i = 1; i <=rowData; i++) {
			
			for (int j = 1; j <=colData; j++) {
				
				//findElement 
				
				String allTableData= driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(allTableData);
			}
			
		}
		
	}

}
