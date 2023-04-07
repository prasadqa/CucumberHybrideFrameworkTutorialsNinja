package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchResultPage;

public class Search {
	
	WebDriver driver;
	private HomePage homePage;
	private SearchResultPage searchResultPage;
	
	@Given("User open the application")
	public void user_open_the_application() {
		
		driver = DriverFactory.getDriver();
		homePage = new HomePage(driver);
	    
	}

	@When("User enter {string} valid product")
	public void user_enter_valid_product(String product) {
	    
		homePage.enterItemIntoSearchBox(product);
		
	}

	@When("Click on search button")
	public void click_on_search_button() {
		
		searchResultPage = homePage.clickOnSearchIcon();
	    
	}

	@Then("User should get valid product results")
	public void user_should_get_valid_product_results() {
		
		
		Assert.assertTrue(searchResultPage.isResultDisplayed());
		
	}

	@Then("User should get message no product matching")
	public void user_should_get_message_no_product_matching() {
		
		Assert.assertTrue(searchResultPage.isNoresultWarningMsg());

	}

	@When("User enter dont enter anything")
	public void user_enter_dont_enter_anything() {
	 
		homePage.enterItemIntoSearchBox("");
		
	}

	@Then("User should get warring message")
	public void user_should_get_warring_message() {
		
		Assert.assertTrue(searchResultPage.isNoresultWarningMsg());
	    
	}

}
