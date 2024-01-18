package Handson_Package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTables {

	//table[@id='customers']//tr//td
	//table[@id='customers']//td[normalize-space()='Ernst Handel'] //following::td[2]
	
	@Test
	
	public void browserstart() throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> columndata=driver.findElements(By.xpath("//table[@id='customers']//tr//td[3]"));
		
		for(WebElement ele:columndata) {
			
			String data=ele.getText();
			System.out.println(data);
		}
		
		driver.quit();
	} 
	
}
