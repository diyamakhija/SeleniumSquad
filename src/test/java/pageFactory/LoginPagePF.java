package pageFactory;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webDriverManager.DriverFactory;

public class LoginPagePF extends BaseClass {

	public LoginPagePF() {

		this.driver = DriverFactory.getDriver("chrome");
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "/html/body/div[1]/div/div/a/button")
	WebElement getStartedBtn;

	@FindBy(xpath = "/html/body/div[1]/nav/div/div[2]/ul/a[3]")
	WebElement signInBtn;

	@FindBy(id = "id_username")
	WebElement userNameField;

	@FindBy(id = "id_password")
	WebElement passwordField;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/form/input[4]")
	WebElement logInBtn;

	public void getStartedBtn() {
		getStartedBtn.click();
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	public void signInBtn() {
		signInBtn.click();
	}

	public void userNameField() {
		userNameField.sendKeys("SeleniumSquad");
	}

	public void passWordField() {
		passwordField.sendKeys("Squad2025#");
	}

	public void logInBtn() {
		logInBtn.click();

		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	public void loginallSteps() {

		signInBtn.click();
		userNameField.sendKeys("SeleniumSquad");
		passwordField.sendKeys("Squad2025#");
		logInBtn.click();

	}

	public void pageURL() {
		driver.get("https://dsportalapp.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public void pageAssert() {

		String expectedurl = "https://dsportalapp.herokuapp.com/home";
		String actualcurrenturl = driver.getCurrentUrl();
		Assert.assertEquals("User is not on the Dashboard Page", expectedurl, actualcurrenturl);
		System.out.println("current page:" + actualcurrenturl);

	}

	public void pageAssert1() {

		String expectedurl = "https://dsportalapp.herokuapp.com/queue/";
		String actualcurrenturl = driver.getCurrentUrl();
		Assert.assertEquals("User is not on the Dashboard Page", expectedurl, actualcurrenturl);
		System.out.println("current page:" + actualcurrenturl);

	}

}
