package stepDefinition;

import org.junit.Assert;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LoginPagePF;
import pageFactory.QueuePF;
import pageFactory.TreePF;
import utilities.ExcelSheetReader;
import utilities.LoggerLoad;

public class TreeSteps {
	LoginPagePF loginPagePF = new LoginPagePF();
	TreePF tree = new TreePF();
	LoggerLoad loggerLoad = new LoggerLoad();
	

	@Given("The user is in the Homepage after sign in")
	public void the_user_is_in_the_homepage_after_sign_in() {
		
		LoggerLoad.info("The user is in the Home page after sign in");
	}

	@When("The user clicks the GetStarted button in Tree Panel")
	public void the_user_clicks_the_get_started_button_in_tree_panel() {
		
	//	tree.clickTreeGetStarted();
	}

	@Then("The user is navigate to Tree Page")
	public void the_user_is_navigate_to_tree_page() {
//		 Assert.assertEquals("User is not on the Overview of Trees Page", 
//	                ConfigReader.getexpectedurl2(), tree.getCurrentUrl());
    System.out.println(tree.getCurrentUrl());

	}


	@Given("The user clicks Over View of Trees Page")
	public void the_user_clicks_over_view_of_trees_Page() {
		tree.clickTreeGetStarted();
		LoggerLoad.info("The user clicks Over View of Trees Page");
		System.out.println(tree.getCurrentUrl());
				
	}

	@When("The user clicks Over View of Trees button")
	public void the_user_clicks_over_view_of_trees_button() {
	//	LoggerLoad.info("Clicking Overview of Trees...");
      //tree.clickOverviewOfTrees();
      System.out.println(tree.getCurrentUrl());
	}

	@Then("The user should be redirected to the Over View of Tree page")
	public void the_user_should_be_redirected_to_the_over_view_of_tree_page() {
		 LoggerLoad.info("Verifying navigation to Overview of Trees Page...");
//	        Assert.assertEquals("User is not on the Overview of Trees Page", 
//	                ConfigReader.getexpectedurl45(), tree.getCurrentUrl());
		 System.out.println(tree.getCurrentUrl());
	}

	@Given("The user is on the Over View of Tree page")
	public void the_user_is_on_the_over_view_of_tree_page() {
		tree.treeGetStartedBtn.click();
		tree.overviewOfTreesBtn.click();
		LoggerLoad.info("User is in the Try Editor page of ");
		System.out.println(tree.getCurrentUrl());
	}
	
	@When("The user clicks the {string} button on the Over View of Tree page")
	public void the_user_clicks_the_button_on_the_over_view_of_tree_page(String string) {
		tree.clickTryHere();
	}
	
	@Then("The user should be redirected to a page having a try editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test() {
//		Assert.assertEquals("The user should be redirected to a page having a try editor with a Run button to test", 
//             ConfigReader.getexpectedurl4(), tree.getCurrentUrl());
		System.out.println(tree.getCurrentUrl());
	}
	
	@Given("The user is in the try editor page of {string}")
	public void the_user_is_in_the_try_editor_page_of(String string) {
		tree.treeGetStartedBtn.click();
		tree.clickOverviewOfTrees();
		tree.clickTryHere();
	}


	@When("The user clicks the Run button without entering any code")
	public void the_user_clicks_the_run_button_without_entering_any_code() {
		tree.clickRun();
		System.out.println(tree.getCurrentUrl());
	}

	@Then("The user should see an errormessage in an alert window")
	public void the_user_should_see_an_error_message_in_an_alert_window() {
		//Assert.assertTrue("No error message displayed", tree.getAlertMessage().contains("Error"));
		tree.handleAlert();
		System.out.println(tree.getCurrentUrl());

		
	}

	@When("The user enters invalid Python code causing a NameError and clicks the Run button")
	public void the_user_enters_invalid_python_code_causing_a_name_error_and_clicks_the_run_button() {
		tree.input.sendKeys(ExcelSheetReader.pythonCodeData(2));
		tree.runBtn.click();
		
	}

	@Then("The user should see a NameError message in an alert window")
	public void the_user_should_see_a_name_error_message_in_an_alert_window() {
//	Assert.assertTrue("No NameError message displayed", tree.getAlertMessage().contains("NameError"));
		tree.handleAlert();
		
	}

	@Then("The user enters Python code with syntax errors and clicks the Run button")
	public void the_user_enters_python_code_with_syntax_errors_and_clicks_the_run_button() {
	//	tree.enterCode("print('Hello World'");  // Missing closing parenthesis
		tree.handleAlert();
	}

	@Then("The user should see a SyntaxError message in an alert window")
	public void the_user_should_see_a_syntax_error_message_in_an_alert_window() {
//		Assert.assertTrue("No SyntaxError message displayed", tree.getAlertMessage().contains("SyntaxError"));
		tree.handleAlert();
	}

