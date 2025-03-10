package webDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager; // For easy driver management
import utilities.LoggerLoad;

public class DriverFactory {
       public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
       
       public static WebDriver getDriver(String browser) {
		    WebDriver driver = tlDriver.get();
		       if (driver == null) {

<<<<<<< Updated upstream
			
=======
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

//	public static WebDriver getDriver() {
    public static WebDriver getDriver(String browser) {


		WebDriver driver = tlDriver.get();
		if (driver == null) {
//			String browser = TestRunner.getBrowserName();

>>>>>>> Stashed changes
			switch (browser.toLowerCase()) {
			case "chrome":
				
				WebDriverManager.chromedriver().setup(); 
				
				driver = new ChromeDriver();
				break;
			case "firefox":
				
				
				WebDriverManager.firefoxdriver().setup();
				
				driver = new FirefoxDriver();
				break;
			case "edge":
				
				
				WebDriverManager.edgedriver().setup();	
				
				driver = new EdgeDriver();
				break;

			
			default:
				LoggerLoad.error("Invalid browser");
				throw new IllegalArgumentException("Invalid browser: " + browser);
			}
			tlDriver.set(driver);
		}

		driver.manage().window().maximize();

		return driver;
	}

	public static void quitDriver() {
		WebDriver driver = tlDriver.get();
		if (driver != null) {
			driver.quit();
			tlDriver.remove();
		}
	}
}
