package Tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

/* Class created for Test Case Execution
 * 
 */

public class TestCasesExecution extends BaseClass{

	// saving this for filing
	
	/*
	@Test
	public void testOne() {
		
		ExtentTest extent_obj = extent.createTest("TEST", "Dummy TEST CASE").assignAuthor("Shaikh Muhammad Umair").assignCategory("Smoke").assignCategory("Regression").assignDevice("S8");
		
		extent_obj.pass("Logged in successfully");
		extent_obj.info("URL is loaded");
		extent_obj.info("Values entered");
		extent_obj.pass("Login Test completed successfully");
		extent_obj.log(Status.PASS, "Test ONE Executed successfully");
		
		System.out.println("Test Case 1 Working Fine ");
	}
	
	
	Screenshot scene....
	
		@BeforeTest
	public String getScreenShotPath() throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//path= System.getProperty("user.dir"+"/Screenshots/image.png");
		//FileUtils.copyFile(source, new File(path));
		
		int count=1;
		FileUtils.copyFile(source, new File ("sc"+count+".jpg"));
		count++;
		return path;
	}
	
	@Test
	public void testTwo() throws IOException {
		ExtentTest extent_obj = extent.createTest("WORKING TEST CASE", "This test case will Login with correct user").assignAuthor("Shaikh Muhammad Umair").assignCategory("Smoke").assignCategory("Regression").assignDevice("S8");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"LOGIN\"]")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		//extent.pass("Clicking on Login Button", MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenShotPath()).build());
		
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);		
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Mobile No\"]")).sendKeys("03189854468");
		//extent_obj.pass("Entering Mobile Number", MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenShotPath()).build());

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);		
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Password\"]")).sendKeys("Testing");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);	
//		extent_obj.pass("Entering Mobile Number", MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenShotPath()).build());
		extent_obj.pass("Test", MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenShotPath()).build());
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	}*/
}