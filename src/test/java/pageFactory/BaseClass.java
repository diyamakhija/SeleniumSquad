package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import webDriverManager.DriverFactory;

public class BaseClass {
	protected WebDriver driver;

	public BaseClass() {
		this.driver = DriverFactory.getDriver("chrome");
		PageFactory.initElements(driver, this);
	}
	
	public String getCurrentUrl () {
		return driver.getCurrentUrl();
	}
}
