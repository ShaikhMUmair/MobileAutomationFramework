package Tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import Pages.Pages;
import General.BaseClass;

public class OneTimePassword {

	Pages p = new Pages();

	
	@Test(priority=3)
	public void TestCase1()
	{
	
//		p.PreReq_Screen().clickOnNext();
		p.Home_Screen().SwipeUpForLogin();
		p.Login_Screen().Login("AZIZ.SIDDIQUI27" , "11111111");
		p.OneTimePassword_Screen().SendOTPKeys();
		p.OneTimePassword_Screen().DisableAccessToPhotos();
		p.OneTimePassword_Screen().DisableFingerPrint();
//		p.OneTimePassword_Screen().t2();
	}
	
	
	//for running the above tc, updating the desiredCapabilities of appPackage and appActivity 
	// SELECT DISTINCT(Salary) FROM table_name ORDER BY Salary DESC LIMIT (n-1),1

	//SELECT DISTINCT(Salary) FROM Employee ORDER BY Salary DESC LIMIT (n-1),1
}
