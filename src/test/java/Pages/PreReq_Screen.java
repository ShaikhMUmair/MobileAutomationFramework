package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import General.BaseClass;

public class PreReq_Screen {

	WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(),180);

	/*
	 * Intelli Search Screen Locator
	 */ 
		By IntelliSearch_Next = By.id("app.com.brd:id/component_continue");
	
	/*
	 * Widgets Screen Locator
	 */ 
		By Widgets_Next = By.id("app.com.brd:id/component_continue");

	/*
	 * Favourites Screen Locator
	 */ 
		By Favourite_Next = By.id("app.com.brd:id/component_continue");
		By test1 = By.xpath("//*[@text=\"Get Started!\"]");
			
	/*
	 * Term's & Condition
	 */
		By TC_Next = By.className("android.widget.Button");
		By test2 = By.xpath("//*[@text=\"Agree & Continue\"]");
	
		
	/*
	 * Function for All
	 */
	
	public void clickOnNext()
	{
		System.out.println("Clicking on Next Button off Intelli Search Screen");
		wait.until(ExpectedConditions.visibilityOfElementLocated(IntelliSearch_Next));
		System.out.println("Button Value :"+IntelliSearch_Next);
		BaseClass.getDriver().findElement(IntelliSearch_Next).click();
		
		System.out.println("Clicking on Next Button off Widgets Screen");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Widgets_Next));
		System.out.println("Button Value :"+Widgets_Next);
		BaseClass.getDriver().findElement(Widgets_Next).click();

		System.out.println("Clicking on Get Started Button off Favourite Screen");
		wait.until(ExpectedConditions.visibilityOfElementLocated(test1));
		System.out.println("Button Value :"+test1);
		BaseClass.getDriver().findElement(test1).click();
		
		System.out.println("Clicking on Agree & Continue off Terms and Condition Screen");
		wait.until(ExpectedConditions.visibilityOfElementLocated(TC_Next));
		BaseClass.getDriver().findElement(TC_Next).click();
		System.out.println("Button Value :"+TC_Next);
		
	}
	

}
