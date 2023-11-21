package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class InterviewPreparation {


	
	
	@Test(enabled=false)
	public void firstone() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Download']")).click();
		
	}
	@Test(enabled=false)
	public void Secondone() {
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.com/ref=nav_bb_logo");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement languagedropdown=driver.findElement(By.id("icp-nav-flyout"));
		Actions action=new Actions(driver);
		action.moveToElement(languagedropdown).build().perform();
		driver.findElement(By.xpath("//div[text()='Change country/region.']")).click();		
		
	}
	
	@Test
	public void Thirdone() throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();
//		WebDriverWait wait=new WebDriverWait(driver,20000);
//		wait.until(ExpectedConditions.visibilityOf(By.xpath(null))));
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		driver.findElement(By.xpath("//span[text()='My Info']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click();
		//driver.findElement(By.xpath("//div[text()='No file selected']")).sendKeys("E:\\Ragu official documents\\Resume\\Ragukumar QA Resume");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
