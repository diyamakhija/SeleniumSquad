package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QueuePOM extends BaseClass{

	public QueuePOM() {
		super();
	}

	@FindBy(xpath = "//div[@class='col'][5]/div/div/a")
	public
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


}
