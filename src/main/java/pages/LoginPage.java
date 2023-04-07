package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class LoginPage {
	
	WebDriver driver;
	private ElementUtils elementUtils;
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);
	}
	
	@FindBy(id="input-email")
	private WebElement emailText;
	
	@FindBy(id="input-password")
	private WebElement passwordText;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement warningMsg;
	
	public void enterEmailText(String email)
	{
		
		elementUtils.typeTextIntoElement(emailText, email, CommonUtils.IMPLICIT_WAIT);
		
	}
	
	public void enterPasswordText(String password) {
		
		elementUtils.typeTextIntoElement(passwordText, password, CommonUtils.IMPLICIT_WAIT);
		
	}
	
	public AccountPage clickOnLoginButton() {
		
		elementUtils.clickOnElement(loginButton, CommonUtils.IMPLICIT_WAIT);
		return new AccountPage(driver);
		
	}
	
	public boolean isWarningMsgDisplayed() {
		
		return elementUtils.isElementDisplayed(warningMsg, CommonUtils.IMPLICIT_WAIT);
		
		
	}
}
