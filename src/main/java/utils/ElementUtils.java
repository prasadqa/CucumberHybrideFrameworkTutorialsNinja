package utils;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {
	
	WebDriver driver;
	
	public ElementUtils(WebDriver driver) {
	
		this.driver = driver;
		
	}
	
	public void clickOnElement(WebElement element, int durationInSeconds) {
		
	
		WebElement webElemt = waitForElement(element,durationInSeconds);
		webElemt.click();
		
	}
	
	public void typeTextIntoElement(WebElement element,String text,int durationInSeconds) {
		
		WebElement webElement = waitForElement(element,durationInSeconds);
		webElement.click();
		webElement.clear();
		webElement.sendKeys(text);
		
	}
	
	public WebElement waitForElement(WebElement element,int durationInSeconds) {
		
		
		WebElement webElement = null;
		try{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationInSeconds));
		webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return webElement;
	}
	
	public void selectDropDown(WebElement element,String dropDownOption ,int durationOfseconds) {
		
		WebElement Webelement = waitForElement(element, durationOfseconds);
		Select select = new Select(Webelement);
		select.selectByVisibleText(dropDownOption);
				
		
	}
	
	public void acceptAlert(int durationOfSeconds) {
		
		Alert alert = waitForAlert(durationOfSeconds);
		alert.accept();
	
	}
	public void dismissAlert(int durationOfSeconds) {
		Alert alert = waitForAlert(durationOfSeconds);
		alert.dismiss();
	}
	public Alert waitForAlert(int durationOFSeconds) {
		Alert alert = null;
		
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationOFSeconds));
		alert = wait.until(ExpectedConditions.alertIsPresent());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return alert;
	}
	
	public void mouseOverClick(WebElement element , int durationOfSeconds) {
		
		
		WebElement webElement = waitForvisibuilityElement(element,durationOfSeconds);
		Actions actions = new  Actions(driver);
		actions.moveToElement(webElement).click().build().perform();
		
		
	}
	public WebElement waitForvisibuilityElement(WebElement element,int durationOfSeconds) {
		
		WebElement webElement = null;
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationOfSeconds));
		webElement = wait.until(ExpectedConditions.visibilityOf(element));
		}catch(Throwable e) {
			e.printStackTrace();
		}
		return webElement;
		
		
	}
	
	public void javaScriptClick(WebElement element,int durationOfseconds) {
		
		WebElement webElement = waitForvisibuilityElement(element,durationOfseconds);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", webElement);
		
		
	}
	
	public void javaScriptType(WebElement element,String text,int durationOfSeconds) {
		
		WebElement webElement = waitForvisibuilityElement(element,durationOfSeconds);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='"+text+"'", webElement);
		
		
		
	}
	public boolean isElementDisplayed(WebElement element, int durationOfSeconds) {
		
		WebElement webElemnet = waitForElement(element, durationOfSeconds);
		return webElemnet.isDisplayed();
		
	}
	
	

	
	

}
