package Pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import General.BaseClass;

public class More_Screen {

	
	//app.com.brd.ui.v3:id/more
	
	By QRPay = By.id("app.com.brd.ui.v3:id/qr_pay");
	By Allow_Btn = By.id("id/permission_allow_button");
	By Deny_Btn = By.id("com.android.permissioncontroller:id/permission_deny_button");
	
	By ActivateCard = By.id("app.com.brd.ui.v3:id/lbl_activate_card_my_qr");
	By Last4Digits = By.id("app.com.brd.ui.v3:id/last_four");
	
	String actual;
	String expected;
	
	
	public void AssertQRPay()
	{
		actual= "QR Pay";
		BaseClass.getDriver().findElement(QRPay).getText();
		expected = BaseClass.getDriver().findElement(QRPay).getText();
		System.out.println("Value get is : "+expected);
	}
	
//	   	//More
//	   	1) QR PAY
//	   	//app.com.brd.ui.v3:id/qr_pay
//	   	
//
//	   	4.1) Allow_Btn 
//	   	com.android.permissioncontroller:id/permission_allow_button
//	   
//	   	4.2) Deny_Btn
//	   	com.android.permissioncontroller:id/permission_deny_button
//	   
//	   	4.3) DenyAndDontAskAgain_Btn
//	   	com.android.permissioncontroller:id/permission_deny_and_dont_ask_again_button
//	   
//	   
//	   	2) Activate Card
//	   	app.com.brd.ui.v3:id/lbl_activate_card_my_qr
//	   
//	   	2.1) Last 4 Digits
//	   	app.com.brd.ui.v3:id/last_four
//	   
//	   	2.2) Expiry
//	   	app.com.brd.ui.v3:id/expiry	
//	   	
//	   	2.3) Proceed
//	   	app.com.brd.ui.v3:id/component_continue	
//	   
//	   	2.3 ->  2.3.1) Contact Verification Screen 
//	   		 		Mobile Number
//	   				app.com.brd.ui.v3:id/mobile_number
//	   				
//	   				CNIC
//	   				app.com.brd.ui.v3:id/nic
//	   
//	   				Next_Btn
//	   				app.com.brd.ui.v3:id/component_continue
//	   
//	   	3) Aas Pass
//	   	app.com.brd.ui.v3:id/ass_pass
//	   
//	   	4) Locate Us
//	   	app.com.brd.ui.v3:id/locate_us	
//	   	
//	   	4.1) Allow_Btn 
//	   	com.android.permissioncontroller:id/permission_allow_button
//	   
//	   	4.2) Deny_Btn
//	   	com.android.permissioncontroller:id/permission_deny_button  
	   
}