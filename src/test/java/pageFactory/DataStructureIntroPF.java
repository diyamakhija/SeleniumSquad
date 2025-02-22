package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webDriverManager.DriverFactory;

public class DataStructureIntroPF extends BaseClass {		

	public DataStructureIntroPF () {
		super();
	}

	@FindBy(xpath = "//a[text()='Get Started']")
	public
    WebElement dataStrIntro_getStartedBtn;

	@FindBy(xpath = "//a[text()='Time Complexity']")
	public
	WebElement timeComplexityBtn;
	@FindBy(xpath = "//a[text()='Try here>>>']")
	public
	WebElement tryHereBtn;
	@FindBy(xpath = "//div[@class='CodeMirror-scroll']/div/div")
	public
	WebElement pythonCodeField;
	@FindBy(xpath = "//button[text()='Run']")
	public
	WebElement runBtn;
	@FindBy(xpath = "//a[text()='Practice Questions']")
	public
	WebElement practiceQuestionsBtn;

	

}
