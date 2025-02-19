package pageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.DriverFactory;

public class LoginPagePF {

	private WebDriver driver;

	public LoginPagePF(WebDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div[1]/div/div/a/button")
	static

	WebElement getStartedBtn;

	@FindBy(xpath = "/html/body/div[1]/nav/div/div[2]/ul/a[3]")
	static
	WebElement signInBtn;
	
	static
	@FindBy(id = "id_username")
	WebElement userNameField;
	
	static
	@FindBy(id = "id_password")
	WebElement passwordField;
    
	static
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/form/input[4]")
	WebElement logInBtn;

	public void getStartedBtn() {
		getStartedBtn.click();
	}

	public void signInBtn() {
		signInBtn.click();
	}

	public void userNameField(String userName) {
		userNameField.sendKeys(userName);
	}

	public void passWordField(String password) {
		passwordField.sendKeys(password);
	}

	public void logInBtn() {
		logInBtn.click();
		
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	public void loginallSteps(String userName, String password) {
		getStartedBtn.click();
		signInBtn.click();
		userNameField.sendKeys(userName);
		passwordField.sendKeys(password);
		logInBtn.click();
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}

	
		
	
 
}
