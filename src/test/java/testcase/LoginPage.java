package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountButton;
	@FindBy(xpath = "/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a")
	private WebElement myAccountLoginButton;
	@FindBy (id = "input-email")
	private WebElement myAccountEmailTf;
	@FindBy (id = "input-password")
	private WebElement myAccountPwdTf;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div/form/input")
	private WebElement myAccountLogin;
	@FindBy (xpath = "//h2[text()='My Account']")
	private WebElement myAccountTxt;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void ClickMyAccountButton() {
		myAccountButton.click();
	}
	public void ClickMyAccountLoginButton() {
		myAccountLoginButton.click();
	}
	public void SendkeysMyAccountEmailTf() {
		myAccountEmailTf.sendKeys("testing@yopmail.com");
	}
	public void SendkeysMyAccountPwdTf() {
		myAccountPwdTf.sendKeys("Test@123");
	}
	public void ClickMyAccountLogin() {
		myAccountLogin.click();
	}
	public void AssertMyAccount() {
		Assert.assertTrue((myAccountTxt).isDisplayed());
		String logintxt = myAccountTxt.getText();
		System.out.println(logintxt + "  ------ The User Account is Loggedin Successfully");
	}
}
