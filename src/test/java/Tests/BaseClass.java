package Tests;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClass{

	// DELETE THIS CLASS AS ALREADY CREATED PREVIOUSLY
	
	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
	//public AppiumDriver<MobileElement> driver;
	public AppiumDriver<MobileElement> driver;
	//FOR NEW CLASS ADDED, ADDING BELOW CODE! REMOVE ONCE DONE!!
	//AppiumDriver<WebElement> driver;
	
	WebDriver Driver;
	String path;
	
	@BeforeTest
	public void Setup() {
		
		try {
		/*
		 * APPIUM Server URL "http://127.0.0.1:4723/wd/hub"
		 */
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		DesiredCapabilities obj = new DesiredCapabilities();
		//System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		System.setProperty("http://127.0.0.1:4723/wd/hub", "obj");
		//Driver = new ChromeDriver();
		
		// obj.setCapability(MobileCapabilityType, "");
		
		obj.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		obj.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
		obj.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		obj.setCapability(MobileCapabilityType.UDID, "");
		obj.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		//obj.setCapability(MobileCapabilityType.NO_RESET, "true");
		obj.setCapability(MobileCapabilityType.FULL_RESET, "true");
		
		obj.setCapability(MobileCapabilityType.APP, "C:/Users/M Umair/Downloads/Test.apk");
		//obj.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		driver = new AppiumDriver<MobileElement> (url, obj);
		
		//remove once done and uncomment the above statement!
		//driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),obj);
		
		} 
		
		catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println("The cause is : "+exp.getCause());
			System.out.println("The message is : "+exp.getMessage());
			exp.printStackTrace();
			
		}
		
	}
	
	@BeforeSuite
	public void reportSetup() {
		
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("Automation");
		spark.config().setReportName("Mobile Automation Report");
		extent.attachReporter(spark);
	}
	
	
	@AfterTest
	public void TearDowns() throws IOException {
		driver.quit();
		//driver.removeApp("com.example.Test");
		extent.flush();
		Desktop.getDesktop().browse(new File("index.html").toURI());
	}
	
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
	
		
}