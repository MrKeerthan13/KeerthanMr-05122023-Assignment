package testcase;

import org.testng.annotations.Test;

import base.baseloaddoc;

public class Login_demo extends baseloaddoc {
	//WebDriver driver;

	private LoginPage loginpage;
	@Test
	public void demoLogin() {

		loginpage = new LoginPage(driver);
		loginpage.ClickMyAccountButton();
		loginpage.ClickMyAccountLoginButton();
		loginpage.SendkeysMyAccountEmailTf();
		loginpage.SendkeysMyAccountPwdTf();
		loginpage.ClickMyAccountLogin();
		loginpage.AssertMyAccount();
	}
}
	
