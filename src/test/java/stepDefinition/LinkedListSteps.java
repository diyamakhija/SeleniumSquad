package stepDefinition;

import org.junit.Assert;

import constants.UrlConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LinkedListPF;
import pageFactory.LoginPagePF;
import utilities.LoggerLoad;

public class LinkedListSteps {

	LoginPagePF loginPagePF = new LoginPagePF();
	LinkedListPF linkedListPF = new LinkedListPF();
	LoggerLoad loggerLoad = new LoggerLoad();

	@Given("The user is in the Homepage after Sign in")
	public void the_user_is_in_the_homepage_after_sign_in() {

		LoggerLoad.info("The user is in the home page after signin");

	}

	@When("The user clicks the Get Started button in Linked List panel")
	public void the_user_clicks_the_get_started_button_in_linked_list_panel() {

		linkedListPF.linkedListGetStartedBtn();

	}

	@Then("The user should land in Linked List Page")
	public void the_user_should_land_in_linked_list_page() {

		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.LINKED_LIST_URL, linkedListPF.getCurrentUrl());

	}

	@Given("The user is in the Linked list page")
	public void the_user_is_in_the_linked_list_page() {

		LoggerLoad.info("The user is in the Linked list page after Sign in");
		linkedListPF.linkedListGetStartedBtn();

	}

	@When("The user clicks Introduction button")
	public void the_user_clicks_introduction_button() {

		linkedListPF.introductionBtn();

	}

	@Then("The user should be redirected to Introduction page")
	public void the_user_should_be_redirected_to_introduction_page() {

		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.LINKED_LIST_INTRO_URL, linkedListPF.getCurrentUrl());

	}

	@Given("The user is on the Introduction page")
	public void the_user_is_on_the_introduction_page() {

		LoggerLoad.info("The user is in the Introduction page after Sign in");
		linkedListPF.linkedListGetStartedBtn();
		linkedListPF.introductionBtn();

	}

	@When("The user clicks Try Here button in Introduction page")
	public void the_user_clicks_try_here_button_in_introduction_page() {

		linkedListPF.tryHereBtn();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test for list")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_for_list() {

		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.TRYEDITOR_URL, linkedListPF.getCurrentUrl());

	}

	@Given("The user is in the tryEditor page for Introduction page")
	public void the_user_is_in_the_try_editor_page_for_introduction_page() {

		linkedListPF.linkedListGetStartedBtn();
		linkedListPF.introductionBtn();
		linkedListPF.tryHereBtn();

	}

	@When("The user clicks the Run button without entering the code in the Editor for list")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_for_list() {

		linkedListPF.runBtn();
	}

	@Then("The user should able to see  an error message in alert window based on {string} at row {int} for Linked List")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_based_on_at_row_for_linked_list(
			String sheetName, Integer rowNumber) {

		Assert.assertEquals("An unexpected error occurred:", linkedListPF.handleAlert1(),
				linkedListPF.expectedResult(sheetName,rowNumber));

	}

	@When("The user writes the invalid name code in the Editor from {string} at row {int} , then clicks the Run Button for Linked List")
	public void the_user_writes_the_invalid_name_code_in_the_editor_from_at_row_then_clicks_the_run_button_for_linked_list(
			String sheetName, Integer rowNumber) {

		linkedListPF.codeEditorInput(sheetName, rowNumber);
		linkedListPF.runBtn();
	}

	@Then("The user should see a NameError message in the alert window based on {string} at row {int} for Linked List")
	public void the_user_should_see_a_name_error_message_in_the_alert_window_based_on_at_row_for_linked_list(
			String sheetName, Integer rowNumber) {

		Assert.assertEquals("An unexpected error occurred:", linkedListPF.nameHandleAlert(),
				linkedListPF.expectedResult(sheetName,rowNumber));

	}

	@When("The user write the invalid syntaxcode in Editor from {string} at row {int} , then clicks the Run Button for Linked List")
	public void the_user_write_the_invalid_syntaxcode_in_editor_from_at_row_then_clicks_the_run_button_for_linked_list(
			String sheetName, Integer rowNumber) {

		linkedListPF.codeEditorInput(sheetName, rowNumber);
		linkedListPF.runBtn();
	}

	@Then("The user should able to see an syntax error message in alert window based on {string} at row {int} for Linked List")
	public void the_user_should_able_to_see_an_syntax_error_message_in_alert_window_based_on_at_row_for_linked_list(
			String sheetName, Integer rowNumber) {

		Assert.assertEquals("An unexpected error occurred:", linkedListPF.syntaxHandleAlert(),
				linkedListPF.expectedResult(sheetName,rowNumber));

	}

	@When("The user write the valid code in Editorfrom {string} at row {int} , then clicks the Run Button for Linked List")
	public void the_user_write_the_valid_code_in_editorfrom_at_row_then_clicks_the_run_button_for_linked_list(
			String sheetName, Integer rowNumber) {

		linkedListPF.codeEditorInput(sheetName, rowNumber);
		linkedListPF.runBtn();

	}

	@Then("The user write the valid code in Editorform {string} at row {int} , then clicks the Run Button  for Linked List")
	public void the_user_write_the_valid_code_in_editorform_at_row_then_clicks_the_run_button_for_linked_list(
			String sheetName, Integer rowNumber) {

		Assert.assertEquals(linkedListPF.expectedResult(sheetName,rowNumber), linkedListPF.output.getText());

	}

	@Given("The user is in the  Linked list page after sign in")
	public void the_user_is_in_the_linked_list_page_after_sign_in() {

		LoggerLoad.info("The user is in the Linked list page after sign in");
		linkedListPF.linkedListGetStartedBtn();

	}

	@When("The user clicks Creating Linked List button")
	public void the_user_clicks_creating_linked_list_button() {

		linkedListPF.creatingLinkedListBtn();

	}

	@Then("The user should be redirected to Creating Linked List page")
	public void the_user_should_be_redirected_to_creating_linked_list_page() {

		Assert.assertEquals("The user should be redirected to Implementation using collections.deque page",
				UrlConstants.LINKED_LIST_CREATING_LINKED_LIST_URL, linkedListPF.getCurrentUrl());
	}

	@Given("The user is on the Creating Linked List page")
	public void the_user_is_on_the_creating_linked_list_page() {

		LoggerLoad.info("The user is on the Creating Linked List page");
		linkedListPF.linkedListGetStartedBtn();
		linkedListPF.creatingLinkedListBtn();

	}

	@When("The user clicks Try Here button in Creating Linked List page")
	public void the_user_clicks_try_here_button_in_creating_linked_list_page() {

		linkedListPF.tryHereBtn();

	}

	@Given("The user is in the tryEditor page for Creating Linked List page")
	public void the_user_is_in_the_try_editor_page_for_creating_linked_list_page() {

		linkedListPF.linkedListGetStartedBtn();
		linkedListPF.creatingLinkedListBtn();
		linkedListPF.tryHereBtn();

	}

	@When("The user clicks Types of Linked List button")
	public void the_user_clicks_types_of_linked_list_button() {

		linkedListPF.typesOfLinkedListBtn();
	}

	@Then("The user should be redirected to Types of Linked List page")
	public void the_user_should_be_redirected_to_types_of_linked_list_page() {

		Assert.assertEquals("The user should be redirected to Implementation using collections.deque page",
				UrlConstants.LINKED_LIST_TYPES_OF_LINKED_LIST_URL, linkedListPF.getCurrentUrl());
	
	}

	@Given("The user is on the Types of Linked List page")
	public void the_user_is_on_the_types_of_linked_list_page() {

		LoggerLoad.info("The user is on the Types of Linked List page");
		linkedListPF.linkedListGetStartedBtn();
		linkedListPF.typesOfLinkedListBtn();

	}

	@When("The user clicks Try Here button in Types of Linked List page")
	public void the_user_clicks_try_here_button_in_types_of_linked_list_page() {

		linkedListPF.tryHereBtn();

	}

	@Given("The user is in the tryEditor page for Types of Linked List page")
	public void the_user_is_in_the_try_editor_page_for_types_of_linked_list_page() {

		linkedListPF.linkedListGetStartedBtn();
		linkedListPF.typesOfLinkedListBtn();
		linkedListPF.tryHereBtn();
	}

	@When("The user clicks Implement Linked list in Python button")
	public void the_user_clicks_implement_linked_list_in_python_button() {

		linkedListPF.implementLinkedListInPythonBtn();

	}

	@Then("The user should be redirected to Implement Linked list in Python page")
	public void the_user_should_be_redirected_to_implement_linked_list_in_python_page() {

		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.LINKED_LIST_IMPLEMENT_LINKEDLIST_IN_PYTHON_URL, linkedListPF.getCurrentUrl());

	}

	@Given("The user is on the Implement Linked list in Python page")
	public void the_user_is_on_the_implement_linked_list_in_python_page() {

		LoggerLoad.info("The user is on the Implement Linked list in Python page");
		linkedListPF.linkedListGetStartedBtn();
		linkedListPF.implementLinkedListInPythonBtn();

	}

	@When("The user clicks Try Here button in Implement Linked list in Python page")
	public void the_user_clicks_try_here_button_in_implement_linked_list_in_python_page() {

		linkedListPF.tryHereBtn();

	}

	@Given("The user is in the tryEditor page for Implement Linked List in Python page")
	public void the_user_is_in_the_try_editor_page_for_implement_linked_list_in_python_page() {

		LoggerLoad.info("The user is in the tryEditor page for Implement Linked List in Python page");

		linkedListPF.linkedListGetStartedBtn();
		linkedListPF.implementLinkedListInPythonBtn();
		linkedListPF.tryHereBtn();

	}

	@When("The user clicks Traversal button")
	public void the_user_clicks_traversal_button() {

		linkedListPF.traversalBtn();

	}

	@Then("The user should be redirected to Traversal page")
	public void the_user_should_be_redirected_to_traversal_page() {


		Assert.assertEquals("User is not on the Dashboard Page",UrlConstants.LINKED_LIST_TRAVERSAL_URL, linkedListPF.getCurrentUrl());

	}

	@Given("The user is on the Traversal page")
	public void the_user_is_on_the_traversal_page() {

		LoggerLoad.info("The user is on the Traversal page");
		linkedListPF.linkedListGetStartedBtn();
		linkedListPF.traversalBtn();

	}

	@When("The user clicks Try Here button in Traversal page")
	public void the_user_clicks_try_here_button_in_traversal_page() {

		linkedListPF.tryHereBtn();

	}

	@Given("The user is in the tryEditor page for Traversal page")
	public void the_user_is_in_the_try_editor_page_for_traversal_page() {

		LoggerLoad.info("The user is in the tryEditor page for Traversal page");
		linkedListPF.linkedListGetStartedBtn();
		linkedListPF.traversalBtn();
		linkedListPF.tryHereBtn();
	}

	@When("The user clicks Insertion button")
	public void the_user_clicks_insertion_button() {

		linkedListPF.insertionBtn();

	}

	@Then("The user should be redirected to Insertion page")
	public void the_user_should_be_redirected_to_insertion_page() {

		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.LINKED_LIST_INSERTION_IN_LINKED_LIST_URL, linkedListPF.getCurrentUrl());

	}

	@Given("The user is on the Insertion page")
	public void the_user_is_on_the_insertion_page() {

		LoggerLoad.info("The user is on the Insertion page");
		linkedListPF.linkedListGetStartedBtn();
		linkedListPF.insertionBtn();
	}

	@When("The user clicks Try Here button in Insertion page")
	public void the_user_clicks_try_here_button_in_insertion_page() {

		linkedListPF.tryHereBtn();

	}

	@Given("The user is in the tryEditor page for Insertion page")
	public void the_user_is_in_the_try_editor_page_for_insertion_page() {

		linkedListPF.linkedListGetStartedBtn();
		linkedListPF.insertionBtn();
		linkedListPF.tryHereBtn();

	}

	@When("The user clicks Deletion button")
	public void the_user_clicks_deletion_button() {

		linkedListPF.DeletionBtn();
	}

	@Then("The user should be redirected to Deletion page")
	public void the_user_should_be_redirected_to_deletion_page() {

		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.LINKED_LIST_DELETION_IN_LINKED_LIST_URL, linkedListPF.getCurrentUrl());

	}

	@Given("The user is on the Deletion page")
	public void the_user_is_on_the_deletion_page() {

		LoggerLoad.info("The user is on the Deletion page");
		linkedListPF.linkedListGetStartedBtn();
		linkedListPF.DeletionBtn();

	}

	@When("The user clicks Try Here button in Deletion page")
	public void the_user_clicks_try_here_button_in_deletion_page() {

		linkedListPF.tryHereBtn();
	}

	@Given("The user is in the tryEditor page for Deletion page")
	public void the_user_is_in_the_try_editor_page_for_deletion_page() {

		linkedListPF.linkedListGetStartedBtn();
		linkedListPF.DeletionBtn();
		linkedListPF.tryHereBtn();

	}

	@When("The user clicks Practice Questions for Linked List")
	public void the_user_clicks_practice_questions_for_linked_list() {

		linkedListPF.practiceQuestionsBtn();

	}

	@Then("The user should be redirected to practice Questions Page")
	public void the_user_should_be_redirected_to_practice_questions_page() {

		Assert.assertEquals("User is not on the Dashboard Page", UrlConstants.LINKED_LIST_PRACTICE_URL, linkedListPF.getCurrentUrl());

	}

}
