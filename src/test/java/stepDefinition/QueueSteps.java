package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LoginPagePF;
import pageFactory.QueuePF;
import utilities.DriverFactory;

public class QueueSteps {
	WebDriver driver = DriverFactory.getDriver("chrome");
	LoginPagePF loginPagePF = new LoginPagePF(driver);
	QueuePF queuePF = new QueuePF(driver);

	@Given("The user enters the correct {string} in browser") 
	public void the_user_enters_the_correct(String url) {
		driver.get("https://dsportalapp.herokuapp.com/");
	}

	@When("The user clicks the {string} button in correct URL page")
	public void the_user_clicks_the_button(String getStartedBtn) {
		loginPagePF.getStartedBtn();

	}

	@Then("The user should be navigated to the {string} page which displays the Register and Sign in links")
	public void the_user_should_be_navigated_to_the_page_which_displays_the_register_and_sign_in_links(
			String homePage) {

		String expectedurl = "https://dsportalapp.herokuapp.com/home";
		String actualcurrenturl = driver.getCurrentUrl();
		System.out.println("The current page : " + actualcurrenturl);
		Assert.assertEquals("User is not on the Dashboard Page", expectedurl, actualcurrenturl);
	}

	@Given("The user is in the {string} after sign in with {string},{string}")
	public void the_user_is_in_the_after_sign_in_with(String homePage, String userName, String password) {
		driver.get("https://dsportalapp.herokuapp.com/");
		loginPagePF.loginallSteps(userName, password);
		String expectedurl = "https://dsportalapp.herokuapp.com/home";
		String actualcurrenturl = driver.getCurrentUrl();
		Assert.assertEquals("User is not on the Dashboard Page", expectedurl, actualcurrenturl);
		System.out.println("current page:" + actualcurrenturl);

	}

	@When("The user clicks the {string} button in Queue panel after log in with {string},{string}")
	public void the_user_clicks_the_button_in_queue_panel_after_log_in_with(String queuePage, String userName,
			String password) {

		queuePF.queue_getStartedBtn();
		String expectedurl = "https://dsportalapp.herokuapp.com/queue/";
		String actualcurrenturl = driver.getCurrentUrl();
		String actualPageurl = driver.getCurrentUrl();
		Assert.assertEquals("User is not on the Dashboard Page", expectedurl, actualcurrenturl);
		System.out.println("The current page is " + actualPageurl);

	}

	@Then("The user be directed to {string} Data Structure Home Page after log in with {string},{string}")
	public void the_user_be_directed_to_data_structure_home_page_after_log_in_with(String queuePage, String userName,
			String passWord) {

		String expectedurl = "https://dsportalapp.herokuapp.com/queue/";
		String actualcurrenturl = driver.getCurrentUrl();
		Assert.assertEquals("User is not on the Dashboard Page", expectedurl, actualcurrenturl);
		System.out.println("The current page is " + actualcurrenturl);

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
