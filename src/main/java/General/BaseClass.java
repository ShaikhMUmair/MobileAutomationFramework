package General;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Report.ExtentReport;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	/*
	 * Design pattern implementation!
	 */
	
//	String actual, expected;
	public static AppiumDriver<MobileElement> driver;	
	public static SoftAssert s_assert = new SoftAssert();

//	public static ExtentReports extent = new ExtentReports();
//	public static ExtentSparkReporter spark = new ExtentSparkReporter("Report.html");
//	public static ExtentTest test;

	
	private BaseClass() 
	{
		
	}

	static  
    {  
		try {

			/*
			 * APPIUM Server URL "http://127.0.0.1:4723/wd/hub"
			 */
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		DesiredCapabilities obj = new DesiredCapabilities();
		System.setProperty("http://127.0.0.1:4723/wd/hub", "obj");
		
		//obj.setCapability(MobileCapabilityType.NO_RESET, "true");	
		//obj.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

		obj.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		obj.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		obj.setCapability(MobileCapabilityType.DEVICE_NAME, "Level 3's Galaxy Note9");
		obj.setCapability(MobileCapabilityType.UDID, "2b4c1f15411c7ece");
		obj.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		obj.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
		obj.setCapability(MobileCapabilityType.FULL_RESET, "true");
		obj.setCapability(MobileCapabilityType.APP, "E:\\UBL_Builds\\v3\\3.0.1(2)\\UBLDigital3.0.1.apk");
//		obj.setCapability(MobileCapabilityType.APPLICATION_NAME, null)

		
//		setting the below for build 10
//		obj.setCapability("appPackage","app.com.brd");
//		obj.setCapability("appActivity","com.peekaboosdk.MainActivity");		
//		obj.setCapability("appActivity","app.com.brd.ui.activities.SplashActivity");
		
		
		driver = new AppiumDriver<MobileElement> (url, obj);
		System.out.println("PHYISCAL DEVICE CONNECTED AND SETUP IS WOKRING!");			
		//WebDriverWait wait = new WebDriverWait(driver,30);		
		} 
		
		catch (Exception exp) 
		{
			// TODO Auto-generated catch block
			System.out.println("PHYISCAL DEVICE AND SETUP ARE NOT WOKRING!");		
			System.out.println("The cause is : "+exp.getCause());
			System.out.println("The message is : "+exp.getMessage());
			exp.printStackTrace();	
		}	
			
    }  
	
//	@BeforeSuite
//	public void reportSetup() 
//	{
//		System.out.println("Report Setup Function Called");
//		spark.config().setTheme(Theme.STANDARD);
//		spark.config().setDocumentTitle("Report");
//		spark.config().setReportName("Digital App Report");
//		extent.attachReporter(spark);
//	}
//		
	
	public static AppiumDriver<MobileElement> getDriver()
	{
			return driver;
	}

	public static SoftAssert getAssertDriver()
	{
		return s_assert;
	}
	
	
	@BeforeSuite
	public void before_Suite()
	{
		ExtentReport.initReport();
	}
	
	
	@AfterSuite
	public void after_Suite()
	{
		ExtentReport.flushReport();
	}

	public static void AssertUmair(String actual,String expected, String tc_scenario , String checking_condition)
	{
		System.out.println("Checking : "+checking_condition);
		BaseClass.getDriver().manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
		System.out.println("Applied wait for 2 min");
		s_assert.assertEquals(actual, expected);
		s_assert.assertEquals(actual, expected, checking_condition);
		System.out.println(tc_scenario);

	}
	
	// For further driver.pressKey(KeyEvent(AndroidKey.A))
}