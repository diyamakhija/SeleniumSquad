package pageFactory;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.juiceShop_Register_PF;
import utilities.DriverFactory;

public class Data_Structure_IntroductionPF {

	WebDriver driver = DriverFactory.getDriver(null);

	public Data_Structure_IntroductionPF(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div[3]/div[1]/div/div/a")
	WebElement dataStrIntro_getStartedBtn;

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

	public void dataStrIntro_getStartedBtn() {
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
