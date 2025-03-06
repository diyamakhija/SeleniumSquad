
package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(monochrome = false, // console output color
		tags = "", // tags from feature file
		features = { "src/test/resources/features" }, // location of feature files
		glue = {"stepDefinition","hooks"}, // location of step definition files
		plugin = { "pretty", "html:target/cucumber-reports/dsalgo.html",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" }, dryRun = true // or dryRun = false
) // reporting purpose

public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {

		return super.scenarios();
	}

}
