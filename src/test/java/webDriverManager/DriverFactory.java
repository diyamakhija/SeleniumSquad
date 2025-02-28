package webDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager; // For easy driver management
import utilities.LoggerLoad;

public class DriverFactory {
//	creating webDriver instance to variable
	private static final ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	public static WebDriver getDriver(String browser) {
		
		// Get the driver for this thread
		WebDriver driver = tlDriver.get();
		if (driver == null) {

			//This method of the String class that converts the browser string to lowercase
			switch (browser.toLowerCase()) {
			case "chrome":
				// Use WebDriverManager
				//This part of the code specifies that, to use ChromeDriver
				WebDriverManager.chromedriver().setup(); 
				//creating chromeDriver instance to the variable
				driver = new ChromeDriver();
				break;
			case "firefox":
				
				//This part of the code specifies that, to use firefoxdriver
				WebDriverManager.firefoxdriver().setup();
				//creating FirefoxDriver instance to the variable
				driver = new FirefoxDriver();
				break;
			case "edge":
				
				//This part of the code specifies that, to use edgedriver
				WebDriverManager.edgedriver().setup();	
				//creating  EdgeDriver instance to the variable
				driver = new EdgeDriver();
				break;

			// Add more browsers as needed
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
