package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Array {
	@When("the user clicks the {string} button in the Array Panel")
	public void when_the_user_clicks_the_button_in_the_array_panel(String button) {
	    // Your code here that clicks the "Get Started" button in the Array Panel
	    // For example:
	    // WebDriver driver = new ChromeDriver();
	    // driver.findElement(By.id("getStartedButton")).click();
	}
	@Then("The user is directed to {string} Data Structure Page")
	public void the_user_is_directed_to_data_structure_page(String page) {
	    // Your code to verify the user is directed to the correct page
	    // For example, check the page title or URL
	    // Assert.assertTrue(driver.getTitle().contains(page));
	}


}
