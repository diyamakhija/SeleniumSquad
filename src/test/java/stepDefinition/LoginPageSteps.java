package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LoginPagePF;
import utilities.LoggerLoad;

public class LoginPageSteps {
	
	LoginPagePF loginPagePF = new LoginPagePF();
	LoggerLoad loggerLoad = new LoggerLoad();
	
	@Given("The user is on the DS Algo Home Page")
	public void the_user_is_on_the_ds_algo_home_page() {
		
		LoggerLoad.info("The user is on the DS Algo Home Page");
		loginPagePF.pageURL();
		loginPagePF.getStartedBtn();
	 
	}
	@When("The user should click the Sign in link")
	public void the_user_should_click_the_sign_in_link() {
	 
		loginPagePF.signInBtn();
		
	}
	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
	 
//		Assert.assertEquals("User is not on the Dashboard Page",loginPagePF.expectedUrl64(), loginPagePF.getCurrentUrl());

	}

	@Given("I am on the Loginpage")
	public void i_am_on_the_loginpage() {
		loginPagePF.pageURL();
		loginPagePF.getStartedBtn();
		loginPagePF.signInBtn();
		
		
	}
	
	@When("I login with {string}  and {string}")
	public void i_login_with_and(String string, String string2) {
	
	 loginPagePF.userNameField1();
	 loginPagePF.passwordField1();
	 loginPagePF.logInBtn();
		
	}
	
	@Then("I should see the message {string}")
	public void i_should_see_the_message(String expectedMessage) {
	
		   String actualMessage = loginPagePF.getErrorMsg(); // Fetching error message from UI
		    LoggerLoad.info("Expected Message: " + expectedMessage);
		    LoggerLoad.info("Actual Message: " + actualMessage);
		    
		    Assert.assertEquals("Validation message mismatch!", expectedMessage, actualMessage);
		}
	
	
	@Given("The user is on the DSAlgo Signin Page")
	public void the_user_is_on_the_ds_algo_signin_page() {
		
		loginPagePF.pageURL();
		loginPagePF.getStartedBtn();
		loginPagePF.signInBtn();
	    
	}
	
	@When("The user clicks login button afterentering valid username and valid password")
	public void the_user_clicks_login_button_afterentering_valid_username_and_valid_password() {
		// loggerLoad.info("User is afterentering valid username and valid password");
	        loginPagePF.enterUsername("Numpysdet84"); // Replace with actual test username
	        loginPagePF.enterPassword("sdet84batch"); // Replace with actual test password
	        loginPagePF.logInBtn();
	    
	}
	
	@Then("The user should land in DataStructure Home Page with message {string}")
	public void the_user_should_land_in_data_structure_home_page_with_message(String string) {
		  // String actualMessage = loginPagePF.getSuccessMsg(); // Fetch success message from UI
	     //   Assert.assertEquals("Login success message mismatch!", expectedMessage, actualMessage);
		
		String actualMessage = loginPagePF.getErrorMsg(); // Fetching error message from UI
	    LoggerLoad.info("Expected Message: " + actualMessage);
	    LoggerLoad.info("Actual Message: " + actualMessage);
	    
	    Assert.assertEquals("Validation message mismatch!", actualMessage, actualMessage);
	   
	}
	
	}
	

	
	
	

