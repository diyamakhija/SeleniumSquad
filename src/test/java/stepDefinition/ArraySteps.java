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


	@Given("The user is in the Home page after signin")
	public void the_user_is_in_the_home_page_after_signin() {
		LoggerLoad.info("The user is in the Home page after sign in");
	}
// @ar1
	@When("The user should click the Get Started button of the Array panel")
	public void the_user_should_click_the_get_started_button_of_the_array_panel() {
		array.clickGetStartedArrayButton();
	}

	@Then("The user should land in Array Page")
	public void the_user_should_land_in_array_page() {
		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.ARRAY_PAGE_URL, array.getCurrentUrl());
	}

//@ar2NavigateToArraysInPython
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

// @ar3ClicksTryHere
	@Given("The user is on the Arrays in Python page")
	public void the_user_is_on_the_arrays_in_python_page() {
		array.clickGetStartedArrayButton();
		array.clickArraysInPythonButton();
		LoggerLoad.info("User is in Arrays in Python Page");
	}

	@When("The user clicks Try Here button in Arrays in Python page")
	public void the_user_clicks_try_here_button_in_arrays_in_python_page() {
		array.clickTryHereButton();
	}

	@Then("The user should be redirected to a page having a Try Editor with a Run button")
	public void the_user_should_be_redirected_to_try_editor_page() {
		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.TRYEDITOR_URL, array.getCurrentUrl());
	}
	
//@ar4RunWithoutCode	
	@Given("The user is in the Try Editor page of Arrays in Python")
	public void the_user_is_in_the_try_editor_page_of_arrays_in_python() {
		array.clickGetStartedArrayButton();
		array.clickArraysInPythonButton();
		array.clickTryHereButton();
		
		LoggerLoad.info("User is in Array-tryEditor Page");
	}

	@When("The user clicks the Run button without entering any code for Arrays in Python")
	public void the_user_clicks_the_run_button_without_entering_any_code_for_arrays_in_python() {
		array.clickRunButton();
	}

	@Then("The user should see an error message in an alert window of Try editor based on {string} at row {int} for Arrays in Python")
	public void the_user_should_see_an_error_message_in_an_alert_window_of_try_editor_based_on_at_row_for_arrays_in_python(String sheetName,
			Integer rowNumber) {
		Assert.assertEquals("An unexpected error occurred:", array.nameHandleAlert(),
				array.expectedResult(sheetName,rowNumber));
	}

//5InvalidNameCode
	@When("The user writes the invalid Name code in the Editor from {string} at row {int} then clicks at Run button")
	public void the_user_writes_the_invalid_name_code_in_the_editor_from_at_row_then_clicks_at_run_button(String sheetName,
			Integer rowNumber) {
		array.codeEditorInput(sheetName, rowNumber);
		array.clickRunButton();
	}

	@Then("The user should see Name Error message in an alert window of Try editor based on {string} at row {int} for Arrays in Python")
	public void the_user_should_see_name_error_message_in_an_alert_window_of_try_editor_based_on_at_row_for_arrays_in_python(
			String sheetName, Integer rowNumber) {
		Assert.assertEquals("An unexpected error occurred:", array.nameHandleAlert(),
				array.expectedResult(sheetName, rowNumber));
	}

//6InvalidSyntaxCode
	@When("The user writes the invalid Syntax code in the Editor from {string} at row {int} then clicks at Run button")
	public void the_user_writes_the_invalid_syntax_code_in_the_editor_from_at_row_then_clicks_at_run_button(String sheetName,
	Integer rowNumber){
		array.codeEditorInput(sheetName, rowNumber);
		array.clickRunButton();
	}
	
	@Then("The user should see Syntax Error message in an alert window of Try editor based on {string} at row {int} for Arrays in Python")
	public void the_user_should_see_syntax_error_message_in_an_alert_window_of_try_editor_based_on_at_row_for_arrays_in_python(String sheetName, Integer rowNumber) {
		Assert.assertEquals("An unexpected error occurred:", array.syntaxHandleAlert(),
				array.expectedResult("pythonCode", 2));
	}

