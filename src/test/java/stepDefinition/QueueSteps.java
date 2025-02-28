package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.DataStructureIntroPF;
import pageFactory.LoginPagePF;
import pageFactory.QueuePF;
import utilities.ConfigReader;
import utilities.ExcelSheetReader;
import utilities.LoggerLoad;

public class QueueSteps {
	LoginPagePF loginPagePF = new LoginPagePF();
	QueuePF queuePF = new QueuePF();
	ExcelSheetReader excelSheetReader = new ExcelSheetReader();
	ConfigReader configReader = new ConfigReader();
	LoggerLoad loggerLoad = new LoggerLoad();

	@Given("The user is in the {string} after sign in")
	public void the_user_is_in_the_after_sign_in(String string) {
		LoggerLoad.info("The user is in the home page after signin");

	}

	@When("The user clicks the {string} button in Queue panel 	+")
	public void the_user_clicks_the_button_in_queue_panel(String string) {
		queuePF.queue_getStartedBtn.click();

	}

	@Then("The user be directed to {string} Data Structure Home Page")
	public void the_user_be_directed_to_data_structure_home_page(String string) {

		Assert.assertEquals("User is not on the Dashboard Page", ConfigReader.getexpectedurl6(),
				queuePF.getCurrentUrl());

	}

	@Given("The user is in the {string} page after Sign in")
	public void the_user_is_in_the_page_after_sign_in(String string) {

		queuePF.queue_getStartedBtn.click();

	}

	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
		queuePF.implementationOfQueueInPythonBtn.click();

	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
		Assert.assertEquals("User is not on the Dashboard Page", ConfigReader.getexpectedurl7(),
				queuePF.getCurrentUrl());

	}

	@Given("The user is in the Implementation of Queue in Python page")
	public void the_user_is_in_the_implementation_of_queue_in_python_page() {
		queuePF.queue_getStartedBtn.click();
		queuePF.implementationOfQueueInPythonBtn.click();

	}

	@When("The user clicks Try Here button in Implementation of Queue in Python page")
	public void the_user_clicks_try_here_button_in_implementation_of_queue_in_python_page() {
		queuePF.tryHereBtn.click();

	}

	@Then("The user should be redirected to a page having an try Editor with a {string} button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_button_to_test(String string) {

		Assert.assertEquals("User is not on the Dashboard Page", ConfigReader.getexpectedurl4(),
				queuePF.getCurrentUrl());

	}

	@Given("The user is in the tryEditor page of Implementation of Queue in Python")
	public void the_user_is_in_the_try_editor_page_of_implementation_of_queue_in_python() {

		queuePF.queue_getStartedBtn.click();
		queuePF.implementationUsingArray.click();
		queuePF.tryHereBtn.click();
		LoggerLoad.info("The user is in the tryEditor page of Implementation using Array pagen");

	}

	@When("The user clicks the Run Button without entering the code in the Editor page")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_page() {
		queuePF.runBtn.click();

	}

	@Then("The user should able to see and error message in alert window")
	public void the_user_should_able_to_see_and_error_message_in_alert_window() {
		queuePF.handleAlert("error");
		Assert.assertEquals("User is not on the Dashboard Page", ConfigReader.getexpectedurl4(),
				queuePF.getCurrentUrl());

	}

	@When("The user write the invalid name code in Editor and click the Run Button")
	public void the_user_write_the_invalid_name_code_in_editor_and_click_the_run_button() {
		queuePF.input.sendKeys(ExcelSheetReader.pythonCodeData(2).get(0));
		queuePF.runBtn.click();

	}

	@Then("The user should able to see a name error message in alert window")
	public void the_user_should_able_to_see_a_name_error_message_in_alert_window() {
		queuePF.handleAlert(ExcelSheetReader.pythonCodeData(2).get(1));

	}

	@When("The user write the invalid syntax code in Editor and click the Run Button")
	public void the_user_write_the_invalid_syntax_code_in_editor_and_click_the_run_button() {

		queuePF.input.sendKeys(ExcelSheetReader.pythonCodeData(3).get(0));
		queuePF.runBtn.click();
	}

	@Then("The user should able to see a syntax error msg in alert window")
	public void the_user_should_able_to_see_a_syntax_error_msg_in_alert_window() {
		queuePF.handleAlert(ExcelSheetReader.pythonCodeData(3).get(1));

	}

	@When("The user write the valid code in Editor and click the {string} Button")
	public void the_user_write_the_valid_code_in_editor_and_click_the_button(String string) {
		queuePF.input.sendKeys(ExcelSheetReader.pythonCodeData(1).get(0));
		queuePF.runBtn.click();

	}

	@Then("The user should able to {string} in the console")
	public void the_user_should_able_to_in_the_console(String string) {

		Assert.assertEquals(ExcelSheetReader.pythonCodeData(1).get(1), queuePF.output.getText());

	}

	@Given("The user is in the Queue page after Sign in")
	public void the_user_is_in_the_queue_page_after_sign_in() {
		queuePF.queue_getStartedBtn.click();
		
		Assert.assertEquals("User is not on the Dashboard Page", ConfigReader.getexpectedurl6(),
				queuePF.getCurrentUrl());

	}

	@When("The user clicks Implementation using collections.deque button")
	public void the_user_clicks_implementation_using_collections_deque_button() {
		queuePF.implementationUsingCollectionsDeque.click();

	}

	@Then("The user should be redirected to Implementation using collections.deque page")
	public void the_user_should_be_redirected_to_implementation_using_collections_deque_page() {
		Assert.assertEquals("User is not on the Dashboard Page", ConfigReader.getexpectedurl8(),
				queuePF.getCurrentUrl());

	}

	@Given("The user is on the Implementation using collections.deque page")
	public void the_user_is_on_the_implementation_using_collections_deque_page() {
		queuePF.queue_getStartedBtn.click();
		queuePF.implementationUsingCollectionsDeque.click();


	}

	@When("The user clicks Try Here buttton on the Implementation using collections.deque page")
	public void the_user_clicks_try_here_buttton_on_the_implementation_using_collections_deque_page() {
		queuePF.tryHereBtn.click();

	}

	@Given("The user is in the tryEditor page of Implementation using collections.deque")
	public void the_user_is_in_the_try_editor_page_of_implementation_using_collections_deque() {
		queuePF.queue_getStartedBtn.click();
		queuePF.implementationUsingCollectionsDeque.click();
		queuePF.tryHereBtn.click();
		LoggerLoad.info("The user is in the tryEditor page of Implementation using collections.deque");

	}

	@When("The user clicks Implementation using Array button")
	public void the_user_clicks_implementation_using_array_button() {
		queuePF.implementationUsingArray.click();

	}

	@Then("The user should be redirected to Implementation using Array page")
	public void the_user_should_be_redirected_to_implementation_using_array_page() {
		Assert.assertEquals("User is not on the Dashboard Page", ConfigReader.getexpectedurl9(),
				queuePF.getCurrentUrl());
		

	}

	@Given("The user is on the Implementation using Array page")
	public void the_user_is_on_the_implementation_using_array_page() {
		queuePF.queue_getStartedBtn.click();
		queuePF.implementationUsingArray.click();

	}
	
	@Given("The user is in the tryEditor page of Implementation using Array page")
	public void the_user_is_in_the_try_editor_page_of_implementation_using_array_page() {
		queuePF.queue_getStartedBtn.click();
		queuePF.implementationUsingArray.click();
		queuePF.tryHereBtn.click();

	}
	@When("The user clicks {string} button in Implementation using Array page")
	public void the_user_clicks_button_in_implementation_using_array_page(String string) {
		queuePF.tryHereBtn.click();

	}


	@When("The user clicks  Queue Operations button")
	public void the_user_clicks_queue_operations_button() {
		queuePF.queueOperations.click();

	}

	@Then("The user should be redirected to  Queue Operations  page")
	public void the_user_should_be_redirected_to_queue_operations_page() {
		Assert.assertEquals("User is not on the Dashboard Page", ConfigReader.getexpectedurl10(),
				queuePF.getCurrentUrl());

	}

	@Given("The user is on the  Queue Operations page")
	public void the_user_is_on_the_queue_operations_page() {
		queuePF.queue_getStartedBtn.click();
		queuePF.queueOperations.click();

	}

	@When("The user clicks {string} button in  Queue Operations page")
	public void the_user_clicks_button_in_queue_operations_page(String string) {
		queuePF.tryHereBtn.click();

	}

	@Then("The user should be redirected to a page having an {string} with a {string} button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_with_a_button_to_test(String string, String string2) {
		Assert.assertEquals("User is not on the Dashboard Page", ConfigReader.getexpectedurl4(),
				queuePF.getCurrentUrl());

	}

	@Given("The user is in the tryEditor page of  Queue Operations")
	public void the_user_is_in_the_try_editor_page_of_queue_operations() {
		queuePF.queue_getStartedBtn.click();
		queuePF.queueOperations.click();
		queuePF.tryHereBtn.click();


	}

	@When("The user clicks Practice Questions button")
	public void the_user_clicks_practice_questions_button() {
		queuePF.practiceQuestionsBtn.click();
		
	}

	@Then("The user should be redirected to Practice Questions page")
	public void the_user_should_be_redirected_to_practice_questions_page() {
		Assert.assertEquals("User is not on the Dashboard Page", ConfigReader.getexpectedurl11(),
				queuePF.getCurrentUrl());

	}


	@When("The user clicks the {string} on the top left corner of the page")
	public void the_user_clicks_the_on_the_top_left_corner_of_the_page(String string) {
		queuePF.numpyNinjaBtn.click();

	}

	@Then("The user should land in the portal beginning page which has Get Started Button")
	public void the_user_should_land_in_the_portal_beginning_page_which_has_get_started_button() {
		Assert.assertEquals("User is not on the Dashboard Page", ConfigReader.getPageURL(),
				queuePF.getCurrentUrl());


	}

	@Given("The user is in the {string} section")
	public void the_user_is_in_the_section(String string) {
		queuePF.queue_getStartedBtn.click();
		queuePF.dropDownBtn.click();
		Assert.assertEquals("User is not on the Dashboard Page", ConfigReader.getexpectedurl6(),
				queuePF.getCurrentUrl());

	}

	@When("The user selects the {string} from dropdown section")
	public void the_user_selects_the_from_dropdown_section(String string) {
		
		queuePF.treeOption.click();

	}

	@Then("The user should land in the page selected in the dropdown list.")
	public void the_user_should_land_in_the_page_selected_in_the_dropdown_list() {
		Assert.assertEquals("User is not on the Dashboard Page", ConfigReader.getexpectedurl12(),
				queuePF.getCurrentUrl());


	}

}