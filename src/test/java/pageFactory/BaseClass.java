package pageFactory;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.LoggerLoad;
import webDriverManager.DriverFactory;

public class BaseClass {
	protected WebDriver driver;

	public BaseClass() {

		this.driver = DriverFactory.getDriver("chrome");
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public void handleAlert(String expectedResult) {
		try {
			// Wait for the alert to be present (optional but recommended)
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.alertIsPresent());

			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			LoggerLoad.info("Alert text: " + alertText);

			// Assert the alert text (example)
			Assert.assertEquals(alertText, expectedResult);

			alert.accept();
			LoggerLoad.info("Alert accepted");

		} catch (NoAlertPresentException e) {
			// Alert was not present as expected
			LoggerLoad.error("Alert was not present.");
			// Add assertions to verify application state when no alert is present.
			// Example
			Assert.fail("An unexpected error occurred: " + e.getMessage()); // fail the test.

		} catch (Exception e) {
			// Some other error occurred
			LoggerLoad.error("An error occurred: " + e.getMessage());
			Assert.fail("An unexpected error occurred: " + e.getMessage()); // fail the test.
		}

	}

}
