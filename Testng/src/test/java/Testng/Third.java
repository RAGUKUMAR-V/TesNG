package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Third {
@Test
	public void run() {
		System.out.println("Third");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.javatpoint.com/method-in-java");
	}
	
	
	
}
