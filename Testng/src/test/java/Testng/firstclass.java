package Testng;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.*;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class firstclass {
	WebDriver driver;
@Test(retryAnalyzer=Listenerex.class)
	public void run() {
		System.out.println("First");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Ragu");
		String title=driver.getTitle();
		Assert.assertEquals(title, "qwqw");
	
		
	}
	
	
	
}
