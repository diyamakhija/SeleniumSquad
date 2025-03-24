package stepDefinition;

import org.junit.Assert;

import constants.UrlConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LoginPagePF;
import utilities.ExcelSheetReader;
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
	 
		Assert.assertEquals("User is not on the Dashboard Page",UrlConstants.LOGIN_URL,
				loginPagePF.getCurrentUrl());

	}
	
    @Given("I am on the Loginpage")
    public void i_am_on_the_loginpage() {
        loginPagePF.pageURL();
        loginPagePF.getStartedBtn();
        loginPagePF.signInBtn();
    }

    // Scenario Outline Step Definitions
    @When("I login with {string} and {int}")
    public void i_login_with_and(String sheetName, Integer rowNumber) {
    	 // Fetch username and password from Excel sheet using the provided sheetName and rowNumber
        String userName = ExcelSheetReader.getExcelSheetData(sheetName, rowNumber, "username");
        String password = ExcelSheetReader.getExcelSheetData(sheetName, rowNumber, "password");

        // Perform login actions
        loginPagePF.enterUsername(userName);
        loginPagePF.enterPassword(password);
        loginPagePF.logInBtn();
    }

    @Then("I should see the message {string}")
    public void i_should_see_the_message(String expectedMessage) { 	
    	
    	LoggerLoad.info("Expected Message - Excel Sheet: " + expectedMessage);
    	
    	
    }
    
}


	
	

	
	
	

