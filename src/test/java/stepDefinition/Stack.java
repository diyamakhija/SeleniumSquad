package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.StackPF;
import utilities.LoggerLoad;

public class Stack {
	//LoginPagePF loginPagePF = new LoginPagePF();
	StackPF stackPF = new StackPF();
	
	LoggerLoad loggerLoad = new LoggerLoad();
	
	//Scenario 1 start
	
	@Given("the user is signed in to the DSAlgo Portal for the stack test")
	public void the_user_is_signed_in_to_the_ds_algo_portal_for_the_stack_test() {
		LoggerLoad.info("The user is in the home page after signin");
	}

	@When("the user clicks on the {string} button for {string} on the Data Structures page")
	public void the_user_clicks_on_the_button_for_on_the_data_structures_page(String string, String string2) {
		stackPF.stack_getStartedBtn();
	}

	@Then("the user should be navigated to the {string} page")
	public void the_user_should_be_navigated_to_the_page(String string) {
		Assert.assertEquals("User is not on the Dashboard Page", stackPF.expectedUrl32(), stackPF.getCurrentUrl());
	}
	//Scenario 1 end
	
	//Scenario 2 start
	@Given("The user is in the {string} stack page after Sign in")
	public void the_user_is_in_the_stack_page_after_sign_in(String string) {
		LoggerLoad.info("The user is in the Stack page after Sign in");
		stackPF.stack_getStartedBtn();
	}


	@When("the user clicks on the {string} button on the {string} page")
	public void the_user_clicks_on_the_button_on_the_page(String string, String string2) {
		stackPF.OperationinStackBtn();
	}
	

	@Then("the user should be redirected to {string} page of Stack")
	public void the_user_should_be_redirected_to_page_of_stack(String string) {
		Assert.assertEquals("User is not on the Dashboard Page", stackPF.expectedUrl33(), stackPF.getCurrentUrl());

	}
	
	//Scenario 2 end

	//Scenario 3 start

	@Given("The user is in the Operations in stack page")
	public void the_user_is_in_the_operations_in_stack_page() {
			stackPF.stack_getStartedBtn();
			stackPF.OperationinStackBtn();
			LoggerLoad.info("The user is in the Stack page after Sign in");
	}

	@When("The user clicks Try Here button in Operations in stack page")
	public void the_user_clicks_try_here_button_in_operations_in_stack_page() {
		stackPF.tryHereBtn();
	}

	@Then("The user should be redirected to stack page having an try Editor with a {string} button to test")
	public void the_user_should_be_redirected_to_stack_page_having_an_try_editor_with_a_button_to_test(String string) {
		Assert.assertEquals("User is not on the Dashboard Page", stackPF.expectedUrl34(), stackPF.getCurrentUrl());
	}
	//Scenario 3 end
	//--------------------------------------
	//Scenario 4 start
	
	@Given("The user is in the tryEditor page of Operations in stack")
	public void the_user_is_in_the_try_editor_page_of_operations_in_stack() {
		stackPF.stack_getStartedBtn();
		stackPF.implementation();
		stackPF.tryHereBtn();
		LoggerLoad.info("The user is in the tryEditor page of Implementation using Array pagen");

	}

	@When("The tack user clicks the Run Button without entering the code in the Editor page")
	public void the_tack_user_clicks_the_run_button_without_entering_the_code_in_the_editor_page() {
		stackPF.runBtn();

	}

	@Then("The stack user should able to see and error message in alert window")
	public void the_stack_user_should_able_to_see_and_error_message_in_alert_window() {
		Assert.assertEquals("An unexpected error occurred:", stackPF.handleAlert1(), stackPF.expectederrorResult());

	}
	//Scenario 4 end
	//--------------------------------------
	//Scenario 5 start
	
	@Given("The user is in the tryEditor page of Operation in Stack page")
	public void the_user_is_in_the_try_editor_page_of_operation_in_stack_page() {
		stackPF.stack_getStartedBtn();
		stackPF.implementation();
		stackPF.tryHereBtn();
		LoggerLoad.info("The user is in the tryEditor page of Implementation using Array pagen");
	}

	@When("The stack user write the invalid name code in Editor and click the Run Button")
	public void the_stack_user_write_the_invalid_name_code_in_editor_and_click_the_run_button() {
		stackPF.runBtn();
	}

	@Then("The stack user should able to see a name error message in alert window")
	public void the_stack_user_should_able_to_see_a_name_error_message_in_alert_window() {
		Assert.assertEquals("An unexpected error occurred:", stackPF.handleAlert1(), stackPF.expectederrorResult());

	}
	
	
	
	
}