package stepDefinition;

import org.junit.Assert;
import constants.UrlConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.ArrayPF;
import pageFactory.LoginPagePF;
import utilities.LoggerLoad;

public class ArraySteps {

	LoginPagePF loginPagePF = new LoginPagePF();
	LoggerLoad loggerLoad = new LoggerLoad();
	ArrayPF array = new ArrayPF();

//1
	@Given("The user is in the Home page after signin")
	public void the_user_is_in_the_home_page_after_signin() {
		LoggerLoad.info("The user is in the Home page after sign in");
	}

	@When("The user should click the {string} button of the Array panel")
	public void the_user_should_click_the_button_of_the_array_panel(String string) {
		array.clickGetStartedArrayButton();
	}

	@Then("The user should land in Array Page")
	public void the_user_should_land_in_array_page() {
		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.ARRAY_PAGE_URL, array.getCurrentUrl());
	}

//2
	@Given("The user is on the Array page after Signin")
	public void the_user_is_on_the_array_page_after_signin() {
		array.clickGetStartedArrayButton();
		LoggerLoad.info("The User is in Array page");
	}

	@When("The user clicks Arrays in Python button")
	public void the_user_clicks_arrays_in_python_button() {
		array.clickArraysInPythonButton();
	}

	@Then("The user should be redirected to Arrays in Python page")
	public void the_user_should_be_redirected_to_arrays_in_python_page() {
		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.ARRAY_ARRAYS_IN_PYTHON_URL,
				array.getCurrentUrl());
	}

// 3
	@Given("The user is on the Arrays in Python page")
	public void the_user_is_on_the_arrays_in_python_page() {
		array.clickGetStartedArrayButton();
		array.clickArraysInPythonButton();
		LoggerLoad.info("User is in Arrays in Python Page");
	}

	@When("The user clicks {string} button in Arrays in Python page")
	public void the_user_clicks_button_in_arrays_in_python_page() {
		array.clickTryHereButton();
	}

	@Then("The user should be redirected to a page having a Try Editor with a Run button")
	public void the_user_should_be_redirected_to_try_editor_page() {
		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.TRYEDITOR_URL, array.getCurrentUrl());
	}

//4
	@Given("The user is in the Try Editor page of Arrays in Python")
	public void the_user_is_in_the_try_editor_page_of_arrays_in_python() {
		array.clickGetStartedArrayButton();
		array.clickArraysInPythonButton();
		array.clickTryHereButton();
		LoggerLoad.info("User is in Array-tryEditor Page");
	}

	@When("The user clicks the {string} Button without entering code")
	public void the_user_clicks_the_button_without_entering_code() {
		array.clickRunButton();
	}

	@Then("The user should see an error message in an alert window of Try editor based on {string} at row {int}")
	public void the_user_should_see_an_error_message_in_an_alert_window_of_try_editor_based_on_at_row(String sheetName,
			Integer rowNumber) {
		Assert.assertEquals("An unexpected error occurred:", array.nameHandleAlert(),
				array.expectedResult(sheetName, rowNumber));
	}

//5
	@When("The user writes invalid {string} code in the Editor and clicks the Run Button")
	public void the_user_writes_invalid_code_in_the_editor_and_clicks_the_run_button(String sheetName,
			Integer rowNumber) {
		array.codeEditorInput(sheetName, rowNumber);
		array.clickRunBtn();
	}

	@Then("The user should see an name error message in an alert window of Try editor based on {string} at row {int}")
	public void the_user_should_see_an_name_error_message_in_an_alert_window_of_try_editor_based_on_at_row(
			String sheetName, Integer rowNumber) {
		Assert.assertEquals("An unexpected error occurred:", array.nameHandleAlert(),
				array.expectedResult(sheetName, rowNumber));
	}

//6
	@Then("User should see a Syntax Error message in an alert window {string} at row {int}")
	public void user_should_see_a_syntax_error_message_in_an_alert_window_at_row(String sheetName, Integer rowNumber) {
		Assert.assertEquals("An unexpected error occurred:", array.syntaxHandleAlert(),
				array.expectedResult("pythonCode", 2));
	}

//7
	@When("The user write the {string} code in Editor from {string} at row {int} , then clicks the Run Button")
	public void the_user_write_the_code_in_editor_from_at_row_then_clicks_the_run_button(String sheetName,
			Integer rowNumber) {
		array.codeEditorInput(sheetName, rowNumber);
		array.clickRunBtn();
	}

	@Then("The user write the valid code in Editorform {string} at row {int}")
	public void the_user_write_the_valid_code_in_editorform_at_row(String sheetName, Integer rowNumber) {
		Assert.assertEquals("An unexpected error occurred:", array.expectedResult(sheetName, rowNumber),
				array.output.getText());
	}

