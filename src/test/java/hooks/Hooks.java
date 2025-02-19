package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DriverFactory;

public class Hooks {

	@Before
	public void setUp() {
		System.out.println("calling hooks setup");
		//DriverFactory.getDriver("chrome");
	}

	@After
	public void tearDown() {
		System.out.println("calling hooks teardown");
		DriverFactory.quitDriver(null);
	}
}
