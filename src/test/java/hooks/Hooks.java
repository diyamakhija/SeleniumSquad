package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utilities.ExcelSheetReader;
import webDriverManager.DriverFactory;

public class Hooks {

	@BeforeAll
	public static void runall() {
		String filePath = "./src/test/resources/testData/excelPythonCode.xlsx";
		ExcelSheetReader.getData(filePath);
	}

	@Before
	public void setUp() {
		DriverFactory.getDriver("chrome");
	}

	@After
	public void tearDown() {
		DriverFactory.quitDriver();
	}
}
