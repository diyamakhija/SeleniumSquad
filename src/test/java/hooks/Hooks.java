package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import webDriverManager.DriverFactory;


public class Hooks {

	@Before
	public void setUp() {
		DriverFactory.getDriver("chrome");
	}

	@After
	public void tearDown() {
		DriverFactory.quitDriver();
	}
}
