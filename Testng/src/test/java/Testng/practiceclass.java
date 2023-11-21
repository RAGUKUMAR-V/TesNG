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
	public void getstart() {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.name("q")).sendKeys("QBurst");
	    List<WebElement> options=driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@role='option']"));
	    
	    System.out.println(options.size());
	    for(int i=0;i<options.size();i++) {
	    	System.out.println(options.get(i).getText()); 
	    }
	    driver.quit();
	    
		/*
		 * for(WebElement option:options) {
		 * 
		 * String optionss= option.getText(); System.out.println(optionss); }
		 */
	
	}}
