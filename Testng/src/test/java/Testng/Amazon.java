package Testng;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	WebDriver driver;
	
	@Test
	public void dropdownmethod() throws IOException {
		/*
		 * WebDriverManager.chromiumdriver().setup(); ChromeOptions options = new
		 * ChromeOptions(); options.addArguments("--remote-allow-origins=*");
		 */
		System.setProperty("webdriver.chrome.driver", "D:\\Soft\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 driver =new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ENTER);;
		
		
		  WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		File file=  dropdown.getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(file, new File("//d/screenshot.png"));
		  Select select =new Select(dropdown);
		  select.selectByVisibleText("Garden & Outdoors");
		 
		
		/*
		 * List<WebElement>dropdownoptions=select.getOptions(); for(WebElement
		 * options:dropdownoptions) { if(options.getText().equals("Baby")) {
		 * options.click(); } }
		 */
		
		
		
	}
}
