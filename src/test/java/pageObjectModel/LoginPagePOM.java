package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagePOM extends BaseClass {

	public LoginPagePOM() {
		super();
	}

	@FindBy(xpath = "/html/body/div[1]/div/div/a/button")
	public WebElement getStartedBtn;

	@FindBy(xpath = "/html/body/div[1]/nav/div/div[2]/ul/a[3]")
	public WebElement signInBtn;

	@FindBy(id = "id_username")
	public WebElement userNameField;

	@FindBy(id = "id_password")
	public WebElement passwordField;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/form/input[4]")
	public WebElement logInBtn;


	public void pageURL() {
		driver.get("https://dsportalapp.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
}
