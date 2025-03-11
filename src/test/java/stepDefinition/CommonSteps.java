package stepDefinition;

import io.cucumber.java.en.Given;
import pageFactory.LoginPagePF;
import utilities.ConfigReader;
import utilities.ExcelSheetReader;

public class CommonSteps {
	LoginPagePF loginPagePF = new LoginPagePF();

	@Given("The user sign in to dsAlgo Portal")
	public void the_user_sign_in_to_ds_algo_portal() {
		
		loginPagePF.pageURL();
		loginPagePF.getStartedBtn();
		loginPagePF.signInBtn();
		loginPagePF.userNameField();
		loginPagePF.passwordField();
		loginPagePF.logInBtn();
	}
	
}