//7validCode
	@When("The user write the valid code in Editor from {string} at row {int} , then clicks the Run button")
	public void the_user_write_the_valid_code_in_editor_from_at_row_then_clicks_the_run_button(String sheetName,
			Integer rowNumber) {
		array.codeEditorInput(sheetName, rowNumber);
		array.clickRunButton();
	}

	@Then("The user write the valid code in Editorform {string} at row {int}")
	public void the_user_write_the_valid_code_in_editorform_at_row(String sheetName, Integer rowNumber) {
		Assert.assertEquals("An unexpected error occurred:", array.expectedResult(sheetName, rowNumber),
				array.output.getText());
	}

	 //8NavigateToArraysUsingList
	@When("The user clicks Arrays using List button")
	public void the_user_clicks_arrays_using_list_button() {
		array.clickArraysUsingListButton();
	}

	@Then("The user should be redirected to Arrays using List page")
	public void the_user_should_be_redirected_to_arrays_using_list_page() {
		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.ARRAY_ARRAYS_USING_LIST_URL,
				array.getCurrentUrl());
	}

	//9NavigateToBasicOperationsInLists
	@When("The user clicks Basic Operations in Lists button")
	public void the_user_clicks_basic_operations_in_lists_button() {
		array.clickBasicOperaInListsButton();
	}

	@Then("The user should be redirected to Basic Operations in Lists page")
	public void the_user_should_be_redirected_to_basic_operations_in_lists_page() {
		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.ARRAY_BASIC_OPERATIONS_IN_LISTS_URL,
				array.getCurrentUrl());
	}
	
	//10NavigateToApplicationsOfArray
	@When("The user clicks Applications of Array button")
	public void the_user_clicks_applications_of_array_button() {
		array.clickApplicationsOfArrayButton();
	}

	@Then("The user should be redirected to Applications of Array page")
	public void the_user_should_be_redirected_to_applications_of_array_page() {
		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.ARRAY_APPLICATIONS_OF_ARRAY_URL,
				array.getCurrentUrl());
	}
	
	//11NavigateToPracticeQuestions
	@When("User clicks Practice Questions button")
	public void user_clicks_practice_questions_button() {
		array.clickPracticeQuestionsButton();
	}

	@Then("User should be redirected to Practice page")
	public void user_should_be_redirected_to_practice_page() {
		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.ARRAY_PRACTICE_URL,
				array.getCurrentUrl());
	}
	
	//12NavigateToSearchTheArray
	@Given("The user is on the practice question editor")
	public void the_user_is_on_the_practice_question_editor() {
		array.clickGetStartedArrayButton();
		array.clickArraysInPythonButton();
		array.clickPracticeQuestionsButton();
		LoggerLoad.info("User is on the practice question editor");
	}

	@When("The user clicks the Search the Array link")
	public void the_user_clicks_the_search_the_array_link() {
		array.clickSearchArrayLink();
	}
	
	@Then("The user should be redirected to a question page")
	public void the_user_should_be_redirected_to_a_question_page() {
		Assert.assertEquals("User is not on the Question Page",UrlConstants.ARRAY_QUESTION1_URL,
				array.getCurrentUrl());
	}
	
	//13InvalidSyntaxCodeSearchTheArray
	@Given("The user is on the  Search the Array question link")
	public void the_user_is_on_the_search_the_array_question_link() {
	
		array.clickGetStartedArrayButton();
		array.clickArraysInPythonButton();
		array.clickPracticeQuestionsButton();
		array.clickSearchArrayLink();
		LoggerLoad.info("User is on the practice question editor");
	}
	
	@When("The user write the Syntax Error code in Editor {string} at row <RowNumber> and then click the run button for Search the Array")
	public void the_user_write_the_syntax_error_code_in_editor_at_row_row_number_and_then_click_the_run_button_for_search_the_array(String sheetName, Integer rowNumber)
	   
	 {
		array.codeEditorInput(sheetName, rowNumber);
		array.clickRunButton();
	}
	@Then("User should see a Syntax Error message in an alert window based on {string} at row {int}")
	public void user_should_see_a_syntax_error_message_in_an_alert_window_based_on_at_row(String sheetName, Integer rowNumber) {
		Assert.assertEquals("An expected Syntax error code occur", array.syntaxHandleAlert(),
			array.syntaxHandleAlert());
	}
	//14InvalidNameCodeSearchTheArray
	@When("The user write the name Error code in Editor {string} at row {int} and then click the run button for Search the Array")
	public void the_user_write_the_name_error_code_in_editor_at_row_and_then_click_the_run_button_for_search_the_array(String sheetName,
			Integer rowNumber) {
	
	}

	@Then("User should see a Name Error message in an alert window based on {string} at row {int}")
	public void user_should_see_a_name_error_message_in_an_alert_window_based_on_at_row(String sheetName, Integer rowNumber) {
		

	}
	
	
	
	

   //17TryHereArraysusingList
	@Given("The user is on the  Arrays using List page")
	public void the_user_is_on_the_arrays_using_list_page() {
		array.clickGetStartedArrayButton();
		array.clickArraysUsingListButton();
	}

	@When("The user clicks Try Here button in  Arrays using List page")
	public void the_user_clicks_try_here_button_in_arrays_using_list_page() {
		array.clickTryHereButton();
	}

	@Then("The user should be redirected to a page having a Try Editor with a Run button in  Arrays using List page")
	public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_in_arrays_using_list_page() {
		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.TRYEDITOR_URL,
				array.getCurrentUrl());
	}
	
