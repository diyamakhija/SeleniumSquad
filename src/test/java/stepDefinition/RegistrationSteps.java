package stepDefinition;

import org.junit.Assert;

import constants.UrlConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.RegistrationPF;
import utilities.LoggerLoad;

public class RegistrationSteps {
	
	RegistrationPF registration = new RegistrationPF();
	LoggerLoad loggerLoad = new LoggerLoad();
	
	@Given("The user is on DS Algo Home Page")
	public void the_user_is_on_ds_algo_home_page() {
		LoggerLoad.info("The user is on the DS Algo Home Page");
		registration.pageURL();
		registration.getStartedBtn();
	}
	
	@When("The user clicks the Registration link")
	public void the_user_clicks_the_registration_link() {
	    registration.getregisterBtn();
	}
	
	@Then("The user should be redirected to the Registration page")
	public void the_user_should_be_redirected_to_the_registration_page() {
		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.REGISTER_URL,
				registration.getCurrentUrl());
	}
	
	@Given("The user is on the Registration page")
	public void the_user_is_on_the_registration_page() {
	   registration.pageURL();
	   registration.getStartedBtn();
	   registration.getregisterBtn();
	}
	
	@When("The user registers with {string} and {int}")
	public void the_user_registers_with_and(String SheetName, Integer RowNumber) {
	
	 registration.userNameFld(SheetName,RowNumber);
	 registration.pssWordFld(SheetName,RowNumber);
	 registration.ConpssWordFld(SheetName,RowNumber);
	 registration.getregisterBtn();	
	}

	
	@Then("The user should see {string} at row {int}")
	public void the_user_should_see_at_row(String SheetName,Integer RowNumber ) {
   System.out.println("An expected error occured:" +registration.expectedMessage(SheetName,RowNumber));
		
	}
	
	@When("The user registers with {string} and row {int}")
	public void the_user_registers_with_and_row(String SheetName, Integer RowNumber) {
		registration.userNameFld(SheetName,RowNumber);
		 registration.pssWordFld(SheetName,RowNumber);
		 registration.ConpssWordFld(SheetName,RowNumber);
		 registration.getregisterBtn();	
	}


}


