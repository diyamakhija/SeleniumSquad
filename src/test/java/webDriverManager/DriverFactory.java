package webDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager; // For easy driver management

public class DriverFactory {
	private static final ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	public static WebDriver getDriver(String browser) {
		WebDriver driver = tlDriver.get();
		if (driver == null) {
			System.out.println("came to getDriver");

			switch (browser.toLowerCase()) {
			case "chrome":
				WebDriverManager.chromedriver().setup(); // Use WebDriverManager
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

			// Add more browsers as needed
			default:
				throw new IllegalArgumentException("Invalid browser: " + browser);
			}
			tlDriver.set(driver);
		}

		// Common driver configurations (can be customized)
		driver.manage().window().maximize(); // Maximize the browser window
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

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
