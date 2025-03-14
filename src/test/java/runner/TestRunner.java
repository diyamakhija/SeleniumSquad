
package runner;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(monochrome = false, // console output color
		tags = "@QS", // tags from feature file
		features = { "src/test/resources/features" }, // location of feature files
		glue = { "stepDefinition", "hooks" }, // location of step definition files
		plugin = { "pretty", "html:target/cucumber-reports/dsalgo.html",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" }, dryRun = false // or dryRun = false
) // reporting purpose

public class TestRunner extends AbstractTestNGCucumberTests {

	private static ThreadLocal<String> tlBrowserName = new ThreadLocal<>();

	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser) {
		tlBrowserName.set(browser);

	}

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {

		return super.scenarios();
	}

	public static String getBrowserName() {
		return tlBrowserName.get();
	}

}
