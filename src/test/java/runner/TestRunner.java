package runner;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    monochrome = false, // Console output color
    tags = "", // Tags from feature file
    features = { "src/test/resources/features" }, // Location of feature files
    glue = { "stepDefinition", "hooks" }, // Location of step definition files
    plugin = {
        "pretty",
        "html:target/cucumber-reports/dsalgo.html",
        "json:target/cucumber.json",  // Generates JSON report
        "junit:target/cucumber.xml",  // Generates JUnit XML report
        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
    },
    dryRun = false // Set to true to check missing step definitions
)

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
