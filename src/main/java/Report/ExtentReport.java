package Report;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;

public final class ExtentReport {

	
	private ExtentReport()
	{
		
	}

	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static void initReport()
	{
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("Report.html").viewConfigurer().viewOrder().as(new ViewName [] {ViewName.DASHBOARD , ViewName.TEST , ViewName.CATEGORY}).apply();
		extent.attachReporter(spark);
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("Report");
		spark.config().setReportName("Digital App Report");
	}
	
	
	public static void flushReport()
	{
		System.out.println("Flush Report Calling");
		extent.flush();
		try 
		{
			Desktop.getDesktop().browse(new File("Report.html").toURI());

		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
//	public static void createTest(String tc_name, String tc_description , String author , String test_category , String Device)
//	{
//		test=extent.createTest(tc_name, tc_description).assignAuthor(author).assignCategory(test_category).assignDevice(Device);
//	}
	
	public static ExtentReports getExtentReportDriver()
	{
		return extent;
	}
	
	
	public static ExtentTest getExtentTestDriver()
	{
		return test;
	}
	
	
	public static void createTest(String tc_name, String tc_description)
	{
		test=extent.createTest(tc_name, tc_description);
	}
	
}
