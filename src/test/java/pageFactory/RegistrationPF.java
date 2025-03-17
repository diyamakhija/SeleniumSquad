package pageFactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ConfigReader;
import utilities.ExcelSheetReader;

public class RegistrationPF extends BaseClass {
	
	@FindBy(xpath = "//div[@class='content']/a/button")
	public WebElement getStartedBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	public WebElement registerBtn;
	
	@FindBy(xpath = "//input[@name='username']")
	public WebElement UserNameFld;
	
	@FindBy(xpath = "//input[@name='password1']")
	public WebElement PssWordFld;

	@FindBy(xpath = "//input[@name='password2']")
	public WebElement ConPssWordFld;

	@FindBy(xpath = "//div[@class='alert alert-primary']")
	public WebElement actualMessage;
	
    public void getStartedBtn() {
    getStartedBtn.click();
	
   }
    
    public void getregisterBtn() {
    	registerBtn.click();
    	
       }
    public void pageURL() {

		pageURL(ConfigReader.getPageURL());
	}
    public void pageURL(String url) {

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
    public String expectedUrl66() {

		return ExcelSheetReader.expectedUrl(66).get(0);
	}
    
    public void userNameFld() {
    	UserNameFld.sendKeys("usrName");
	}
    
    public void pssWordFld() {
    	PssWordFld.sendKeys("pssword");
    }	
    public void ConpssWordFld() {
    	ConPssWordFld.sendKeys("pwdConfirmation");
    }
    
    public void ActualMessage() {
    	actualMessage.getText();
    }
    
   
	}
