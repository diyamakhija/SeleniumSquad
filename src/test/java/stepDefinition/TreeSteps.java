package stepDefinition;

import org.junit.Assert;

import constants.UrlConstants;

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
		
	tree.clickTreeGetStarted();
	}

	@Then("The user is navigate to Tree Page")
	public void the_user_is_navigate_to_tree_page() {
		Assert.assertEquals("User is not on the Dashboard Page",UrlConstants.TREE_URL,
				tree.getCurrentUrl());

	}

	@Given("The user is land  to  Tree Page")
	public void the_user_is_land_to_tree_page() {
		tree.clickTreeGetStarted();
		LoggerLoad.info("The user clicks Over View of Trees Page");
		
				
	}

	@When("The user clicks Over View of Trees button")
	public void the_user_clicks_over_view_of_trees_button() {
      tree.clickOverviewOfTrees();
     
	}

	@Then("The user should be redirected to the Over View of Tree page")
	public void the_user_should_be_redirected_to_the_over_view_of_tree_page() {
		Assert.assertEquals("User is not on the Dashboard Page",UrlConstants.TREE_OVERVIEW_OF_TREES_URL,
				tree.getCurrentUrl());
	}

	@Given("The user is on the Over View of Tree page")
	public void the_user_is_on_the_over_view_of_tree_page() {
		
		tree.clickTreeGetStarted();
		tree.clickOverviewOfTrees();
		LoggerLoad.info("User is in the Try Editor page of ");
		//System.out.println(tree.getCurrentUrl());
	}
	
	@When("The user clicks the {string} button on the Over View of Tree page")
	public void the_user_clicks_the_button_on_the_over_view_of_tree_page(String string) {
		tree.clickTryHere();
	}
	
	@Then("The user should be redirected to a page having a try editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test() {

		Assert.assertEquals("User is not on the Dashboard Page",UrlConstants.TRYEDITOR_URL,
				tree.getCurrentUrl());
	}
	
	@Given("The user is in the try editor page of {string}")
	public void the_user_is_in_the_try_editor_page_of(String string) {
		tree.clickTreeGetStarted();
		tree.clickOverviewOfTrees();
		
	}
	
	@When("The user clicks the Run button without entering any code for over view of tree")
	public void the_user_clicks_the_run_button_without_entering_any_code_for_over_view_of_tree() {
	   
		tree.clickTryHere();

	}
	@Then("The user should able to see  an error message in alert window based on {string} at row {int} for  over view of tree")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_based_on_at_row_for_over_view_of_tree(String sheetName, Integer rowNumber) {
	    
		Assert.assertEquals("An unexpected error occurred:", tree.nameHandleAlert(),
				tree.expectedResult(sheetName,rowNumber));
		
	}

	@Given("The user is landing on  the try editor page of {string}")
	public void the_user_is_landing_on_the_try_editor_page_of(String string) {
	
		tree.clickTreeGetStarted();
		tree.clickOverviewOfTrees();
		tree.clickTryHere();
		LoggerLoad.info("The user is landing on  the try editor page of Over View Of Tree");
	}

	@When("The user writes the invalid name code in the Editor from {string} at row {int} then clicks at Run button  for over view of tree")
	public void the_user_writes_the_invalid_name_code_in_the_editor_from_at_row_then_clicks_at_run_button_for_over_view_of_tree(String sheetName, Integer rowNumber) {
		tree.codeEditorInput(sheetName, rowNumber);
		tree.runBtn.click();
		
	}

	@Then("The user should see a NameError message in the alert window based on {string} at row {int} for over view of tree")
	public void the_user_should_see_a_name_error_message_in_the_alert_window_based_on_at_row_for_over_view_of_tree(String sheetName, Integer rowNumber) {
		Assert.assertEquals("An unexpected error occurred:", tree.nameHandleAlert(),
				tree.expectedResult(sheetName,rowNumber));
		
	}
	
	@When("The user write the invalid syntaxcode in Editor from {string} at row {int} then clicks the Run button  overview of tree")
	public void the_user_write_the_invalid_syntaxcode_in_editor_from_at_row_then_clicks_the_run_button_overview_of_tree(String sheetName, Integer rowNumber) {
		tree.codeEditorInput(sheetName, rowNumber);
		tree.runBtn.click();
	}
	
	@Then("The user should able to see an syntax error message in alert window based on {string} at row {int}  overview of tree")
	public void the_user_should_able_to_see_an_syntax_error_message_in_alert_window_based_on_at_row_overview_of_tree(String sheetName, Integer rowNumber) {
	
		Assert.assertEquals("An unexpected error occurred:", tree.syntaxHandleAlert(),
				tree.expectedResult("pythonCode",2));
	}
	
	@When("The user write the valid code in Editorfrom {string} at row {int} then clicks theRun Button for OverviewofTree")
	public void the_user_write_the_valid_code_in_editorfrom_at_row_then_clicks_the_run_button_for_overviewof_tree(String sheetName, Integer rowNumber) {
		
		tree.codeEditorInput(sheetName, rowNumber);
		tree.runBtn.click();
	}

	@Then("The user should able to see output in the console based on {string} at row {int} for OverviewofTree")
	public void the_user_should_able_to_see_output_in_the_console_based_on_at_row_for_overviewof_tree(String sheetName, Integer rowNumber) {
	
		Assert.assertEquals("An unexpected error occurred:", tree.expectedResult(sheetName,rowNumber),tree.output.getText());
	
	}

	
	@Given("The user is in the Tree page after sign in")
	public void the_user_is_in_the_tree_page_after_sign_in() {
		
		tree.clickTreeGetStarted();
		LoggerLoad.info("The user is in the Tree page after sign in");
	
	}
	
	@When("The user clicks the {string} button on the Tree page")
	public void the_user_clicks_the_button_on_the_tree_page(String string) {
	   
		tree.clickTerminology();
	}

	@Then("The user should be redirected to the {string} page")
	public void the_user_should_be_redirected_to_the_page(String string) {
		Assert.assertEquals("User is not on the Dashboard Page",UrlConstants.TREE_TERMINOLOGIES_URL,
				tree.getCurrentUrl());

	}
	
	@Given("The user is on the Terminologies page")
	public void the_user_is_on_the_terminologies_page() {
		
		tree.clickTreeGetStarted();
		tree.clickTerminology();
		
	}

	@When("The user clicks the {string} button on the {string} page")
	public void the_user_clicks_the_button_on_the_page(String string, String string2) {
	  
	   tree.clickTryHere();
	}

	@Then("The user should be redirected to a page with a Try Editor")
	public void the_user_should_be_redirected_to_a_page_with_a_try_editor() {
	    
		Assert.assertEquals("User is not on the Dashboard Page",UrlConstants.TRYEDITOR_URL,
				tree.getCurrentUrl());
	}

	@Given("The user is on the {string} page from the {string} page")
	public void the_user_is_on_the_page_from_the_page(String string, String string2) {
		tree.treeGetStartedBtn.click();
		tree.terminologyBtn.click();
	}

	@When("The user clicks the Run button without entering any code for Treminologies page")
	public void the_user_clicks_the_run_button_without_entering_any_code_for_treminologies_page() {
		tree.tryHereBtn.click();
	}
	
	
	@Given("the user should on {string} page from the {string} page")
	public void the_user_should_on_page_from_the_page(String string, String string2) {
		tree.treeGetStartedBtn.click();
		tree.terminologyBtn.click();
		tree.tryHereBtn.click();
	}
	
	@When("the user writes the invalid namecode in the Editor from {string} at row {int} then clicks at Run button  for over view of tree")
	public void the_user_writes_the_invalid_namecode_in_the_editor_from_at_row_then_clicks_at_run_button_for_over_view_of_tree(String sheetName, Integer rowNumber) {
		tree.codeEditorInput(sheetName, rowNumber);
		tree.runBtn.click(); 
	}
	
	
	@When("The user clicks the Types of Trees button")
	public void the_user_clicks_the_types_of_trees_button() {
         tree.clickTypesOfTrees();
		
	}
	
	@Then("The user should be landing on  the Types of Trees page")
	public void the_user_should_be_landing_on_the_types_of_trees_page() {
		Assert.assertEquals("User is not on the Dashboard Page",UrlConstants.TREE_TPES_OF_TREES_URL,
				tree.getCurrentUrl());
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
	
	@Then("The user should be landing on Try Editor Page")
	public void the_user_should_be_landing_on_try_editor_page() {
	    
		Assert.assertEquals("User is not on the Dashboard Page",UrlConstants.TRYEDITOR_URL,
				tree.getCurrentUrl());
	}
	
	@Given("The user should be  redirected on Try Editor Page")
	public void the_user_should_be_redirected_on_try_editor_page() {
		
		tree.clickTreeGetStarted();
		tree.clickTypesOfTrees();
		tree.tryHereBtn.click();
		
	}
	
	@When("The user clicks the Run button without entering any code for Types of Tree page")
	public void the_user_clicks_the_run_button_without_entering_any_code_for_types_of_tree_page() {
		
		tree.clickRun();
	}
	
	
	@Then("The user should able to see  an error message in alert window based on {string} at row {int} for Types of Tree Page")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_based_on_at_row_for_types_of_tree_page(String sheetName, Integer rowNumber) {
		Assert.assertEquals("An unexpected error occurred:", tree.nameHandleAlert(),
				tree.expectedResult(sheetName,rowNumber));
	}
	
	
	@When("The user write the invalid syntaxcode in Editor from {string} at row {int} then clicks the Run button  Types of Tree Page")
	public void the_user_write_the_invalid_syntaxcode_in_editor_from_at_row_then_clicks_the_run_button_types_of_tree_page(String sheetName, Integer rowNumber) {
		tree.codeEditorInput(sheetName, rowNumber);
		tree.runBtn.click();
	}
	
	
	@Then("The user should able to see an syntax error message in alert window based on {string} at row {int}  Types of Tree")
	public void the_user_should_able_to_see_an_syntax_error_message_in_alert_window_based_on_at_row_types_of_tree(String sheetName, Integer rowNumber) {
		Assert.assertEquals("An unexpected error occurred:", tree.syntaxHandleAlert(),
				tree.expectedResult("pythonCode",2));
	}
	
	@When("The user write the valid code in Editorfrom {string} at row {int} then clicks theRun Button for {string} Page")
	public void the_user_write_the_valid_code_in_editorfrom_at_row_then_clicks_the_run_button_for_page(String sheetName, Integer rowNumber) {
		
		tree.codeEditorInput(sheetName, rowNumber);
		tree.runBtn.click();
	
	}
	@Then("The user should able to see output in the console based on {string} at row {int} for  Page")
	public void the_user_should_able_to_see_output_in_the_console_based_on_at_row_for_page(String sheetName, Integer rowNumber) {
	   
		Assert.assertEquals("An unexpected error occurred:", tree.expectedResult(sheetName,rowNumber),tree.output.getText());
		
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
