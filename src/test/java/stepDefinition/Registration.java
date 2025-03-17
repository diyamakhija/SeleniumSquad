package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LoginPagePF;
import pageFactory.RegistrationPF;
import utilities.LoggerLoad;

public class Registration {
	
	RegistrationPF registration = new RegistrationPF();
	LoggerLoad loggerLoad = new LoggerLoad();
	
	@Given("The user is on DS Algo Home Page")
	public void the_user_is_on_ds_algo_home_page() {
		LoggerLoad.info("The user is on the DS Algo Home Page");
		registration.pageURL();
		registration.getStartedBtn();
	}
	
	@When("The user should click the Registration link")
	public void the_user_should_click_the_registration_link() {
	    registration.getregisterBtn();
	}
	
	@Then("The user should be redirected to Registration page")
	public void the_user_should_be_redirected_to_registration_page() {
		Assert.assertEquals("User is not on the Dashboard Page",registration.expectedUrl66(), registration.getCurrentUrl());
	}
	
	@Given("I am on the Registration")
	public void i_am_on_the_registration() {
	   registration.pageURL();
	   registration.getStartedBtn();
	   registration.getregisterBtn();
	}
	
	@When("I Register with {string} and {string}")
	public void i_register_with_and(String string, String string2) {
	
	 registration.userNameFld();
	 registration.pssWordFld();
	 registration.getregisterBtn();	
	}

	
	@Then("I should see  {string}")
	public void i_should_see(String expectedMessage) {
	
		//System.out.println("Actual Message Displayed: " + registration.ActualMessage();
		System.out.println("Actual Message Displayed: " + expectedMessage);
	}
}
	
//
//	@Given("the user is on the user registration page")
//	public void the_user_is_on_the_user_registration_page() {
//	   
//	}
//
//	@When("the user clicks the Register button after entering a Username but leaving other fields empty")
//	public void the_user_clicks_the_register_button_after_entering_a_username_but_leaving_other_fields_empty() {
//	    
//	}
//
//	@Then("an error message {string} should appear below the Password textbox")
//	public void an_error_message_should_appear_below_the_password_textbox(String string) {
//	    
//	}
//
//	@When("the user clicks the Register button after entering Password and Password Confirmation fields empty")
//	public void the_user_clicks_the_register_button_after_entering_password_and_password_confirmation_fields_empty() {
//	   
//	}
//
//	@Then("an error message {string} should appear below the Password Confirmation textbox")
//	public void an_error_message_should_appear_below_the_password_confirmation_textbox(String string) {
//	    
//	}
//
//	@When("the user clicks the Register button after entering a username with spacebar characters or other than digits")
//	public void the_user_clicks_the_register_button_after_entering_a_username_with_spacebar_characters_or_other_than_digits() {
//	    
//	}
//
//	@Then("the user should see an error message for invalid data")
//	public void the_user_should_see_an_error_message_for_invalid_data() {
//	    
//	}
//
//	@When("the user clicks the Register button after entering a password with numeric data")
//	public void the_user_clicks_the_register_button_after_entering_a_password_with_numeric_data() {
//	    
//	}
//
//	@Then("the user should see an error message for entering invalid data")
//	public void the_user_should_see_an_error_message_for_entering_invalid_data() {
//	    
//	}
//
//	@When("the user clicks the Register button after entering different passwords in Password and Password Confirmation fields")
//	public void the_user_clicks_the_register_button_after_entering_different_passwords_in_password_and_password_confirmation_fields() {
//	   
//	}
//
//	@Then("the user should see a password warning message {string}")
//	public void the_user_should_see_a_password_warning_message(String string) {
//	   
//	}
//
//	@When("the user clicks the Register button after entering more than {int} characters in the user ID field")
//	public void the_user_clicks_the_register_button_after_entering_more_than_characters_in_the_user_id_field(Integer int1) {
//	    
//	}
//
//	@Then("the user should be redirected to the Home Page of DS Algo with a message {string}")
//	public void the_user_should_be_redirected_to_the_home_page_of_ds_algo_with_a_message(String string) {
//	   
//	}
//
//	@When("the user clicks the Register button after entering a commonly used password")
//	public void the_user_clicks_the_register_button_after_entering_a_commonly_used_password() {
//	    
//	}
//
//	@When("the user clicks the Register button after entering a password with fewer than {int} characters")
//	public void the_user_clicks_the_register_button_after_entering_a_password_with_fewer_than_characters(Integer int1) {
//	    
//	}
//
//	@When("the user clicks the Register button after entering only numeric values as the password")
//	public void the_user_clicks_the_register_button_after_entering_only_numeric_values_as_the_password() {
//	   
//	}
//
//	@When("the user clicks the Register button after entering a valid username, password, and password confirmation")
//	public void the_user_clicks_the_register_button_after_entering_a_valid_username_password_and_password_confirmation() {
//	    
//	}


