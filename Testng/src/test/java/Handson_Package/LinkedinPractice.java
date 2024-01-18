package Handson_Package;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkedinPractice {

	
	//h2[contains(text(), 'Explore collaborative articles')]//following::ul[1]//a
@Test
	
	public void browserstart() throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element=driver.findElement(By.xpath("//h2[contains(text(), 'Explore collaborative articles')]"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		List<WebElement> links=driver.findElements(By.xpath("\r\n"
				+ "	//h2[contains(text(), 'Explore collaborative articles')]//following::ul[1]//a"));
		
	for(WebElement linkss:links) {
		
		String link=linkss.getAttribute("href");
		
		System.out.println(linkss.getText());
		
	}
	
	
}
}