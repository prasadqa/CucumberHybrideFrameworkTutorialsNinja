package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;


public class RegisterPage {
	
	WebDriver driver;
	private ElementUtils elementUtils;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);
	}
	
	@FindBy(id = "input-firstname")
	private WebElement firstName;
	

	@FindBy(id = "input-lastname")
	private WebElement lastName;
	

	@FindBy(id = "input-email")
	private WebElement emai;
	
	@FindBy(id="input-telephone")
	private WebElement phoneNumber;

	@FindBy(id = "input-password")
	private WebElement passwprd;
	
	@FindBy(id="input-confirm")
	private WebElement confirmPassword;
	
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement privacyPolicy;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//div[@id='content']//h1/following-sibling::p[1]")
	private WebElement createdMsg;
	
	@FindBy (xpath = "//input[@name='newsletter'][@value = '1']")
	private WebElement newLaterYes;
	
	@FindBy (xpath = "//div[contains(@class,'alert-dismissible')]")
	private WebElement duplicateEmailWarningMsg;
	
	@FindBy(xpath = "//input[@id='input-firstname']/following-sibling::div")
	private WebElement firstNameWarningMsg;
	
	@FindBy(xpath = "//input[@id='input-lastname']/following-sibling::div")
	private WebElement lastnameWarningMsg;
	
	@FindBy(xpath = "//input[@id='input-email']/following-sibling::div")
	private WebElement emailWarningMsg;
	
	@FindBy(xpath = "//input[@id='input-telephone']/following-sibling::div")
	private WebElement telephoneWarningMsg;
	
	@FindBy(xpath = "//input[@id='input-password']/following-sibling::div")
	private WebElement passwordWarningMsg;
	
	
	
	public void enterFirstName(String fName) {
		
		elementUtils.typeTextIntoElement(firstName, fName, CommonUtils.IMPLICIT_WAIT);
		
	}
	
	public void enterLastName(String lName) {
		
		elementUtils.typeTextIntoElement(lastName, lName, CommonUtils.IMPLICIT_WAIT);
		
	}

	public void enterEmail(String email) {
	
		elementUtils.typeTextIntoElement(emai, email, CommonUtils.IMPLICIT_WAIT);
	
	}
	
	public void enterPhoneNumber(String number) {
		
		elementUtils.typeTextIntoElement(phoneNumber, number, CommonUtils.IMPLICIT_WAIT);
		
	}
	
	public void enterPassword(String password) {
	
		elementUtils.typeTextIntoElement(passwprd, password, CommonUtils.IMPLICIT_WAIT);
		passwprd.sendKeys(password);
	
	}
	
	public void enterConfirmPassword(String confirmpword) {
		
		elementUtils.typeTextIntoElement(confirmPassword, confirmpword, CommonUtils.IMPLICIT_WAIT);
		
	}
	
	public void clickOnPrivacyPolicyCheckBox() {
		
		elementUtils.clickOnElement(privacyPolicy, CommonUtils.IMPLICIT_WAIT);
		
	}
	public void clickOnContinueButton() {
		
		elementUtils.clickOnElement(continueButton, CommonUtils.IMPLICIT_WAIT);
		
	}
	
	public boolean isCreatedMsgDisplayed() {
		
		return elementUtils.isElementDisplayed(createdMsg, CommonUtils.IMPLICIT_WAIT);
		
	}
	
	public void clickOnNewLaterYes() {
		
		elementUtils.clickOnElement(newLaterYes, CommonUtils.IMPLICIT_WAIT);
		
	}
	public boolean isDuplicateEmailWarningMsgDisplayed() {
		
		return elementUtils.isElementDisplayed(duplicateEmailWarningMsg, CommonUtils.IMPLICIT_WAIT);
		
	}
	public boolean isFirstNameWarningMsgDisplayed() {
		
		return elementUtils.isElementDisplayed(firstNameWarningMsg, CommonUtils.IMPLICIT_WAIT);
		
	}
	public boolean isLastNameWarningMsgDisplayed() {
		
		return elementUtils.isElementDisplayed(lastnameWarningMsg, CommonUtils.IMPLICIT_WAIT);
		
		
	}
	public boolean isEmailWarningMsgDisplayed() {
		
		return elementUtils.isElementDisplayed(emailWarningMsg, CommonUtils.IMPLICIT_WAIT);
		
		
	}
	public boolean isPhoneNumberWarningMsgDisplayed() {
		
		return elementUtils.isElementDisplayed(telephoneWarningMsg, CommonUtils.IMPLICIT_WAIT);
		
	}
	public boolean isPasswordWarningMsgDisplayed() {
	
		return elementUtils.isElementDisplayed(passwordWarningMsg, CommonUtils.IMPLICIT_WAIT);
	
}
	
	
	

}
