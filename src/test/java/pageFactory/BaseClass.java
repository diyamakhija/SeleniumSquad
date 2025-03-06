package pageFactory;

import java.time.Duration; // Ensure this import is there
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait; // Ensure correct import for WebDriverWait
import utilities.LoggerLoad;
import webDriverManager.DriverFactory;

public class BaseClass {
    protected WebDriver driver;

    public BaseClass() {
        this.driver = DriverFactory.getDriver("chrome");  // Initialize driver
        PageFactory.initElements(driver, this);
   
        
        // **Changed**: Using Duration for implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait
        
        // **Changed**: Correct WebDriverWait constructor usage
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Explicit wait constructor updated
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void handleAlert(String expectedResult) {
        try {
            // **Changed**: Explicit wait using Duration
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));  // Correct WebDriverWait usage
            wait.until(ExpectedConditions.alertIsPresent());

            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            LoggerLoad.info("Alert text: " + alertText);

            // Assert the alert text (example)
            Assert.assertEquals(alertText, expectedResult);

            alert.accept();
            LoggerLoad.info("Alert accepted");

        } catch (NoAlertPresentException e) {
            LoggerLoad.error("Alert was not present.");
            Assert.fail("An unexpected error occurred: " + e.getMessage()); // fail the test.

        } catch (Exception e) {
            LoggerLoad.error("An error occurred: " + e.getMessage());
            Assert.fail("An unexpected error occurred: " + e.getMessage()); // fail the test.
        }
    }
}
