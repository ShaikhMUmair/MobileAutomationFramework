package Tests;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Base64;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import General.BaseClass;
import Pages.Pages;
import Report.ExtentReport;

public class Home {

	Pages p = new Pages();
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("Report.html").viewConfigurer().viewOrder().as(new ViewName [] {ViewName.DASHBOARD , ViewName.TEST , ViewName.CATEGORY}).apply();
	
	/*
	 *  Create report for Failed TC
	 *  ExtentSparkReporter spark_failed = new ExtentSparkReporter("Failed_TC_Report.html").filter().statusFilter().as(new Status[] {Status.FAIL}).apply();
	 *  
	 *  Add the below line in TearDown Setup
	 *  Desktop.getDesktop().browse(new File("Failed_TC_Report.html").toURI());
	 *  
	 *  Add the below line in Report Setup
	 *  extent.attachReporter(spark , spark_failed);
	 *  Basically pass the object of newly created report i.e [spark_failed] for Failed tc's  
	 */
		
	@BeforeSuite
	public void reportSetup() 
	{
		System.out.println("Report Setup Function Calling");
		// SparkReporter is a kind of reporter to log things.
//		ExtentTest test = extent.createTest("Dummy test"); // Create a test node in report

//		To log anything we use the above object created.
//		test.info("Creating Dummy Test case");
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("Report");
		spark.config().setReportName("Digital App Report");
//		extent.attachReporter(spark , spark_failed);
		extent.attachReporter(spark);
		// extent will get the acknowledgment where to log it's event.
	}
	
	
//	@Test
	public void r1()
	{
		ExtentTest test = extent.createTest("First test case").assignAuthor("Shaikh Muhammad Umair").assignCategory("Smoke Test Cases").assignDevice("Note 9"); // Create a test node in report
		test.info("Creating Dummy Test case");
		test.info("Step 1 Perform");
		test.info("Step 2 Perform");
		test.info("Step 3 Perform");
		test.pass("R1 tc passed!");
		test.pass(MarkupHelper.createLabel("First Test Case executed successfully!!", ExtentColor.GREEN));
	}
	
//	@Test
	public void r2()
	{
		ExtentTest test = extent.createTest("Second test case"); // Create a test node in report
		test.info("Creating Dummy Test case");
		test.info("Step 1 Perform");
		test.info("Step 2 Perform");
		test.info("Step 3 Perform");
		test.fail("R2 tc failed!");
		test.fail(MarkupHelper.createLabel("Second Test Case failed!!", ExtentColor.RED));
	}
	
//	1st Method of SC
	public String getSC() throws IOException
	{
		File source = ((TakesScreenshot)BaseClass.getDriver()).getScreenshotAs(OutputType.FILE);
		String path =  System.getProperty("user.dir")+"/Screenshot/image.png";
//		FileUtils.copyFile(source, new File(System.getProperty("user.dir")+"/Screenshot/image.png"));
		FileUtils.copyFile(source, new File(path));
		return path;
	}
	
//	2nd Method fo SC
	public String getSCAsBase64() throws IOException 
	{
		File source = ((TakesScreenshot)BaseClass.getDriver()).getScreenshotAs(OutputType.FILE);
		String path =  System.getProperty("user.dir")+"/Screenshot/image.png";
		FileUtils.copyFile(source, new File(path));
		byte[] imageByte = IOUtils.toByteArray(new FileInputStream(path));
		return Base64.getEncoder().encodeToString(imageByte);
		//This will return a base64 encoded string
//		//*[@text=\"Fan\"]
	}
	
//	3rd Method of SC
	public String getBase64()
	{
		return ((TakesScreenshot)BaseClass.getDriver()).getScreenshotAs(OutputType.BASE64);
	}
	
	
	/* need a call to discuss this
	@Test (priority = 0)
	//new testing code integration of video w.r.t reporting
	public void Click_MORE()
	{
		ExtentReport.createTest("Click on More Button", "This test case will click on More button present on the HOME Screen and will navigate to the MORE Screen page");	
		ExtentReport.test.info("This test case will check the functionality of the MORE button present on the HOME Screen");
		ExtentReport.test.info("Navigating to More Screen");
		p.Home_Screen().clickonMoreBtn();
		ExtentReport.test.pass("Clicked on More Button", MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
	}
	*/

	// This tc will click on Sign Up Button and will return to the Home Page
	// Priority is 0	
	
	@Test (priority=0)
	public void clickingOnSignUpButton()
	{
		System.out.println("Calling clickingOnSignUpButton Function");
		ExtentTest test = extent.createTest("Clicking on SignUp Button Of HomeScreen"); // Create a test node in report
		test.info("This test case will check the functionality of the SIGN UP button present on the HOME Screen");
		p.Home_Screen().clickonSignUpBtn();
		test.pass("Clicking on the SignUp Button", MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
		BaseClass.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		BaseClass.getDriver().navigate().back();
	}
	

	// This tc will perform Swipe Up to getting Login and will return to the Home Page
	// Priority is 1	
	
	//@Test(priority=1)
	public void clickingOnMoreButton() throws IOException
	{

		//		extent.createTest("Clicking on More Button", "This test case will click on More button present on the HOME Screen and will navigate to the MORE Screen page.").assignAuthor("Shaikh Muhammad Umair").assignCategory("Test").assignDevice("Note 9");
		System.out.println("Calling Click on More Function");
		ExtentTest test = extent.createTest("Clicking on More Button Of HomeScreen"); // Create a test node in report
		test.info("This test case will check the functionality of the MORE button present on the HOME Screen");
	
		p.Home_Screen().clickonMoreBtn();
	//	p.MORE_SCreen not working
		
		// Using 1st Method of SC
		//test.pass("Clicking on the More Button", MediaEntityBuilder.createScreenCaptureFromPath(getSC()).build());		
		//Using 2nd Method of SC
		//test.pass("Clicking on the More Button", MediaEntityBuilder.createScreenCaptureFromBase64String(getSCAsBase64()).build());
		
		//Using 3rd Method of SC
		test.pass("Clicking on the More Button", MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
	//	p.Home_Screen().SwipeDownForMoreBtn();
		//TO WORK ON =>create a function which takes test[as of line 127] and return screen shot of the app.
	
	}
	
	
	// This tc will perform Swipe Up to getting Login and will return to the Home Page
	// Priority is 2	
	
	@Test (priority=2)
	public void LoginWithCorrectUserName() throws InterruptedException
	{
		System.out.println("Calling LoginWithCorrectUserName Method");
		ExtentTest test = extent.createTest("Swiping for SignUp"); // Create a test node in report
		test.info("This test case will check the functionality of SignUp on the HOME Screen");
		p.Home_Screen().SwipeUpForLogin();
		p.Login_Screen().Login("AZIZ.SIDDIQUI27" , "11111111");
		test.pass("UserName and Password entered suucessfully", MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
		p.OneTimePassword_Screen().SendOTPKeys();
	}

	
	@AfterTest
	public void TearDowns() 
	{
		System.out.println("Tear Down Calling");
		//driver.quit();
		//driver.removeApp("com.example.Test");
		extent.flush();
		try 
		{
			Desktop.getDesktop().browse(new File("Report.html").toURI());
			//Report For Failed Test Cases.html for failed tc
			//Desktop.getDesktop().browse(new File("Failed_TC_Report.html").toURI());

		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
