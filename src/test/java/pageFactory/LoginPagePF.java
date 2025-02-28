package pageFactory;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ConfigReader;

public class LoginPagePF extends BaseClass {

	public LoginPagePF() {
		super();
	}

	@FindBy(xpath = "//div[@class='content']/a/button")
	public WebElement getStartedBtn;

	@FindBy(xpath = "//div[@class='navbar-nav'][2]/ul/a[3]")
	public WebElement signInBtn;

	@FindBy(id = "id_username")
	public WebElement userNameField;

	@FindBy(id = "id_password")
	public WebElement passwordField;

	@FindBy(xpath = "//div[@class='col-sm']/form/input[4]")
	public WebElement logInBtn;


	public void pageURL(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
