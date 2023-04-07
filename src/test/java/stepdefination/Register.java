package stepdefination;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegisterPage;
import utils.CommonUtils;


public class Register {
	
	WebDriver driver;
 	private RegisterPage registerPage ;
	private HomePage homePage;
	
	@Given("User has navigate to register page")
	public void user_has_navigate_to_register_page() {
		
		driver = DriverFactory.getDriver();
//		registerPage = new RegisterPage(driver);
		homePage = new HomePage(driver);
		homePage.clickOnMyaccount();
		registerPage = homePage.clickOnRegister();
		
	}

	@When("User enter below details into feilds")
	public void user_enter_below_details_into_feilds(DataTable dataTable) {
	    
		Map<String,String> dataMap = dataTable.asMap(String.class,String.class);
		
		registerPage.enterFirstName(dataMap.get("FirstName"));
		registerPage.enterLastName(dataMap.get("LastName"));
		registerPage.enterEmail(CommonUtils.uniqEmail());
		registerPage.enterPhoneNumber(dataMap.get("phoneNumber"));
		registerPage.enterPassword(dataMap.get("password"));
		registerPage.enterConfirmPassword(dataMap.get("confirmPassword"));
		
	}
	
	@When("User enter below registered details into feilds")
	public void User_enter_below_registered_details_into_feilds(DataTable dataTable) {
	
		Map<String,String> dataMap = dataTable.asMap(String.class,String.class);
		
		registerPage.enterFirstName(dataMap.get("FirstName"));
		registerPage.enterLastName(dataMap.get("LastName"));
		registerPage.enterEmail(dataMap.get("Email"));
		registerPage.enterPhoneNumber(dataMap.get("phoneNumber"));
		registerPage.enterPassword(dataMap.get("password"));
		registerPage.enterConfirmPassword(dataMap.get("confirmPassword"));
		
	}

	@When("Select privacy policy")
	public void select_privacy_policy() {
	    
		registerPage.clickOnPrivacyPolicyCheckBox();
		
	}

	@When("Click on continue button")
	public void click_on_continue_button() {
		
		registerPage.clickOnContinueButton();
	    
	}

	@Then("User account should get create")
	public void user_account_should_get_create() {
	    
		Assert.assertTrue(registerPage.isCreatedMsgDisplayed());
		
	}

	@When("Select news later yes")
	public void select_news_later_yes() {
		
		
		registerPage.clickOnNewLaterYes();
		
		
	}

	@Then("User should get warning message")
	public void user_should_get_warning_message() {
		
		Assert.assertTrue(registerPage.isDuplicateEmailWarningMsgDisplayed());
	    
	}
	
	@Then("User should get all madatory feilds warning message")
	public void User_should_get_all_madatory_feilds_warning_message() {
		
		Assert.assertTrue(registerPage.isFirstNameWarningMsgDisplayed());
		Assert.assertTrue(registerPage.isLastNameWarningMsgDisplayed());
		Assert.assertTrue(registerPage.isEmailWarningMsgDisplayed());
		Assert.assertTrue(registerPage.isPhoneNumberWarningMsgDisplayed());
		Assert.assertTrue(registerPage.isPasswordWarningMsgDisplayed());
		
		
	}

}
