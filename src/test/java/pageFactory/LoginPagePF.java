package pageFactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ConfigReader;
import utilities.ExcelSheetReader;

public class LoginPagePF extends BaseClass {


	@FindBy(xpath = "//div[@class='content']/a/button")
	public WebElement getStartedBtn;

	@FindBy(xpath = "//div[@class='navbar-nav'][2]/ul/a[3]")
	public WebElement signInBtn;

	@FindBy(id = "id_username")
	public WebElement userNameField;
	
	@FindBy(id = "id_username")
	public WebElement userNameField1;

	@FindBy(id = "id_password")
	public WebElement passwordField;
	
	@FindBy(id = "id_password")
	public WebElement passwordField1;
	

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
	
	public void userNameField1() {
		userNameField1.sendKeys("userName");
	}
	
	public void passwordField1() {
		passwordField1.sendKeys("password");	
	}

	public void passwordField() {

		passwordField.sendKeys(ExcelSheetReader.userCredential(3).get(1));
	}

	public void logInBtn() {

		logInBtn.click();
	}
	
	public void pageURL() {

		pageURL(ConfigReader.getPageURL());
	}
	
<<<<<<< Updated upstream
	public String expectedUrl64() {

		return ExcelSheetReader.expectedUrl(64).get(0);
	}
	
//	public String getUsernameValidationMessage() {
//		logInBtn.click(); // Trigger validation
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        return (String) js.executeScript("return arguments[0].validationMessage;", userNameField);
//    }
	
	 @FindBy(xpath = "//div[@class='alert alert-success']") // Adjust XPath based on actual UI
=======
	 @FindBy(xpath = "//div[@class='alert alert-success']") 
>>>>>>> Stashed changes
	    public WebElement successMessage;
	
	 @FindBy(xpath = "//div[@role='alert']") 
	    public WebElement errorMessage;
	
	 public String getErrorMsg() {
	        return errorMessage.getText();
	    }
	 
	 public String getSuccessMsg() {
	        return successMessage.getText();
	    }
	 
	 public void enterUsername(String userName) {
	        userNameField.clear();
	        userNameField.sendKeys(userName);
	    }

	    public void enterPassword(String password) {
	        passwordField.clear();
	        passwordField.sendKeys(password);
	    }

	public void pageURL(String url) {

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	 
}