//8
	@When("The user clicks Arrays using List button")
	public void the_user_clicks_arrays_using_list_button() {
		array.clickArraysUsingListButton();
	}

	@Then("The user should be redirected to Arrays using List page")
	public void the_user_should_be_redirected_to_arrays_using_list_page() {
		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.ARRAY_ARRAYS_USING_LIST_URL,
				array.getCurrentUrl());
	}

// 9
	@Given("The user is on the  {string} page")
	public void the_user_is_on_the_page() {
		array.clickGetStartedArrayButton();
		array.clickArraysUsingListButton();
		array.clickTryHereButton();
	}

	@When("The user clicks {string} button in  {string} page")
	public void the_user_clicks_button_in_page() {
		array.clickTryHereButton();
	}

//18

	@Given("The user is in the Try Editor page of  Arrays using List")
	public void the_user_is_in_the_try_editor_page_of_arrays_using_list() {
		array.clickGetStartedArrayButton();
		array.clickArraysInPythonButton();
		array.clickTryHereButton();
		LoggerLoad.info("User is in Array-tryEditor Page");
	}

	@When("The user clicks the {string} button without entering code {string} at row {int}")
	public void the_user_clicks_the_button_without_entering_code_at_row(String sheetName, Integer rowNumber) {
		array.clickRunButton();
	}

	@Then("The user should see an error message in an alert window of Try editor for Arrays using List based on {string} at row {int}")
	public void the_user_should_see_an_error_message_in_an_alert_window_of_try_editor_for_arrays_using_list_based_on_at_row(
			String sheetName, Integer rowNumber) {
		Assert.assertEquals("An unexpected error occurred:", array.nameHandleAlert(),
				array.expectedResult(sheetName, rowNumber));
	}

// 19
	@When("The user enters invalid name code in the Editor under Arrays using List and clicks the Run button")
	public void the_user_enters_invalid_name_code_in_the_editor_under_arrays_using_list_and_clicks_the_run_button() {
		array.clickRunBtn();
	}

	@Then("The user should see an name error message in an alert window under Arrays using List of Try editor based on {string} at row {int}")
	public void the_user_should_see_an_name_error_message_in_an_alert_window_under_arrays_using_list_of_try_editor_based_on_at_row(
			String sheetName, Integer rowNumber) {
		Assert.assertEquals("An unexpected error occured", array.nameHandleAlert(),
				array.expectedResult(sheetName, rowNumber));

	}

// 20
	@When("The user writes invalid Syntax code in the Editor under Arrays using List and clicks the Run Button")
	public void the_user_writes_invalid_syntax_code_in_the_editor_under_arrays_using_list_and_clicks_the_run_button() {
		array.clickRunBtn();
	}

	@Then("User should see a Syntax Error message in an alert window under Arrays using List based on  {string} at row {int}")
	public void user_should_see_a_syntax_error_message_in_an_alert_window_under_arrays_using_list_based_on_at_row(
			String sheetName, Integer rowNumber) {
		Assert.assertEquals("An unexpected error occured", array.nameHandleAlert(),
				array.expectedResult(sheetName, rowNumber));
	}

