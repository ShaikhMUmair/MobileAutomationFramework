package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import General.BaseClass;
import Tests.OneTimePassword;

public class Login_Screen{

	WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(),120);

	/*		LOCATORS
			// Username = app.com.brd.ui.v3:id/username_input
			// Password = app.com.brd.ui.v3:id/password_input
			// ShowPassBTN = app.com.brd.ui.v3:id/text_input_end_icon
			// app.com.brd.ui.v3:id/forgot_credentials
			// app.com.brd.ui.v3:id/login_button
		
			ForgotPassword Page locators
		
			Recover Username = app.com.brd.ui.v3:id/recover_username 
			Reset Password = app.com.brd.ui.v3:id/reset_password
			back = app.com.brd.ui.v3:id/arrow_back
	 */

	By Username = By.id("app.com.brd.ui.v3:id/username_input");
	By Password = By.id("app.com.brd.ui.v3:id/password_input");
	By ShowPassword = By.id("app.com.brd.ui.v3:id/text_input_end_icon");
	By HidePassword = By.id("app.com.brd.ui.v3:id/text_input_end_icon");
	By ForgotPassword = By.id("app.com.brd.ui.v3:id/forgot_credentials");
	By SignIn_Btn = By.id("app.com.brd.ui.v3:id/login_button");
	By Alert_Ok_Btn = By.id("app.com.brd.ui.v3:id/btn_ok");
	By Alert_Close_Btn = By.id("app.com.brd.ui.v3:id/btn_close");
	By Back_Btn = By.id("app.com.brd.ui.v3:id/imageButton4");
	By Alert_title = By.id("app.com.brd.ui.v3:id/tv_title");
	By Alert_message = By.id("app.com.brd.ui.v3:id/tv_msg");
	By Greeting = By.id("app.com.brd.ui.v3:id/greeting_text");
	// text get kro ga is id ka and verify krwao ga that should be Good Afternoon!
	
	By Show_Hide_Balance = By.id("app.com.brd.ui.v3:id/show_hide_balance");
	// text get kro ga is id ka and verify krwao ga that should be Show Balance!	
	
	String expected, actual , actual1 , expected1, actual2;
	String tc_scenario , checking_condition;

//	String tc_scenario = checking what scenario to check , checking_condition=what we are actually testing more over what have been asserted/verifiied;
	
	
	By OTP_header = By.xpath("//*[@text=\"Validate OTP\"]");
	
	
	
	
	SoftAssert s_Assert = new SoftAssert();
	
	public void Login(String username , String password) 
	{
		System.out.println("Login Function Called");
		System.out.println("Sending Username");	
		wait.until(ExpectedConditions.visibilityOfElementLocated(Username));
		BaseClass.getDriver().findElement(Username).sendKeys(username);
		System.out.println("Username Send");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(Password));
		System.out.println("Sending Password");	
		BaseClass.getDriver().findElement(Password).sendKeys(password);
		System.out.println("Password Send");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(SignIn_Btn));
		System.out.println("Sending Enter Key");	
		BaseClass.getDriver().findElement(SignIn_Btn).click();
		System.out.println("Enter Key is Send");
	
//		// In case of Server Down
//		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_title));
//		expected = "This service is currently not available, kindly try again later or call customer care at 021-111825888";
//		actual = BaseClass.getDriver().findElement(Alert_message).getText();
//		System.out.println("getText values is : "+actual);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_Close_Btn));
		
		//Validating OTP Screen Navigation
		wait.until(ExpectedConditions.visibilityOfElementLocated(OTP_header));
		expected1 = "Validate OTP";
		actual1 = BaseClass.getDriver().findElement(OTP_header).getText();
		System.out.println("getText values is : "+OTP_header);
		
		tc_scenario = "Validating OTP Header";
		checking_condition = "The user is able to navigate to Validate OTP Page successfully";
		BaseClass.AssertUmair(expected1, actual1, tc_scenario, checking_condition);		

		
		
		
		//		if (expected1.equals(actual1)) 
//		{
//			System.out.println("Executing 2nd if Condition");
//			BaseClass.getDriver().manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
//			System.out.println("Applied wait for 2 min");
//			s_Assert.assertEquals(actual1, expected1);
//			System.out.println("The user is able to navigate to Validate OTP Page successfully");			
//		}

		
		//else ko comment kr rhy for now, check ya krna hai ka else wala part ki calling kaysa hogi
		//is sa phla if main condition thi agar wo execute hoga to else pr jaya ga nh kbhe and agr if fail hoga to hi wo else main jaye ga and phr
		// alert wala po up ko search kra ga
		// [[[[[[[[[[[[[[[[[[[BUT check ya krna hai ka jb server down ho to kya ya waqai sahe chal rha hai ya nh?]]]]]]]]]]]]]]]]] MUST CHECK
		
		
//		for the time being commenting if and else statement to check newly created function!!!		
//		else 
//
//		{
//			// ELSE In case of Server Down
//			wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_title));
//			expected = "This service is currently not available, kindly try again later or call customer care at 021-111825888";
//			actual = BaseClass.getDriver().findElement(Alert_message).getText();
//			System.out.println("getText values is : "+actual);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_Close_Btn));
//
//			System.out.println("Executing Else Condition");
//			
//			BaseClass.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
//			s_Assert.assertEquals(expected, actual, "The Application isn't working. Unable to perform LOGIN");
//			wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_Close_Btn));
//			BaseClass.getDriver().findElement(Alert_Close_Btn).click();
//			System.out.println("Id of Alert_Close_Btn is : "+Alert_Close_Btn);
//			BaseClass.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
//			s_Assert.fail("The test case is failed as User is unable to Login in the application.An error message is displayed saying :"+actual);
//			s_Assert.assertAll();
//		}
//		
		
		
//		p.OneTimePassword_Screen().SendOTPKeys();
		
//		System.out.println("Clicking on Back Button ");	
//		wait.until(ExpectedConditions.visibilityOfElementLocated(Back_Btn));
//		BaseClass.getDriver().findElement(Back_Btn).click();
		
//		BaseClass.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	}

}
