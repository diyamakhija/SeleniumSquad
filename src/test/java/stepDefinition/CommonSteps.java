package stepDefinition;

import io.cucumber.java.en.Given;
import pageFactory.LoginPagePF;
import utilities.ExcelSheetReader;

public class CommonSteps {
	LoginPagePF loginPagePF = new LoginPagePF();

	@Given("The user sign in to dsAlgo Portal")
	public void the_user_sign_in_to_ds_algo_portal() {
		loginPagePF.pageURL();
		loginPagePF.getStartedBtn.click();
		loginPagePF.signInBtn.click();
		loginPagePF.userNameField.sendKeys(ExcelSheetReader.userCredential(3).get(0));
		loginPagePF.passwordField.sendKeys(ExcelSheetReader.userCredential(3).get(1));
		loginPagePF.logInBtn.click();
	}
}
