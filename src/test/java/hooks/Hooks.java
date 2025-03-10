package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import utilities.ConfigReader;
import utilities.ExcelSheetReader;
import webDriverManager.DriverFactory;

public class Hooks {



	@BeforeAll
	public static void runall() {

		String propertyFilePath = "./src/test/resources/configFiles/config.properties";
		// This needs to be loaded and called first. no code above this
		ConfigReader.configRead(propertyFilePath);

		ExcelSheetReader.getData(ConfigReader.getExcelFilePath());

	}

//	@Before
//	public void setUp() {
//		DriverFactory.getDriver();
//	}
	@Before
	public void setUp() {
		DriverFactory.getDriver(ConfigReader.getBrowser());
	}

	@After
	public void tearDown(Scenario scenario) {
		WebDriver webDriver = DriverFactory.getDriver(ConfigReader.getBrowser());
<<<<<<< Updated upstream
=======

//		WebDriver webDriver = DriverFactory.getDriver();
>>>>>>> Stashed changes
		if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
			saveScreenshot(screenshot);
			scenario.attach(screenshot, "image/png", "name");
			Allure.addAttachment(scenario.getId(), screenshot.toString());
		}
//		DriverFactory.quitDriver();
	}

	@Attachment(value = "Screenshot", type = "image/png")
	public byte[] saveScreenshot(byte[] screenshot) {
		return screenshot;
	}
}
