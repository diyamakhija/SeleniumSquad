package pageFactory;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.DriverFactory;

public class QueuePF {

	public QueuePF(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "/html/body/div[3]/div[5]/div/div/a")

	WebElement queue_getStartedBtn;

	@FindBy(xpath = "/html/body/div[2]/ul[1]/a")
	WebElement implementationOfQueueInPythonBtn;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/a")
	WebElement tryHereBtn;

	@FindBy(xpath = "/html/body/div/div/form/div/div/div[6]")
	WebElement pythonCodeField;

	@FindBy(xpath = "/html/body/div/div/form/button")
	WebElement runBtn;

	@FindBy(xpath = "/html/body/div[2]/ul[2]/a")
	WebElement implementationUsingCollectionsDeque;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/a")
	WebElement tryHereBtn1;

	@FindBy(xpath = "/html/body/div/div/form/div/div/div[6]")
	WebElement pythonCodeField1;

	@FindBy(xpath = "/html/body/div/div/form/button")
	WebElement runBtn1;

	@FindBy(xpath = "/html/body/div[2]/ul[3]/a")
	WebElement implementationUsingArray;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/a")
	WebElement tryHereBtn2;

	@FindBy(xpath = "/html/body/div/div/form/div/div/div[6]")
	WebElement pythonCodeField2;

	@FindBy(xpath = "/html/body/div/div/form/button")
	WebElement runBtn2;

	@FindBy(xpath = "/html/body/div[2]/ul[4]/a")
	WebElement queueOperations;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/a")
	WebElement tryHereBtn3;

	@FindBy(xpath = "/html/body/div/div/form/div/div/div[6]")
	WebElement pythonCodeField3;

	@FindBy(xpath = "/html/body/div/div/form/button")
	WebElement runBtn3;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/a")
	WebElement practiceQuestionsBtn;

	public void queue_getStartedBtn() {
		queue_getStartedBtn.click();

	}

	public void implementationOfQueueInPythonBtn() {
		implementationOfQueueInPythonBtn.click();
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

	public void implementationUsingCollectionsDeque() {
		implementationUsingCollectionsDeque.click();
	}

	public void tryHereBtn1() {
		tryHereBtn1.click();
	}

	public void pythonCodeField1() {
		pythonCodeField1.sendKeys("Hello, World!");
	}

	public void runBtn1() {
		runBtn1.click();
	}

	public void implementationUsingArray() {
		implementationUsingArray.click();
	}

	public void tryHereBtn2() {
		tryHereBtn2.click();
	}

	public void pythonCodeField2() {
		pythonCodeField2.sendKeys("Hello, World!");
	}

	public void runBtn2() {
		runBtn2.click();
	}

	public void queueOperations() {
		queueOperations.click();
	}

	public void tryHereBtn3() {
		tryHereBtn3.click();
	}

	public void pythonCodeField3() {
		pythonCodeField3.sendKeys("Hello, World!");
	}

	public void runBtn3() {
		runBtn3.click();
	}

	public void practiceQuestionsBtn() {
		practiceQuestionsBtn.click();
	}

}
