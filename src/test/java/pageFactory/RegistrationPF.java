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
}