package pageFactory;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataStructureIntroPF extends BaseClass {

	public DataStructureIntroPF() {
		super();
	}

	@FindBy(xpath = "//a[text()='Get Started']")
	public WebElement dataStrIntro_getStartedBtn;

	@FindBy(xpath = "//a[text()='Time Complexity']")
	public WebElement timeComplexityBtn;
	
	@FindBy(xpath = "//a[text()='Try here>>>']")
	public WebElement tryHereBtn;
	
	@FindBy(xpath="//textarea[@tabindex='0']")
	public WebElement input;
	
	@FindBy (xpath="//form/div/div/div/textarea")
	public WebElement editorInput;
	
	@FindBy (xpath="//pre[@id='output']") 
	public WebElement output;
	
	@FindBy(xpath = "//button[@type='button']")
	public WebElement runBtn;
	
	@FindBy(xpath = "//a[text()='Practice Questions']")
	public WebElement practiceQuestionsBtn;
	
	@FindBy(xpath = "//div[@class='nav-item dropdown']/a")
	public WebElement dropDownBtn;
	
	@FindBy(xpath = "//div[@class='nav-item dropdown show']/div/a[4]")
	public WebElement queueOption;
	
	@FindBy(xpath = "//div[@class='bs-example']/nav/a")
	public WebElement numpyNinjaBtn;

}
