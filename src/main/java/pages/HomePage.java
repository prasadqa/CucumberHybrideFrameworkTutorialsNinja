package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class HomePage {
	
	WebDriver driver;
	private ElementUtils elementUtils;
	
	
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement myAccount;
	
	@FindBy(linkText = "Login")
	WebElement loginLink;
	
	@FindBy(linkText = "Register")
	private WebElement register;
	
	@FindBy (xpath="//input[@name='search']")
	private WebElement searchBox;
	
	@FindBy (xpath = "//button[@class='btn btn-default btn-lg']")
	private WebElement searchIcon;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);
		
	}
	
	public void clickOnMyaccount() {
		
		elementUtils.clickOnElement(myAccount, CommonUtils.IMPLICIT_WAIT);
		
	}
	public LoginPage selectLoginOpotion() {
		
		elementUtils.clickOnElement(loginLink, CommonUtils.IMPLICIT_WAIT);
		return new LoginPage(driver);

	}
	public RegisterPage clickOnRegister() {
		
		
		elementUtils.clickOnElement(register, CommonUtils.IMPLICIT_WAIT);
		return new RegisterPage(driver);
		
	}
	public void enterItemIntoSearchBox(String item) {
		
		elementUtils.typeTextIntoElement(searchBox, item, CommonUtils.IMPLICIT_WAIT);
		
	}
	
	public SearchResultPage clickOnSearchIcon() {
		
		
		elementUtils.clickOnElement(searchIcon, CommonUtils.IMPLICIT_WAIT);
		return new SearchResultPage(driver);
		
	}

}
