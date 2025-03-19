//package stepDefinition;
//
//import java.time.Duration;
//import java.util.concurrent.TimeoutException;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.NoAlertPresentException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageFactory.ArrayPF;
//import pageFactory.LoginPagePF;
//import utilities.ExcelSheetReader;
//import utilities.LoggerLoad;
//import webDriverManager.DriverFactory;
//
//public class ArraySteps {
//
//	LoginPagePF loginPagePF = new LoginPagePF();
////	ExcelSheetReader excelSheetReader = new ExcelSheetReader();
//	LoggerLoad loggerLoad = new LoggerLoad();
//	ArrayPF arrayPF = new ArrayPF();
//	//tag1
//	@Given("The user signin to dsAlgo Portal")
//	public void the_user_sign_in_to_ds_algo_portal() {
//		LoggerLoad.info("The user is in the Home page after sign in");   
//	}
//
//	@When("The user should click the Get Started button of the Array panel")
//	public void the_user_should_click_the_get_started_button_of_the_array_panel() {    
//	  arrayPF.clickGetStartedArrayButton();
//	}
//	
//	@Then("The user should land in Array Page")
//	public void the_user_should_land_in_array_page() {
//		Assert.assertEquals("User is not on the Dashboard Page", arrayPF.expectedUrl9(),
//				arrayPF.getCurrentUrl());
//	    System.out.println(arrayPF.expectedUrl9());
//	    
//	}
//   
////tag2- "Arrays in Python"
//	@Given("The user is on the Array page after Signin")
//	public void the_user_is_on_the_array_page_after_signin() {
//	    arrayPF.clickGetStartedArrayButton();
//	    LoggerLoad.info("The User is in Array page" );
//	}
//
//	@When("The user clicks Arrays in Python button")
//	public void the_user_clicks_arrays_in_python_button() {
//		arrayPF.clickArraysInPythonButton();
//	    
//	}
//	
//	@Then("The user should be redirected to Arrays in Python page")
//	public void the_user_should_be_redirected_to_arrays_in_python_page() {
//	    Assert.assertEquals(arrayPF.getCurrentUrl().trim(), "https://dsportalapp.herokuapp.com/array/arrays-in-python/", 
//	        "User is not in Array in Python Home Page");
//	}
//	//tag3- "Arrays using List"
//	@When("The user clicks Arrays using List button")
//	public void the_user_clicks_arrays_using_list_button() {
//	    arrayPF.clickArraysUsingListButton();
//	}
//	
//	@Then("The user should be redirected to Arrays using List page")
//	public void the_user_should_be_redirected_to_arrays_using_list_page() {
//		 Assert.assertEquals(arrayPF.getCurrentUrl().trim(), "https://dsportalapp.herokuapp.com/array/arrays-using-list/", 
//			        "User is not in Array using List Home Page"); 
//	}
//	//tag4- "basic operations in Lists"
//@When("The user clicks Basic Operations in Lists button")
//public void the_user_clicks_basic_operations_in_lists_button() {
//   arrayPF.clickBasicOperaInListsButton();
//}
//
//@Then("The user should be redirected to Basic Operations in Lists page")
//public void the_user_should_be_redirected_to_basic_operations_in_lists_page() {
//	Assert.assertEquals(arrayPF.getCurrentUrl().trim(), "https://dsportalapp.herokuapp.com/array/basic-operations-in-lists/", 
//	        "User is not in Basic Operations in Lists Page"); 
//}
////tag5- "Applications of Array"
//@When("The user clicks Applications of Array button")
//public void the_user_clicks_applications_of_array_button() {
//    arrayPF.clickApplicationsOfArrayButton();
//}
//
//@Then("The user should be redirected to Applications of Array page")
//public void the_user_should_be_redirected_to_applications_of_array_page() {
//	Assert.assertEquals(arrayPF.getCurrentUrl().trim(), "https://dsportalapp.herokuapp.com/array/applications-of-array/", 
//	        "User is not in Applications of Array Page"); 
//}
//
//
//
//
////tag6-try here
//	@Given("The user is on the Arrays in Python page")
//	public void the_user_is_on_the_arrays_in_python_page() {
//		arrayPF.clickGetStartedArrayButton();
//		arrayPF.clickArraysInPythonButton();
//		LoggerLoad.info("User is in Arrays in Python Page");		
//	}
//
//	@When("The user clicks {string} button in Arrays in Python page")
//	public void the_user_clicks_button_in_arrays_in_python_page(String string) {
//	    arrayPF.clickTryHereButton();
//	}
//
//	@Then("The user should be redirected to a page having a Try Editor with a Run button")
//	public void the_user_should_be_redirected_to_try_editor_page() {
//	    Assert.assertEquals(arrayPF.getCurrentUrl().trim(), "https://dsportalapp.herokuapp.com/tryEditor", 
//	        "User is not in Try Editor Page");
//	}
//
////tag7 - run without code
//	@Given("The user is in the Try Editor page of Arrays in Python")
//	public void the_user_is_in_the_try_editor_page_of_arrays_in_python() {
//		arrayPF.clickGetStartedArrayButton();
//		arrayPF.clickArraysInPythonButton();
//		arrayPF.clickTryHereButton();
//		LoggerLoad.info("User is in Array-tryEditor Page");
//	}
//
//	@When("The user clicks the Run Button without entering code")
//	public void the_user_clicks_the_run_button_without_entering_code() {
//		arrayPF.clickRunButton();
//	}
//
//	@Then("The user should see an error message in an alert window of Try editor")
//	public void the_user_should_see_error_message_in_alert_window_of_try_editor() {
//	    // Click the 'Run' button without entering any code
//	    arrayPF.getDriver().findElement(By.id("run-button")).click();
//
//	    // Check if the alert is present
//	    String actualAlert = arrayPF.handleAlert1();
//
//	    // Fail if no alert is found
//	    if (actualAlert.equals("No alert present")) {
//	        Assert.fail("Alert not triggered when clicking Run without code.");
//	    }
//
//	    // Compare the actual and expected alert messages
//	    Assert.assertEquals(actualAlert, arrayPF.expectederrorResult());
//	}
//
//	//tag8-invalid code
//	@Given("The user is now in the Try Editor page")
//	public void the_user_is_now_in_the_try_editor_page() {
//		arrayPF.clickGetStartedArrayButton();
//		arrayPF.clickArraysInPythonButton();
//		arrayPF.clickTryHereButton();
//		LoggerLoad.info("User is in Array-tryEditor Page checking invalid code");
//	    
//	}
//	
//	@When("The user writes invalid code in the Editor and clicks the Run Button")
//	public void the_user_writes_invalid_code_in_the_editor_and_clicks_the_run_button() {
//		arrayPF.input();
//		arrayPF.clickRunButton();
//	    
//	}
//
//	@Then("The user should now see an error message in an alert window")
//	public void the_user_should_now_see_an_error_message_in_an_alert_window() {
//	    // Get the WebDriver instance
//	    WebDriver driver = DriverFactory.getDriver();  // Ensure this retrieves the WebDriver correctly
//
//	    // Wait for the alert to be present
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//
//	    // Capture the actual alert message
//	    String actualMessage = alert.getText().trim();  // Clean up any spaces or newlines
//	    
//	    // Compare with the expected message (either from Excel or hardcoded)
//	    String expectedMessage = arrayPF.expectedNameErrorResult().trim();  // Ensure this is the correct message
//	    
//	    // Assert that actual and expected messages match
//	    Assert.assertEquals(actualMessage, expectedMessage, "Error messages don't match!");
//	    
//	    // Accept the alert after the test
//	    alert.accept();
//	}
//
////tag9-valid code
//	@Given("User is in the Try Editor page")
//	public void user_is_in_the_try_editor_page() {
//		arrayPF.clickGetStartedArrayButton();
//		arrayPF.clickArraysInPythonButton();
//		arrayPF.clickTryHereButton();
//		LoggerLoad.info("User is in Array-tryEditor Page checking invalid code");
//	}
//
//	@When("The user writes valid code in the Editor and clicks the Run Button")
//	public void the_user_writes_valid_code_in_the_editor_and_clicks_the_run_button() {
//	    arrayPF.input1();
//	    arrayPF.clickRunButton();
//	}
////
////	@Then("User should see the output in the console")
////	public void user_should_see_the_output_in_the_console() {
////		Assert.assertEquals(arrayPF.validOutput(), arrayPF.output.getText());
////	}
////
//////tag10-Navigate to "Practice Questions" in "Arrays in Python"
//@Given("The user is in the Array page after Sign in")
//public void the_user_is_in_the_array_page_after_sign_in() {
//	     arrayPF.clickGetStartedArrayButton();
//	     arrayPF.clickArraysInPythonButton();
//         LoggerLoad.info("User is in the Array page after Sign in");
//	}
//@When("User clicks \"Practice Questions\" button")
//public void user_clicks_button() {
//    arrayPF.clickPracticeQuestionsButton();
//}
//	@Then("User should be redirected to {string} page")
//	public void user_should_be_redirected_to_page(String string) {
//		 Assert.assertEquals(arrayPF.getCurrentUrl().trim(), "https://dsportalapp.herokuapp.com/array/practice", 
//			        "User is not on the Array home Page");
//	}
//	//tag11 - Navigate to "Search the Array" question
//	@Given("User is on the {string} page")
//	public void user_is_on_the_page(String string) {
//		arrayPF.clickGetStartedArrayButton();
//	     arrayPF.clickArraysInPythonButton();
//	     arrayPF.clickPracticeQuestionsButton();
//        LoggerLoad.info("User is in the Array page after Sign in");
//	}
//	@When("The user clicks the {string} link")
//	public void the_user_clicks_the_link(String string) {
//	    arrayPF.clickSearchArrayLink();
//	}
//
//	@Then("The user should be redirected to a question page with a Try Editor")
//	public void the_user_should_be_redirected_to_a_question_page_with_a_try_editor() {
//	    WebDriver driver = DriverFactory.getDriver();
//
//	    // Wait for the URL to contain "/question/1"
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    wait.until(ExpectedConditions.urlContains("/question/1"));
//
//	    // Fetch the current URL after the redirection
//	    String actualUrl = driver.getCurrentUrl();
//	    String expectedUrl = "https://dsportalapp.herokuapp.com/question/1";
//
//	    // Assert that the actual URL matches the expected URL
//	    Assert.assertEquals(actualUrl, expectedUrl, "User is not on the expected question page");
//
//	    // Optional: Print the actual URL for debugging purposes
//	    System.out.println("Actual URL: " + actualUrl);
//	}
////tag12 - Error for invalid code in Search the Array
//	@Given("The user is on the practice question editor")
//	public void the_user_is_on_the_practice_question_editor() {
//		arrayPF.clickGetStartedArrayButton();
//	     arrayPF.clickArraysInPythonButton();
//	     arrayPF.clickPracticeQuestionsButton();
//	     arrayPF.clickSearchArrayLink();
//LoggerLoad.info("User is on the practice question editor");
//	}
//
//	@Then("User should see an error message in an alert window")
//	public void user_should_see_an_error_message_in_an_alert_window() {
//		Assert.assertEquals("Error message not as expected", arrayPF.nameHandleAlert(), arrayPF.expectedNameErrorResult());
//		
//		 WebDriver driver = DriverFactory.getDriver();  // Ensure this retrieves the WebDriver correctly
//
//		    // Wait for the alert to be present
//		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//
//		    // Capture the actual alert message
//		    String actualMessage = alert.getText().trim();  // Clean up any spaces or newlines
//		    
//		    // Compare with the expected message (either from Excel or hardcoded)
//		    String expectedMessage = arrayPF.expectedNameErrorResult().trim();  // Ensure this is the correct message
//		    
//		    // Assert that actual and expected messages match
//		    Assert.assertEquals(actualMessage, expectedMessage, "Error messages don't match!");
//		    
//		    // Accept the alert after the test
//		    alert.accept();
//	}
//
//	@Then("The user should see the correct output in the console")
//	public void the_user_should_see_the_correct_output_in_the_console() {
//		Assert.assertEquals("Output is incorrect", arrayPF.validOutput(), arrayPF.getConsoleOutput());
//	}
//	//tag13 - Successful execution of valid code in "Search the Array"
//	//tag14 - Error on submitting invalid code in "Search the Array"
//@When("The user writes invalid code in the Editor and clicks the Submit Button")
//public void the_user_writes_invalid_code_in_the_editor_and_clicks_the_submit_button() {
// arrayPF.input2(); // Invalid code
//	arrayPF.clickSubmitButton();
//	}
//
//@Then("The user should see an error message {string}")
//public void the_user_should_see_an_error_message(String expectedErrorMessage) {
//    // Get the alert message from the BaseClass method
//    String actualMessage = arrayPF.getAlertMessage(); // Assuming arrayPF is an instance of your PageFactory class
//    
//    // Compare the actual message with the expected error message
//    Assert.assertEquals("Error message mismatch", actualMessage, expectedErrorMessage);
//}
//
////tag15 - Successful submission of valid code in "Search the Array"
//@When("The user writes valid code in the Editor and clicks the Submit Button")
//public void the_user_writes_valid_code_in_the_editor_and_clicks_the_submit_button() {
// arrayPF.input1(); // Valid code
// arrayPF.clickSubmitButton();
//}
//
//@Then("The user should see a success message {string}")
//public void the_user_should_see_a_success_message(String expectedSuccessMessage) {
// Assert.assertEquals("Submission success message mismatch", arrayPF.getAlertMessage(), expectedSuccessMessage);
//}
//}
//
//
