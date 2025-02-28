
package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(monochrome = false, // console output color
		tags = "@tag ", // tags from feature file
		features = { "src/test/resources/features" }, // location of feature files
		glue = "stepDefinition", // location of step definition files
		plugin = { "pretty", "html:target/cucumber-reports" }, dryRun = false // or dryRun = false
) // reporting purpose

public class TestRunner extends AbstractTestNGCucumberTests {

			@Override
		    @DataProvider(parallel = true)
		    public Object[][] scenarios() {
						
				return super.scenarios();
		    }

}
