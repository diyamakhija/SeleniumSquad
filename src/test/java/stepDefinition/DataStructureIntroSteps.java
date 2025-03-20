
package stepDefinition;

import org.junit.Assert;

import constants.UrlConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.DataStructureIntroPF;
import pageFactory.LoginPagePF;
import utilities.LoggerLoad;

public class DataStructureIntroSteps {

	LoginPagePF loginPagePF = new LoginPagePF();
	DataStructureIntroPF dataStructureIntroPF = new DataStructureIntroPF();
	LoggerLoad loggerLoad = new LoggerLoad();

	@Given("The user is in the Home page after sign in")
	public void the_user_is_in_the_home_page_after_sign_in() {

		LoggerLoad.info("The user is in the Home page after sign in");
	}

	@When("The user should click the Get Started button of the Data Structures - Introduction panel")
	public void the_user_should_click_the_get_started_button_of_the_data_structures_introduction_panel() {

		dataStructureIntroPF.dataStrIntro_getStartedBtn();
	}

	@Then("The user should land in Data Structures- Introduction Page")
	public void the_user_should_land_in_data_structures_introduction_page() {

		Assert.assertEquals("User is not on the Dashboard Page",UrlConstants.DATA_STRUCTURES_INRO_URL,
				dataStructureIntroPF.getCurrentUrl());

	}

	@Given("The user is in the Data Structures-Introduction page")
	public void the_user_is_in_the_data_structures_introduction_page1() {

		dataStructureIntroPF.dataStrIntro_getStartedBtn();
		LoggerLoad.info("The user is in the Data Structures-Introduction page");

	}

	@When("The user clicks Time Complexity button")
	public void the_user_clicks_time_complexity_button() {

		dataStructureIntroPF.timeComplexityBtn();

	}

	@Then("The user should be redirected to Time Complexity of Data structures-Introduction")
	public void the_user_should_be_redirected_to_time_complexity_of_data_structures_introduction() {

		Assert.assertEquals("User is not on the Dashboard Page",UrlConstants.DATA_STRUCTURES_INTRO_TIME_COMPLEXITY_URL,
				dataStructureIntroPF.getCurrentUrl());

	}

	@Given("The user is on the Time Complexity page")
	public void the_user_is_on_the_time_complexity_page() {

		dataStructureIntroPF.dataStrIntro_getStartedBtn();
		dataStructureIntroPF.timeComplexityBtn();
		LoggerLoad.info("The user is on the Time Complexity page");
	}

