package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utilities.ConfigReader;
import utilities.ExcelSheetReader;
import webDriverManager.DriverFactory;

public class Hooks {

	@BeforeAll
	public static void runall() {
		String filePath = "./src/test/resources/testData/excelPythonCode.xlsx";
		String propertyFilePath = "./src/test/resources/configFiles/config.properties";
		ExcelSheetReader.getData(filePath);
		ConfigReader.configRead(propertyFilePath);
		
	}

	@Before
	public void setUp() {
		DriverFactory.getDriver(ConfigReader.getBrowser());
	}

	@After
	public void tearDown() {
		DriverFactory.quitDriver();
	}
}
