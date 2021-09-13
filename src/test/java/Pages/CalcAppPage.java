package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalcAppPage {

	//Implement Factory Pattern
	
	public CalcAppPage(AppiumDriver<WebElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"LOGIN\"]")
	public WebElement login_button;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"REGISTRATION\"]")
	public WebElement Registration_button;
	
	
	public void clickonLoginBtn() {
		login_button.click();
	}
	
	public void clickonRegistrationBtn() {
		Registration_button.click();
	}
	
	
}
