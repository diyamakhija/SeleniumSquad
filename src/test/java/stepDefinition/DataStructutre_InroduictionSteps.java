
package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LoginPagePF;
import utilities.DriverFactory;

public class DataStructutre_InroduictionSteps{
	
	WebDriver driver = DriverFactory.getDriver("chrome");
	LoginPagePF loginPagePF = new LoginPagePF(driver);

	@Given("The user enters the correct {string}")
	public void the_user_enters_the_correct(String URL)
	{
		driver.get("https://dsportalapp.herokuapp.com/");
   
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String getStartedBtn) 
	{
		loginPagePF.getStartedBtn();
	   
	}

	@Then("The user should be navigated to the {string} page which has the Register and Sign in links")
	public void the_user_should_be_navigated_to_the_page_which_displays_the_register_and_sign_in_links(String string) 
	{
		String expectedurl = "https://dsportalapp.herokuapp.com/home";
		String actualcurrenturl = driver.getCurrentUrl();
		System.out.println("The current page : " + actualcurrenturl);
		Assert.assertEquals("User is not on the Dashboard Page", expectedurl, actualcurrenturl);
	   
	}

	@Given("The user is in the Home page after sign in")
	public void the_user_is_in_the_home_page_after_sign_in() {
	   
	}

	@When("The user should click the Get Started button of the Data Structures - Introduction panel")
	public void the_user_should_click_the_get_started_button_of_the_data_structures_introduction_panel() {
	   
	}

	@Then("The user should land in Data Structures- Introduction Page")
	public void the_user_should_land_in_data_structures_introduction_page() {
	   
	}

	@Given("The user is in the Data Structures-Introduction page")
	public void the_user_is_in_the_data_structures_introduction_page() {
	   
	}

	@When("The user clicks Time Complexity button")
	public void the_user_clicks_time_complexity_button() {
	   
	}

	@Then("The user should be redirected to Time Complexity of Data structures-Introduction")
	public void the_user_should_be_redirected_to_time_complexity_of_data_structures_introduction() {
	   
	}

	@Given("The user is on the Time Complexity page")
	public void the_user_is_on_the_time_complexity_page() {
	   
	}

	@When("The user clicks Try Here buttton on theTime Complexity page")
	public void the_user_clicks_try_here_buttton_on_the_time_complexity_page() {
	   
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	   
	}

	@Given("The user is in the tryEditor page of Time Complexity")
	public void the_user_is_in_the_try_editor_page_of_time_complexity() {
	   
	}

	@When("The user clicks the Run Button without entering the code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
	   
	}

	@Then("The user should able to see an error message in alert window")
	public void the_user_should_able_to_see_an_error_message_in_alert_window() {
	   
	}

	@When("The user write the invalid code in Editor and click the Run Button")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button() {
	   
	}

	@Then("The user should able to see an name error message in alert window")
	public void the_user_should_able_to_see_an_name_error_message_in_alert_window() {
	   
	}

	@Then("The user should able to see an syntax error message in alert window")
	public void the_user_should_able_to_see_an_syntax_error_message_in_alert_window() {
	   
	}

	@When("The user write the valid code in Editor and click the Run Button")
	public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() {
	   
	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
	   
	}

	@Given("The user is in the Time Complexity page")
	public void the_user_is_in_the_time_complexity_page() {
	   
	}

	@When("The user clicks the Practice Questions button")
	public void the_user_clicks_the_practice_questions_button() {
	   
	}

	@Then("The user should be redirected to Practice Questions of Data structures-Introduction")
	public void the_user_should_be_redirected_to_practice_questions_of_data_structures_introduction() {
	   
	}

	@Given("The user is in the dropdown section")
	public void the_user_is_in_the_dropdown_section() {
	   
	}

	@When("The user selects the option from dropdown section")
	public void the_user_selects_the_option_from_dropdown_section() {
	   
	}

	@Then("The user should land in the page selected in the dropdown list")
	public void the_user_should_land_in_the_page_selected_in_the_dropdown_list() {
	   
	}

	@Given("The user is in the Data Structures - Introduction page")
	public void the_user_is_in_the_data_structures_introduction_page1() {
	   
	}

	@When("The user clicks the Numpy Ninja on the top left corner of the page")
	public void the_user_clicks_the_numpy_ninja_on_the_top_left_corner_of_the_page() {
	   
	}

	@Then("The user should land in the portal beginning page with Get Started Button")
	public void the_user_should_land_in_the_portal_beginning_page_with_get_started_button() {
	   
	}

	@Given("The user is in the Time Complexity page on one of the data structures")
	public void the_user_is_in_the_time_complexity_page_on_one_of_the_data_structures() {
	   
	}

	@When("The user clicks the Back button")
	public void the_user_clicks_the_back_button() {
	   
	}

	@Then("The user should be redirected to the Previous Page")
	public void the_user_should_be_redirected_to_the_previous_page() {
	   
	}



}


