package Pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import General.BaseClass;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Screen{
	
	WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(),180);
	
	/*
	 *  Xpath's for Home Screen 
	 */
	
	By SignUp_Btn = By.id("app.com.brd.ui.v3:id/sign_up");
	By Login_Btn= By.id("app.com.brd.ui.v3:id/ib_arrow_up");
	By More_Btn = By.id("app.com.brd.ui.v3:id/more");
	By QRPay = By.id("app.com.brd.ui.v3:id/qr_pay");
	By More_Slider = By.id("");
	String actual;
	String expected;

	// [486,1783][595,1793]

	/*
	 *  Function Calling for Home Screen 
	 */	
	
	public void Assert_More()
	{
		actual= "QR Pay";
		BaseClass.getDriver().findElement(QRPay).getText();
		//expected = BaseClass.getDriver().findElement(QRPay).getText();
		
		System.out.println("Value get is : "+expected);
	}

	public static void swipe(int fromX,int fromY,int toX,int toY) throws Exception 
	{ 
		
			 System.out.println("Calling Swipe Method with values of axis");
			 System.out.println("Values Received are fromX: " +fromX+ " fromY : " +fromY+ " toX : " +toX+ " toY : " +toY);

//			 TouchAction action = new TouchAction(BaseClass.getDriver());
//			 
//			 action.press(PointOption.point(fromX,fromY))
//			 .waitAction(new WaitOptions().withDuration(Duration.ofMillis(30000))) //you can change wait durations as per your requirement
//			 .moveTo(PointOption.point(toX, toY))
//			 .release()
//			 .perform();
			 
			 TouchAction action = new TouchAction(BaseClass.getDriver());
			 
			 Thread.sleep(3000);
			 
			 //new TouchAction((PerformsTouchActions)BaseClass.getDriver())
			 action.press(PointOption.point(fromX, fromY))
			 .waitAction(new WaitOptions().withDuration(Duration.ofMillis(3000)))
			 .moveTo(PointOption.point(toX, toY))
			 .release()
			 .perform();
	}
		
	public void SwipeUpForLogin() 
	{
		  try 
		  {
			System.out.println("Calling SwipeUpForLogin Method");
			
//			138 , 2010
			 int x = 256;
			 int y = 1994;
			 int y1 = 548;

				//526, 1994 , 526 , 548	

			 Thread.sleep(10000);
			 
			 System.out.println("Values are : "+x+" y : "+y+" y1 : "+y1);
			 swipe(x, y, x, y1);
			 System.out.println("Swipe Performed Successfully");
		 }
		  
		 catch(Exception e) 
		 {	 
		  System.out.println("SWIPE NOT WORKING");
		  System.out.println(e.getMessage());
		 }
	}
	
	public void clickonSignUpBtn() 
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(SignUp_Btn));
		BaseClass.getDriver().findElement(SignUp_Btn).click();
	}
	
	public void clickonMoreBtn()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(More_Btn));
		BaseClass.getDriver().findElement(More_Btn).click();
		//Assert_More();
//		Assert.assertEquals(actual);

		// can we call AssertQRPay() method from More_Screen class here?
	}

	public void testSwipe()
	{
		  try 
		  {
			  
			wait.until(ExpectedConditions.visibilityOfElementLocated(Login_Btn));
			System.out.println(Login_Btn);
			System.out.println("Calling SwipeUpForLogin Method");
			
			 int x = 532;
			 int y = 1988;
			 int y1 = 529;
			 
			 System.out.println("Values are : "+x+" y : "+y+" y1 : "+y1);

			 TouchAction action = new TouchAction(BaseClass.getDriver());
			 
			 //new TouchAction((PerformsTouchActions)BaseClass.getDriver())
			 action.press(PointOption.point(x, y))
			 .waitAction(new WaitOptions().withDuration(Duration.ofMinutes(2)))
			 .moveTo(PointOption.point(x, y1))
			 .release()
			 .perform();
 
			 
			 System.out.println("Swipe Performed Successfully");
		 } 
		  
		 catch(Exception e) 
		 {	 
		  System.out.println("SWIPE NOT WORKING");
		  System.out.println(e.getMessage());
		 }
	
	}	

//	138 , 2010
	
	//======================================================================================//
	//As you said, it is the same format… You just exchange height for width
	
	
//	public static void swipeVertical(double startPercentage, double finalPercentage, double anchorPercentage, double duration) throws Exception {
//	    Dimension size = BaseClass.getDriver().manage().window().getSize();
//	    int anchor = (int) (size.width * anchorPercentage);
//	    int startPoint = (int) (size.width * startPercentage);
//	    int endPoint = (int) (size.width * finalPercentage);
//	    new TouchAction(BaseClass.getDriver()).press(anchor, startPoint).waitAction(duration).moveTo(anchor, endPoint).release().perform();
//
//	    //In documentation they mention moveTo coordinates are relative to initial ones, but thats not happening. When it does we need to use the function below
//	    //new TouchAction(driver).press(anchor, startPoint).waitAction(duration).moveTo(0,endPoint-startPoint).release().perform();
//	}

	
//	public void s1()
//	{
//		Dimension size=BaseClass.getDriver().manage().window().getSize();
//		System.out.println("Dimensions are : "+size);
//		int startx = ;
//		int endy = ;
//		int starty = ;
//	}	
	
}
