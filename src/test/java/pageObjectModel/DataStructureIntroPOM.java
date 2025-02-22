package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webDriverManager.DriverFactory;

public class DataStructureIntroPOM extends BaseClass {		


	public DataStructureIntroPOM () {
		
		this.driver = DriverFactory.getDriver("chrome");
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "/html/body/div[3]/div[1]/div/div/a")
	public
	static WebElement dataStrIntro_getStartedBtn;

	@FindBy(xpath = "/html/body/div[2]/ul/a")
	WebElement timeComplexityBtn;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/a")
	WebElement tryHereBtn;
	@FindBy(xpath = "/html/body/div/div/form/div/div/div[6]")
	WebElement pythonCodeField;
	@FindBy(xpath = "/html/body/div/div/form/button")
	WebElement runBtn;
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/a")
	WebElement practiceQuestionsBtn;

	public  void dataStrIntro_getStartedBtn() {
		dataStrIntro_getStartedBtn.click();
	}

	public void timeComplexityBtn() {
		timeComplexityBtn.click();
	}

	public void tryHereBtn() {
		tryHereBtn.click();
	}

	public void pythonCodeField() {
		pythonCodeField.sendKeys("Hello, World!");
	}

	public void runBtn() {
		runBtn.click();
	}

	public void practiceQuestionsBtn() {
		practiceQuestionsBtn.click();

	}
	

}
