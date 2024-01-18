package Testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerex extends firstclass implements ITestListener,IRetryAnalyzer {
	
	public void onTestFailure(ITestResult result) {
		String testname=result.getName();
	System.out.println(testname + "failed");
	
	WebDriver driver = null;
	try {
		driver = (WebDriver)result.getTestClass().getRealClass()
				.getDeclaredField("driver").get(result.getInstance());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			try {
				FileUtils.copyFile(file, new File("//D://screenshot3.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	private int retryCount = 0;
    private static final int MAX_RETRY_COUNT = 3;
	public boolean retry(ITestResult result) {
		 if (retryCount < MAX_RETRY_COUNT) {
	            retryCount++;
	            return true; // Retry the test
	        }
		return false;
	}

}
