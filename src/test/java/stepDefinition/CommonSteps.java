package stepDefinition;

import io.cucumber.java.en.Given;
import pageObjectModel.LoginPagePOM;

public class CommonSteps {
	LoginPagePOM loginPagePF = new LoginPagePOM();

	@Given("The user sign in to dsAlgo Portal")
	public void the_user_sign_in_to_ds_algo_portal() {
		loginPagePF.pageURL();
		loginPagePF.getStartedBtn.click();
		loginPagePF.signInBtn.click();
	}
}
