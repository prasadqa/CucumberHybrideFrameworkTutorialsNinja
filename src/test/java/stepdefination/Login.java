package stepdefination;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;


public class Login {
	
	WebDriver driver;
	
	private LoginPage loginPage;
	private AccountPage accountPage;
	HomePage homePage;
	
	
	
	
	@Given("User navigates to login page")
	public void user_navigates_to_login_page() {
		
		
		driver = DriverFactory.getDriver();
		homePage = new HomePage(driver);
//		loginPage = new LoginPage(driver);
//		accountPage = new AccountPage(driver);
		homePage.clickOnMyaccount();
		loginPage = homePage.selectLoginOpotion();
		
	}

	@When("^User has entered valid email address (.+) into email field$")
	public void user_has_entered_valid_email_address_into_email_field(String string) {
		
		
		loginPage.enterEmailText(string);

	}

	@When("^User has entered valid password (.+) into password field$")
	public void user_has_entered_valid_password_into_password_field(String string) {
	    
		loginPage.enterPasswordText(string);
		
		
	}

	@When("click on login button")
	public void click_on_login_button() {
	    
		accountPage = loginPage.clickOnLoginButton(); 
		 
	}

	@Then("User should get logged in successfully")
	public void user_should_get_logged_in_successfully() {
		
		
	    Assert.assertTrue(accountPage.issuccessMsgDisplayed());
		
	}

	@When("User has entered invalid email address {string} into email field")
	public void user_has_entered_invalid_email_address_into_email_field(String string) {
	    
		loginPage.enterEmailText(string);
		
	}

	@When("User has entered invalid password {string} into password field")
	public void user_has_entered_invalid_password_into_password_field(String string) {
	    
		loginPage.enterPasswordText(string);
		
	}

	@Then("User should get warning massage")
	public void user_should_get_warning_massage() {
		
		Assert.assertTrue(loginPage.isWarningMsgDisplayed());
		
	}
	

}