	@When("The user clicks Try Here buttton on theTime Complexity page")
	public void the_user_clicks_try_here_buttton_on_the_time_complexity_page() {

		dataStructureIntroPF.tryHereBtn();

	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {

		Assert.assertEquals("User is not on the Dashboard Page",UrlConstants.TRYEDITOR_URL,
				dataStructureIntroPF.getCurrentUrl());

	}

	@Given("The user is on the Try Editor page of Time Complexity")
	public void the_user_is_on_the_try_editor_page_of_time_complexity() {

		dataStructureIntroPF.dataStrIntro_getStartedBtn();
		dataStructureIntroPF.timeComplexityBtn();
		dataStructureIntroPF.tryHereBtn();
		LoggerLoad.info("The user is in the tryEditor page of Time Complexity");

	}

	@When("The user clicks the Run Button without entering the code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {

		dataStructureIntroPF.runBtn();
	}

	@Then("The user should able to see  an error message in alert window based on {string} at row {int}")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_based_on_at_row(String sheetName, Integer rowNumber) {
	  	  
		Assert.assertEquals("An unexpected error occurred:", dataStructureIntroPF.nameHandleAlert(),
				dataStructureIntroPF.expectedResult(sheetName,rowNumber));

	}
	
	@When("The user writes the invalid name code in the Editor from {string} at row {int} , then clicks the Run Button")
	public void the_user_writes_the_invalid_name_code_in_the_editor_from_at_row_and_column_then_clicks_the_run_button(String sheetName, Integer rowNumber) {

	    dataStructureIntroPF.codeEditorInput(sheetName, rowNumber);
		dataStructureIntroPF.runBtn();

	}

	@Then("The user should see a NameError message in the alert window based on {string} at row {int}")
	public void the_user_should_see_a_name_error_message_in_the_alert_window_based_on_at_row(String sheetName, Integer rowNumber) {
	
		Assert.assertEquals("An unexpected error occurred:", dataStructureIntroPF.nameHandleAlert(),
				dataStructureIntroPF.expectedResult(sheetName,rowNumber));

	}
	@When("The user write the invalid syntaxcode in Editor from {string} at row {int} , then clicks the Run Button")
	public void the_user_write_the_invalid_syntaxcode_in_editor_from_at_row_and_column_then_clicks_the_run_button(String sheetName, Integer rowNumber) {

		dataStructureIntroPF.codeEditorInput(sheetName, rowNumber);
		dataStructureIntroPF.runBtn();
	}

	@Then("The user should able to see an syntax error message in alert window based on {string} at row {int}")
	public void the_user_should_able_to_see_an_syntax_error_message_in_alert_windowbased_on_at_row_and_column(String sheetName, Integer rowNumber) {
	  
		Assert.assertEquals("An unexpected error occurred:", dataStructureIntroPF.syntaxHandleAlert(),
				dataStructureIntroPF.expectedResult("pythonCode",2));
	}

	@When("The user write the valid code in Editorfrom {string} at row {int} , then clicks the Run Button")
	public void the_user_write_the_valid_code_in_editorfrom_at_row_and_column_then_clicks_the_run_button(String sheetName, Integer rowNumber) {

		dataStructureIntroPF.codeEditorInput(sheetName, rowNumber);
		dataStructureIntroPF.runBtn();

	}

	@Then("The user write the valid code in Editorform {string} at row {int} , then clicks the Run Button")
	public void the_user_write_the_valid_code_in_editorform_at_row_then_clicks_the_run_button(String sheetName, Integer rowNumber) {
	  
		Assert.assertEquals("An unexpected error occurred:", dataStructureIntroPF.expectedResult(sheetName,rowNumber),dataStructureIntroPF.output.getText());
	}

	@Given("The user is in the Time Complexity page")
	public void the_user_is_in_the_time_complexity_page() {

		dataStructureIntroPF.dataStrIntro_getStartedBtn();
		dataStructureIntroPF.timeComplexityBtn();

	}

	@When("The user clicks the Practice Questions button")
	public void the_user_clicks_the_practice_questions_button() {

		dataStructureIntroPF.practiceQuestionsBtn();

	}

	@Then("The user should be redirected to Practice Questions of Data structures-Introduction")
	public void the_user_should_be_redirected_to_practice_questions_of_data_structures_introduction() {

		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.DATA_STRUCTURES_INTRO_PRACTICE_URL,
				dataStructureIntroPF.getCurrentUrl());

	}

	@Given("The user is in the dropdown section")
	public void the_user_is_in_the_dropdown_section() {

		LoggerLoad.info("The user is in the Home page after sign in");

	}

	@When("The user selects the option from dropdown section")
	public void the_user_selects_the_option_from_dropdown_section() {

		dataStructureIntroPF.dropDownBtn();
		dataStructureIntroPF.queue();

	}

	@Then("The user should land in the page selected in the dropdown list")
	public void the_user_should_land_in_the_page_selected_in_the_dropdown_list() {

		Assert.assertEquals("User is not on the Dashboard Page",UrlConstants.QUEUE_URL,
				dataStructureIntroPF.getCurrentUrl());

	}

	@Given("The user is in the Data Structures - Introduction page")
	public void the_user_is_in_the_data_structures_introduction_page() {

		dataStructureIntroPF.dataStrIntro_getStartedBtn();
		LoggerLoad.info("The user is in the Data Structures - Introduction page");

	}

	@When("The user clicks the Numpy Ninja on the top left corner of the page")
	public void the_user_clicks_the_numpy_ninja_on_the_top_left_corner_of_the_page() {

		dataStructureIntroPF.numpyNinjaBtn();

	}

	@Then("The user should land in the portal beginning page with Get Started Button")
	public void the_user_should_land_in_the_portal_beginning_page_with_get_started_button() {

		Assert.assertEquals("User is not on the Dashboard Page",UrlConstants.DS_ALGO_PORTAL_URL,
				dataStructureIntroPF.getCurrentUrl());

	}

}
