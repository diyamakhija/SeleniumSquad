
package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.DataStructureIntroPF;
import pageFactory.LoginPagePF;
import utilities.ConfigReader;
import utilities.ExcelSheetReader;
import utilities.LoggerLoad;

public class DataStructureIntroSteps {

	LoginPagePF loginPagePF = new LoginPagePF();
	DataStructureIntroPF dataStructureIntroPF = new DataStructureIntroPF();
	ExcelSheetReader excelSheetReader = new ExcelSheetReader();
	ConfigReader configReader = new ConfigReader();
	LoggerLoad loggerLoad = new LoggerLoad();

	@Given("The user is in the Home page after sign in")
	public void the_user_is_in_the_home_page_after_sign_in() {

		LoggerLoad.info("The user is in the Home page after sign in");
	}

	@When("The user should click the Get Started button of the Data Structures - Introduction panel")
	public void the_user_should_click_the_get_started_button_of_the_data_structures_introduction_panel() {

		dataStructureIntroPF.dataStrIntro_getStartedBtn.click();
	}

	@Then("The user should land in Data Structures- Introduction Page")
	public void the_user_should_land_in_data_structures_introduction_page() {

		Assert.assertEquals("User is not on the Dashboard Page", ConfigReader.getexpectedurl2(),
				dataStructureIntroPF.getCurrentUrl());

	}

	@Given("The user is in the Data Structures-Introduction page")
	public void the_user_is_in_the_data_structures_introduction_page1() {

		dataStructureIntroPF.dataStrIntro_getStartedBtn.click();
		LoggerLoad.info("The user is in the Data Structures-Introduction page");

	}

	@When("The user clicks Time Complexity button")
	public void the_user_clicks_time_complexity_button() {

		dataStructureIntroPF.timeComplexityBtn.click();

	}

	@Then("The user should be redirected to Time Complexity of Data structures-Introduction")
	public void the_user_should_be_redirected_to_time_complexity_of_data_structures_introduction() {

		Assert.assertEquals("User is not on the Dashboard Page", ConfigReader.getexpectedurl3(),
				dataStructureIntroPF.getCurrentUrl());

	}

	@Given("The user is on the Time Complexity page")
	public void the_user_is_on_the_time_complexity_page() {

		dataStructureIntroPF.dataStrIntro_getStartedBtn.click();
		dataStructureIntroPF.timeComplexityBtn.click();
		LoggerLoad.info("The user is on the Time Complexity page");
	}

	@When("The user clicks Try Here buttton on theTime Complexity page")
	public void the_user_clicks_try_here_buttton_on_the_time_complexity_page() {

		dataStructureIntroPF.tryHereBtn.click();

	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {

		Assert.assertEquals("User is not on the Dashboard Page", ConfigReader.getexpectedurl4(),
				dataStructureIntroPF.getCurrentUrl());

	}

	@Given("The user is in the tryEditor page of Time Complexity")
	public void the_user_is_in_the_try_editor_page_of_time_complexity() {

		dataStructureIntroPF.dataStrIntro_getStartedBtn.click();
		dataStructureIntroPF.timeComplexityBtn.click();
		dataStructureIntroPF.tryHereBtn.click();

		LoggerLoad.info("The user is in the tryEditor page of Time Complexity");

	}

	@When("The user clicks the Run Button without entering the code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {

		dataStructureIntroPF.runBtn.click();
	}

	@Then("The user should able to see  an error message in alert window")
	public void the_user_should_able_to_see_an_error_message_in_alert_window() {

		dataStructureIntroPF.handleAlert("error");

	}

	@When("The user write the invalid code in Editor and click the Run Button")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button() {

		dataStructureIntroPF.input.sendKeys(ExcelSheetReader.pythonCodeData(2).get(0));
		dataStructureIntroPF.runBtn.click();

	}

	@Then("The user should able to see an name error message in alert window")
	public void the_user_should_able_to_see_an_name_error_message_in_alert_window() {

		dataStructureIntroPF.handleAlert(ExcelSheetReader.pythonCodeData(2).get(1));
		Assert.assertEquals("User is not on the Dashboard Page", ConfigReader.getexpectedurl4(),
				dataStructureIntroPF.getCurrentUrl());

	}

	@Then("The user should able to see an syntax error message in alert window")
	public void the_user_should_able_to_see_an_syntax_error_message_in_alert_window() {

		dataStructureIntroPF.handleAlert(ExcelSheetReader.pythonCodeData(2).get(1));
		Assert.assertEquals("User is not on the Dashboard Page", ConfigReader.getexpectedurl4(),
				dataStructureIntroPF.getCurrentUrl());

	}

	@When("The user write the valid code in Editor and click the Run Button")
	public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() {
		dataStructureIntroPF.input.sendKeys(ExcelSheetReader.pythonCodeData(1).get(0));
		dataStructureIntroPF.runBtn.click();

	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {

		System.out.println(ExcelSheetReader.pythonCodeData(1).get(1));
		Assert.assertEquals(ExcelSheetReader.pythonCodeData(1).get(1),dataStructureIntroPF.output.getText());

	
	}

	@Given("The user is in the Time Complexity page")
	public void the_user_is_in_the_time_complexity_page() {
		dataStructureIntroPF.dataStrIntro_getStartedBtn.click();
		dataStructureIntroPF.timeComplexityBtn.click();

	}

	@When("The user clicks the Practice Questions button")
	public void the_user_clicks_the_practice_questions_button() {
		dataStructureIntroPF.practiceQuestionsBtn.click();

	}

	@Then("The user should be redirected to Practice Questions of Data structures-Introduction")
	public void the_user_should_be_redirected_to_practice_questions_of_data_structures_introduction() {

		Assert.assertEquals("User is not on the Dashboard Page", ConfigReader.getexpectedurl5(),
				dataStructureIntroPF.getCurrentUrl());

	}

	@Given("The user is in the dropdown section")
	public void the_user_is_in_the_dropdown_section() {
		
		LoggerLoad.info("The user is in the Home page after sign in");
		

	}

	@When("The user selects the option from dropdown section")
	public void the_user_selects_the_option_from_dropdown_section() {
		dataStructureIntroPF.dropDownBtn.click();
		dataStructureIntroPF.queueOption.click();
		

	}

	@Then("The user should land in the page selected in the dropdown list")
	public void the_user_should_land_in_the_page_selected_in_the_dropdown_list() {

		Assert.assertEquals("User is not on the Dashboard Page", ConfigReader.getexpectedurl6(),
				dataStructureIntroPF.getCurrentUrl());

	}

	@Given("The user is in the Data Structures - Introduction page")
	public void the_user_is_in_the_data_structures_introduction_page() {
		dataStructureIntroPF.dataStrIntro_getStartedBtn.click();
		Assert.assertEquals("User is not on the Dashboard Page", ConfigReader.getexpectedurl2(),
				dataStructureIntroPF.getCurrentUrl());
		

	}

	@When("The user clicks the Numpy Ninja on the top left corner of the page")
	public void the_user_clicks_the_numpy_ninja_on_the_top_left_corner_of_the_page() {
		
		dataStructureIntroPF.numpyNinjaBtn.click();

	}

	@Then("The user should land in the portal beginning page with Get Started Button")
	public void the_user_should_land_in_the_portal_beginning_page_with_get_started_button() {

		Assert.assertEquals("User is not on the Dashboard Page", ConfigReader.getPageURL(),
				dataStructureIntroPF.getCurrentUrl());

	}

	}