//18RunWithoutCodeArraysusingList
	@Given("The user is in the Try Editor page of  Arrays using List")
	public void the_user_is_in_the_try_editor_page_of_arrays_using_list() {
		array.clickGetStartedArrayButton();
		array.clickArraysUsingListButton();
		array.clickTryHereButton();
		LoggerLoad.info("User is in Array-tryEditor Page");
	}

	@When("The user clicks the Run button without entering code {string} at row {int}")
	public void the_user_clicks_the_run_button_without_entering_code_at_row(String sheetName, Integer rowNumber) {
		array.clickRunButton();
	}

	@Then("The user should see an error message in an alert window of Try editor for Arrays using List based on {string} at row {int}")
	public void the_user_should_see_an_error_message_in_an_alert_window_of_try_editor_for_arrays_using_list_based_on_at_row(String sheetName, Integer rowNumber) {
		
	}

// 19InvalidNameCodeArraysusingList
	@When("The user enters invalid name code in the Editor under Arrays using List and clicks the Run button")
	public void the_user_enters_invalid_name_code_in_the_editor_under_arrays_using_list_and_clicks_the_run_button() {
		array.clickRunButton();
	}

	@Then("The user should see an name error message in an alert window under Arrays using List of Try editor based on {string} at row {int}")
	public void the_user_should_see_an_name_error_message_in_an_alert_window_under_arrays_using_list_of_try_editor_based_on_at_row(
			String sheetName, Integer rowNumber) {
		

	}

// 20InvalidSyntaxCodeArraysusingList
	@When("The user writes invalid Syntax code in the Editor under Arrays using List and clicks the Run button")
	public void the_user_writes_invalid_syntax_code_in_the_editor_under_arrays_using_list_and_clicks_the_run_button() {
		array.clickRunButton();
	}

	@Then("User should see a Syntax Error message in an alert window under Arrays using List based on  {string} at row {int}")
	public void user_should_see_a_syntax_error_message_in_an_alert_window_under_arrays_using_list_based_on_at_row(
			String sheetName, Integer rowNumber) {
		
	}

//21validCodeArraysusingList   
	@When("The user write the valid code in Editor under Arrays using List, then clicks the Run button")
	public void the_user_write_the_valid_code_in_editor_under_arrays_using_list_then_clicks_the_run_button()
 {
		array.clickRunButton();
	}

	@Then("The user write the valid code in Editor form in Arrays using List based on\"pythonCode\" at row {int}")
	public void the_user_write_the_valid_code_in_editor_form_in_arrays_using_list_based_on_python_code_at_row() {
	

	}



//	@Given("The user is in the Array page after Sign in")
//	public void the_user_is_in_the_array_page_after_sign_in() {
//		array.clickGetStartedArrayButton();
//		array.clickArraysInPythonButton();
//		LoggerLoad.info("User is in the Array page after Sign in");
//	}

	

	@Given("The user is on the {string} question editor")
	public void the_user_is_on_the_question_editor(String editorInput) {
		array.clickGetStartedArrayButton();
		array.clickArraysInPythonButton();
		array.clickPracticeQuestionsButton();
		LoggerLoad.info("User is in the Array page after Sign in");
	}



	@When("The user write the Syntax Error code in Editor and Click the Run Button {string} at row {int}")
	public void the_user_write_the_syntax_error_code_in_editor_and_click_the_run_button_at_row(String sheetName,
			Integer rowNumber) {
		array.codeEditorInput(sheetName, rowNumber);
		array.clickRunButton();
	}

	@Then("User should see a {string} message in an alert window {string} at row {int}")
	public void user_should_see_a_message_in_an_alert_window_at_row(String sheetName, Integer rowNumber) {
		Assert.assertEquals("An unexpected error occurred:", array.syntaxHandleAlert(),
				array.expectedResult("pythonCode", 2));
	}



	@When("The user write the invalid code in Editor and Click the Submit Button {string} at row {int}")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_submit_button_at_row(String sheetName,
			Integer rowNumber) {
		array.codeEditorInput(sheetName, rowNumber);
		array.clickRunButton();
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
		array.clickRunButton();
	}

	@Then("The user should see the correct output in the console based on {string} at row {int}")
	public void the_user_should_see_the_correct_output_in_the_console_based_on_at_row(String sheetName,
			Integer rowNumber) {
		Assert.assertEquals("An unexpected error occurred:", array.nameHandleAlert(),
				array.expectedResult(sheetName, rowNumber));

	}

}