//21   
	@When("The user write the {string} code in Editor under Arrays using List, then clicks the Run Button")
	public void the_user_write_the_code_in_editor_under_arrays_using_list_then_clicks_the_run_button(String string) {
		array.clickRunBtn();
	}

	@Then("The user write the valid code in Editor form in Arrays using List based on\"pythonCode\" at row {int}")
	public void the_user_write_the_valid_code_in_editor_form_in_arrays_using_list_based_on_python_code_at_row(
			String sheetName, Integer rowNumber) {
		Assert.assertEquals("An unexpected error occured", array.nameHandleAlert(),
				array.expectedResult(sheetName, rowNumber));

	}

	@When("The user clicks Basic Operations in Lists button")
	public void the_user_clicks_basic_operations_in_lists_button() {
		array.clickBasicOperaInListsButton();
	}

	@Then("The user should be redirected to Basic Operations in Lists page")
	public void the_user_should_be_redirected_to_basic_operations_in_lists_page() {
		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.ARRAY_BASIC_OPERATIONS_IN_LISTS_URL,
				array.getCurrentUrl());
	}

	@When("The user clicks Applications of Array button")
	public void the_user_clicks_applications_of_array_button() {
		array.clickApplicationsOfArrayButton();
	}

	@Then("The user should be redirected to Applications of Array page")
	public void the_user_should_be_redirected_to_applications_of_array_page() {
		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.ARRAY_APPLICATIONS_OF_ARRAY_URL,
				array.getCurrentUrl());
	}

	@Given("The user is in the Array page after Sign in")
	public void the_user_is_in_the_array_page_after_sign_in() {
		array.clickGetStartedArrayButton();
		array.clickArraysInPythonButton();
		LoggerLoad.info("User is in the Array page after Sign in");
	}

	@When("User clicks \"Practice Questions\" button")
	public void user_clicks_button() {
		array.clickPracticeQuestionsButton();
	}

	@Then("User should be redirected to {string} page")
	public void user_should_be_redirected_to_page() {
		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.ARRAY_PRACTICE_URL,
				array.getCurrentUrl());
	}

	@Given("The user is on the {string} question editor")
	public void the_user_is_on_the_question_editor() {
		array.clickGetStartedArrayButton();
		array.clickArraysInPythonButton();
		array.clickPracticeQuestionsButton();
		LoggerLoad.info("User is in the Array page after Sign in");
	}

	@When("The user clicks the {string} link")
	public void the_user_clicks_the_link(String string) {
		array.clickSearchArrayLink();
	}

	@Then("The user should be redirected to a question page with a Try Editor")
	public void the_user_should_be_redirected_to_a_question_page_with_a_try_editor() {
		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.ARRAY_QUESTION1_URL,
				array.getCurrentUrl());
	}

	@Given("The user is on the practice question editor")
	public void the_user_is_on_the_practice_question_editor() {
		array.clickGetStartedArrayButton();
		array.clickArraysInPythonButton();
		array.clickPracticeQuestionsButton();
		array.clickSearchArrayLink();
		LoggerLoad.info("User is on the practice question editor");
	}

	@When("The user write the Syntax Error code in Editor and Click the Run Button {string} at row {int}")
	public void the_user_write_the_syntax_error_code_in_editor_and_click_the_run_button_at_row(String sheetName,
			Integer rowNumber) {
		array.codeEditorInput(sheetName, rowNumber);
		array.clickRunBtn();
	}

	@Then("User should see a {string} message in an alert window {string} at row {int}")
	public void user_should_see_a_message_in_an_alert_window_at_row(String sheetName, Integer rowNumber) {
		Assert.assertEquals("An unexpected error occurred:", array.syntaxHandleAlert(),
				array.expectedResult("pythonCode", 2));
	}

	@When("The user write the name Error code in Editor and Click the Run Button {string} at row {int}")
	public void the_user_write_the_name_error_code_in_editor_and_click_the_run_button_at_row(String sheetName,
			Integer rowNumber) {
		array.codeEditorInput(sheetName, rowNumber);
		array.clickRunBtn();
	}

	@Then("The user should able to see name error message in alert window")
	public void the_user_should_able_to_see_name_error_message_in_alert_window(String sheetName, Integer rowNumber) {
		Assert.assertEquals("An unexpected error occurred:", array.nameHandleAlert(),
				array.expectedResult(sheetName, rowNumber));

	}

	@When("The user write the invalid code in Editor and Click the Submit Button {string} at row {int}")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_submit_button_at_row(String sheetName,
			Integer rowNumber) {
		array.codeEditorInput(sheetName, rowNumber);
		array.clickRunBtn();
	}

	@Then("On Submit User should see a {string} message in an alert window {string} at row {int}")
	public void on_submit_user_should_see_a_message_in_an_alert_window_at_row(String sheetName, Integer rowNumber) {
		Assert.assertEquals("An unexpected error occurred:", array.nameHandleAlert(),
				array.expectedResult(sheetName, rowNumber));
	}

	@When("The user writes valid code in the Editor and clicks the Run Button {string} at row {int}")
	public void the_user_writes_valid_code_in_the_editor_and_clicks_the_run_button_at_row(String sheetName,
			Integer rowNumber) {
		array.codeEditorInput(sheetName, rowNumber);
		array.clickRunBtn();
	}

	@Then("The user should see the correct output in the console based on {string} at row {int}")
	public void the_user_should_see_the_correct_output_in_the_console_based_on_at_row(String sheetName,
			Integer rowNumber) {
		Assert.assertEquals("An unexpected error occurred:", array.nameHandleAlert(),
				array.expectedResult(sheetName, rowNumber));

	}

}
