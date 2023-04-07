package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class SearchResultPage {
	
	WebDriver driver;
	private ElementUtils elementUtils;
	
	public SearchResultPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);
	}
	
	@FindBy(linkText = "HP LP3065")
	private WebElement resultOfItem;
	
	@FindBy(xpath = "//div[@id='content']//p[2]")
	private WebElement noResultWarningMsg;
	
	public boolean isResultDisplayed() {
	
		return elementUtils.isElementDisplayed(resultOfItem, CommonUtils.IMPLICIT_WAIT);
		
	}
	
	public boolean isNoresultWarningMsg() {
		
		return elementUtils.isElementDisplayed(noResultWarningMsg, CommonUtils.IMPLICIT_WAIT);
		
	}

}
