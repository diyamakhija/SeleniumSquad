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
	 
		Assert.assertEquals("User is not on the Dashboard Page",loginPagePF.expectedUrl64(), loginPagePF.getCurrentUrl());

	}

}
