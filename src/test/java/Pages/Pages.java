package Pages;

import General.BaseClass;

public class Pages{

	/*	Objects creation of pages
	 * 	1) Login
	 * 	2) Dash board
	 * 	3) Check out
	 */

	
	Home_Screen home_screen = new Home_Screen();	
	public Home_Screen Home_Screen() 
	{
		return home_screen;
	}
	
	
	Login_Screen login_screen = new Login_Screen();	
	public Login_Screen Login_Screen() 
	{
		return login_screen;
	}

	OneTimePassword_Screen Otp_screen = new OneTimePassword_Screen();
	public OneTimePassword_Screen OneTimePassword_Screen()
	{
		return Otp_screen;
	}
	
	More_Screen more_screen = new More_Screen();
	public More_Screen More_Screen()
	{
		return more_screen;
	}
	 
	PreReq_Screen prereq_screen = new PreReq_Screen();
	public PreReq_Screen PreReq_Screen()
	{
		return prereq_screen;
	}
	
}
