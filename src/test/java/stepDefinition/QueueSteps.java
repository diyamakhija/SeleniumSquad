package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LoginPagePF;
import pageFactory.QueuePF;

public class QueueSteps {

	LoginPagePF loginPagePF = new LoginPagePF();
	QueuePF queuePF = new QueuePF();

	@Given("The user is in the {string} after sign in")
	public void the_user_is_in_the_after_sign_in(String string) {
		
	}    

	@When("The user clicks the {string} button in Queue panel")
	public void the_user_clicks_the_button_in_queue_panel(String string) {
		queuePF.queue_getStartedBtn.click();
	}

	@Then("The user be directed to {string} Data Structure Home Page")
	public void the_user_be_directed_to_data_structure_home_page(String string) {
		// TODO: Need to come from excel sheet
		String expectedurl = "https://dsportalapp.herokuapp.com/queue/";

		Assert.assertEquals("User is not on the Dashboard Page", expectedurl, queuePF.getCurrentUrl());

	}

	@Given("The user is in the {string} page after Sign in with {string},{string}")
	public void the_user_is_in_the_page_after_sign_in_with(String string, String string2, String string3) {

	}

	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {

	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {

	}

	@Given("The user is in the Implementation of Queue in Python page")
	public void the_user_is_in_the_implementation_of_queue_in_python_page() {

	}

	@When("The user clicks Try Here button in Implementation of Queue in Python page")
	public void the_user_clicks_try_here_button_in_implementation_of_queue_in_python_page() {

	}

	@Then("The user should be redirected to a page having an try Editor with a {string} button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_button_to_test(String string) {

	}

	@Given("The user is in the tryEditor page of Implementation of Queue in Python")
	public void the_user_is_in_the_try_editor_page_of_implementation_of_queue_in_python() {

	}

	@When("The user clicks the Run Button without entering the code in the Editor page")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_page() {

	}

	@Then("The user should able to see and error message in alert window")
	public void the_user_should_able_to_see_and_error_message_in_alert_window() {

	}

	@When("The user write the invalid code in Editor and click the {string} Button")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_button(String string) {

	}

	@Then("The user should able to see an {string} in alert window")
	public void the_user_should_able_to_see_an_in_alert_window(String string) {

	}

	@When("The user write the valid code in Editor and click the {string} Button")
	public void the_user_write_the_valid_code_in_editor_and_click_the_button(String string) {

	}

	@Then("The user should able to {string} in the console")
	public void the_user_should_able_to_in_the_console(String string) {

	}

	@Given("The user is in the Queue page after Sign in")
	public void the_user_is_in_the_queue_page_after_sign_in() {

	}

	@When("The user clicks Implementation using collections.deque button")
	public void the_user_clicks_implementation_using_collections_deque_button() {

	}

	@Then("The user should be redirected to Implementation using collections.deque page")
	public void the_user_should_be_redirected_to_implementation_using_collections_deque_page() {

	}

	@Given("The user is on the Implementation using collections.deque page")
	public void the_user_is_on_the_implementation_using_collections_deque_page() {

	}

	@When("The user clicks Try Here buttton on the Implementation using collections.deque page")
	public void the_user_clicks_try_here_buttton_on_the_implementation_using_collections_deque_page() {

	}

	@Given("The user is in the tryEditor page of Implementation using collections.deque")
	public void the_user_is_in_the_try_editor_page_of_implementation_using_collections_deque() {

	}

	@When("The user clicks the {string} Button without entering the code in the Editor")
	public void the_user_clicks_the_button_without_entering_the_code_in_the_editor(String string) {

	}

	@When("The user clicks Implementation using Array button")
	public void the_user_clicks_implementation_using_array_button() {

	}

	@Then("The user should be redirected to Implementation using Array page")
	public void the_user_should_be_redirected_to_implementation_using_array_page() {

	}

	@Given("The user is on the Implementation using Array page")
	public void the_user_is_on_the_implementation_using_array_page() {

	}

	@When("The user clicks {string} button in Implementation using Array page")
	public void the_user_clicks_button_in_implementation_using_array_page(String string) {

	}

	@Given("The user is in the {string} page of Implementation of Queue in Python")
	public void the_user_is_in_the_page_of_implementation_of_queue_in_python(String string) {

	}

	@When("The user clicks the {string} Button without entering the code in the Editor page")
	public void the_user_clicks_the_button_without_entering_the_code_in_the_editor_page(String string) {

	}

	@Given("The user is in the tryEditor page of Implementation using Array")
	public void the_user_is_in_the_try_editor_page_of_implementation_using_array() {

	}

	@When("The user clicks  Queue Operations button")
	public void the_user_clicks_queue_operations_button() {

	}

	@Then("The user should be redirected to  Queue Operations  page")
	public void the_user_should_be_redirected_to_queue_operations_page() {

	}

	@Given("The user is on the  Queue Operations page")
	public void the_user_is_on_the_queue_operations_page() {

	}

	@When("The user clicks {string} button in  Queue Operations page")
	public void the_user_clicks_button_in_queue_operations_page(String string) {

	}

	@Then("The user should be redirected to a page having an {string} with a {string} button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_with_a_button_to_test(String string, String string2) {

	}

	@Given("The user is in the tryEditor page of  Queue Operations")
	public void the_user_is_in_the_try_editor_page_of_queue_operations() {

	}

	@When("The user clicks Practice Questions button")
	public void the_user_clicks_practice_questions_button() {

	}

	@Then("The user should be redirected to Practice Questions page")
	public void the_user_should_be_redirected_to_practice_questions_page() {

	}

	@Given("The user is in the  Queue Operations page on one of the data structures")
	public void the_user_is_in_the_queue_operations_page_on_one_of_the_data_structures() {

	}

	@When("The user clicks the {string}")
	public void the_user_clicks_the(String string) {

	}

	@Then("The user should be redirected to the {string}")
	public void the_user_should_be_redirected_to_the(String string) {

	}

	@When("The user clicks the {string} on the top left corner of the page")
	public void the_user_clicks_the_on_the_top_left_corner_of_the_page(String string) {

	}

	@Then("The user should land in the portal beginning page which has Get Started Button")
	public void the_user_should_land_in_the_portal_beginning_page_which_has_get_started_button() {

	}

	@Given("The user is in the {string} section")
	public void the_user_is_in_the_section(String string) {

	}

	@When("The user selects the {string} from dropdown section")
	public void the_user_selects_the_from_dropdown_section(String string) {

	}

	@Then("The user should land in the page selected in the dropdown list.")
	public void the_user_should_land_in_the_page_selected_in_the_dropdown_list() {

	}

}