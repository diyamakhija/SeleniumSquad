package pageFactory;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ConfigReader;
import utilities.ExcelSheetReader;

public class LoginPagePF extends BaseClass {
	ExcelSheetReader excelSheetReader = new ExcelSheetReader();


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

	public void getStartedBtn() {

		getStartedBtn.click();
	}

	public void signInBtn() {

		signInBtn.click();
	}

	public void userNameField() {

		userNameField.sendKeys(ExcelSheetReader.userCredential(3).get(0));
	}

	public void passwordField() {

		passwordField.sendKeys(ExcelSheetReader.userCredential(3).get(1));
	}

	public void logInBtn() {

		logInBtn.click();
	}

	public void pageURL(String url) {

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
