package Testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class practiceclass {

	
	@Test
	public void getstart() throws InterruptedException {
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.name("q")).sendKeys("ragu");
	    Thread.sleep(5000);
	   // List<WebElement> options=driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='lnnVSe']"));
	    List<WebElement> options=driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
	    System.out.println(options.size());
	   
	   
		  for(WebElement option:options) {
		  
		  String optionss= option.getText(); 
		  System.out.println(optionss);
		  if(optionss.contains("raghuvaran")) {
			  
			 
			  option.click();
			  break;
		  }
		  
		  }
		 
	   // driver.quit();
	
	}}
