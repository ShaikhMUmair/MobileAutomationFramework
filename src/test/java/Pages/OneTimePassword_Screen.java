package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import General.BaseClass;

public class OneTimePassword_Screen {
	
	WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(),120);

	/*
	 *  Xpath for One Time Password Screen
	 */

	int i;
	String s =  "app.com.brd.ui.v3:id/e";
	By Allow_Btn = By.id("com.android.permissioncontroller:id/permission_allow_button");
	By Deny_Btn = By.id("com.android.permissioncontroller:id/permission_deny_button");
	By Enable_FingerPrint = By.id("app.com.brd.ui.v3:id/btn_enable");
	By Close_Btn = By.id("app.com.brd.ui.v3:id/btn_close");
	By OTP_header = By.id("");
	
	By Permission_Msg = By.id("com.android.permissioncontroller:id/permission_message");
	
//	By OPT_1 = By.id("app.com.brd.ui.v3:id/e1");
//	By OPT_2 = By.id("app.com.brd.ui.v3:id/e2");
//	By OPT_3 = By.id("app.com.brd.ui.v3:id/e3");
//	By OPT_4 = By.id("app.com.brd.ui.v3:id/e4");
//	By OPT_5 = By.id("app.com.brd.ui.v3:id/e5");	
//	By OPT_6 = By.id("app.com.brd.ui.v3:id/e6");	

	
//	login - > deny/allow -> FingerPrint Close
	
	/*
	 *  Functions for One Time Password Screen
	 */

	public void SendOTPKeys()
	{
		System.out.println("Printing values and sending values to OTP");

		for (int i=1; i<7 ; i++)
		{
			By str = By.id(s+i);
			wait.until(ExpectedConditions.visibilityOfElementLocated(str));
			System.out.println("At Index [" + i + "] Value is : "+str);
			BaseClass.getDriver().findElement(str).click();
			BaseClass.getDriver().getKeyboard().sendKeys("1"); // android key event code for letter 'a', look up key code at 
		}

		BaseClass.getDriver().manage().timeouts().implicitlyWait(2 , TimeUnit.MINUTES);
	}
	
	public void EnableAccessToPhotos()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(Allow_Btn));
		BaseClass.getDriver().findElement(Allow_Btn).click();
		System.out.println("Allowed access to Photos successfully");
	}

	public void DisableAccessToPhotos()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(Deny_Btn));
		BaseClass.getDriver().findElement(Deny_Btn).click();
		System.out.println("Access Denied to Photos successfully");
	}

	public void DisableFingerPrint()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(Close_Btn));
		BaseClass.getDriver().findElement(Close_Btn).click();
		System.out.println("Finger Print Disabled successfully");
	}
	
//	public void ImpFunc()
//	{
////		Another way to send values but not working since we need to send values via MOBILE KEYBOARD.		
//		System.out.println("Printing values of OTP :"+s+i);
//		By str = By.id(s+i);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(str));
//		BaseClass.getDriver().findElement(By.id(s+i)).sendKeys("1");
//		BaseClass.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
//		// 8 is equal to 1
//		// BaseClass.getDriver().getKeyboard().sendKeys("1");
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(OPT_1));
//		System.out.println("in test function for sending last key via Keybaord");		 
//		System.out.println("Value for "+OPT_1);
//		BaseClass.getDriver().findElement(OPT_1).click();
//		BaseClass.getDriver().getKeyboard().sendKeys("1"); // android key event code for letter 'a', look up key code at 
//		
//		System.out.println("in test function for sending last key via Keybaord");		 
//		System.out.println("Value for "+OPT_2);
//		BaseClass.getDriver().findElement(OPT_2).click();
//		BaseClass.getDriver().getKeyboard().sendKeys("1"); // android key event code for letter 'a', look up key code at 
//
//		System.out.println("in test function for sending last key via Keybaord");		 
//		System.out.println("Value for "+OPT_3);
//		BaseClass.getDriver().findElement(OPT_3).click();
//		BaseClass.getDriver().getKeyboard().sendKeys("1"); // android key event code for letter 'a', look up key code at 
//
//		System.out.println("in test function for sending last key via Keybaord");		 
//		System.out.println("Value for "+OPT_4);
//		BaseClass.getDriver().findElement(OPT_4).click();
//		BaseClass.getDriver().getKeyboard().sendKeys("1"); // android key event code for letter 'a', look up key code at 
//
//		System.out.println("in test function for sending last key via Keybaord");		 
//		System.out.println("Value for "+OPT_5);
//		BaseClass.getDriver().findElement(OPT_5).click();
//		BaseClass.getDriver().getKeyboard().sendKeys("1"); // android key event code for letter 'a', look up key code at 
//
//		System.out.println("in test function for sending last key via Keybaord");		 
//		System.out.println("Value for "+OPT_6);
//		BaseClass.getDriver().findElement(OPT_6).click();
//		BaseClass.getDriver().getKeyboard().sendKeys("1"); // android key event code for letter 'a', look up key code at 
//
//		BaseClass.getDriver().manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS);
//		//BaseClass.getDriver().hideKeyboard();
//	}
//	

}