	@When("The user enters valid Python code and clicks the Run button")
	public void the_user_enters_valid_python_code_and_clicks_the_run_button() {
//		tree.enterCode("print('Hello, Trees!')");
		tree.input.sendKeys();
		tree.runBtn.click();
	}
	@Then("The user should see the expected output displayed in the console   write a step definition file and page factory")
	public void the_user_should_see_the_expected_output_displayed_in_the_console_write_a_step_definition_file_and_page_factory() {
//		Assert.assertEquals("Output did not match", "Hello, Trees!", tree.getOutput());
		System.out.println(ExcelSheetReader.pythonCodeData(1));
		Assert.assertEquals(ExcelSheetReader.pythonCodeData(1),tree.output.getText());

	}
    @Given("The user is in the Over View of tree page")
	public void the_user_is_in_the_over_view_of_tree_page() {
		//tree.clickTreeGetStarted();
		 System.out.println(tree.getCurrentUrl());
	
	}
	
	@When("The user clicks the {string} button on the Tree page")
	public void the_user_clicks_the_button_on_the_tree_page(String string) {
	    //tree.terminologyBtn.click();
	    //System.out.println(tree.getCurrentUrl());
	}

	@Then("The user should be redirected to the {string} page")
	public void the_user_should_be_redirected_to_the_page(String string) {
		//Assert.assertEquals("User is not on the Dashboard Page", ConfigReader.getexpectedurl45(),
			//	tree.getCurrentUrl());

	}
	
	@Given("The user is on the Terminologies page")
	public void the_user_is_on_the_terminologies_page() {
		
		
	}

	@When("The user clicks the {string} button on the {string} page")
	public void the_user_clicks_the_button_on_the_page(String string, String string2) {
	  
	}

	@Then("The user should be redirected to a page with a Try Editor")
	public void the_user_should_be_redirected_to_a_page_with_a_try_editor() {
	    
	}

	@Given("The user is on the {string} page from the {string} page")
	public void the_user_is_on_the_page_from_the_page(String string, String string2) {
		tree.treeGetStartedBtn.click();
		tree.terminologyBtn.click();
	}

	@When("The user clicks the {string} button without entering any code")
	public void the_user_clicks_the_button_without_entering_any_code(String string) {
		tree.tryHereBtn.click();
	}
	
	@Given("The user is on the Try Editor page from the Terminologies page")
	public void the_user_is_on_the_try_editor_page_from_the_terminologies_page() {
		tree.treeGetStartedBtn.click();
		tree.terminologyBtn.click();
		tree.tryHereBtn.click();
	}
	
	@When("The user enters invalid Python code causing a NameError and clicks the {string} button")
	public void the_user_enters_invalid_python_code_causing_a_name_error_and_clicks_the_button(String string) {
		tree.runBtn.click();  
	}
	
	

	@When("The user enters Python code with syntax errors and clicks the {string} button")
	public void the_user_enters_python_code_with_syntax_errors_and_clicks_the_button(String string) {
	    
	}

	@When("The user enters valid Python code and clicks the {string} button")
	public void the_user_enters_valid_python_code_and_clicks_the_button(String string) {
	   
	}

	@Then("The user should see the expected output displayed in the console")
	public void the_user_should_see_the_expected_output_displayed_in_the_console() {
	   
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
	}
    
	
	@When("The user clicks the Types of Trees button")
	public void the_user_clicks_the_types_of_trees_button() {
//		tree.typesOfTreesBtn.click();
		
	}
	
	@Then("The user should be redirected to the Types of Trees page")
	public void the_user_should_be_redirected_to_the_types_of_trees_page() {
		System.out.println(tree.getCurrentUrl());
	}
	
	@Given("The user is on the Types of Trees page")
	public void the_user_is_on_the_types_of_trees_page() {
		tree.treeGetStartedBtn.click();
		tree.typesOfTreesBtn.click();
		tree.tryHereBtn.click();
		
	}
	
	@When("The user clicks the Try Here button on the {string} page")
	public void the_user_clicks_the_try_here_button_on_the_page(String string) {
		tree.runBtn.click();
	}
	
	@Given("The user is on the Tree Traversals page")
	public void the_user_is_on_the_tree_traversals_page() {
		tree.treeGetStartedBtn.click();
		tree.treeTraversalsBtn.click();
		tree.tryHereBtn.click();
	}
	
	@When("The user clicks the Try Here button on the Tree Traversals page")
	public void the_user_clicks_the_try_here_button_on_the_tree_traversals_page() {
		tree.runBtn.click();
		
	}
	
	
}
