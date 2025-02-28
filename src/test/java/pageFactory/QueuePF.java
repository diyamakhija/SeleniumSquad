package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QueuePF extends BaseClass{

	public QueuePF() {
		super();
	}

	@FindBy(xpath = "//div[@class='col'][5]/div/div/a")
	public
	WebElement queue_getStartedBtn;

	@FindBy(xpath = "//a[text()='Implementation of Queue in Python']")
	public
	WebElement implementationOfQueueInPythonBtn;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	public
	WebElement tryHereBtn;

	@FindBy(xpath = "//div[@class='CodeMirror-scroll']/div/div")
	public
	WebElement pythonCodeField;

	@FindBy(xpath = "//button[text()='Run']")
	public
	WebElement runBtn;

	@FindBy(xpath = "//a[text()='Implementation using collections.deque']")
	public
	WebElement implementationUsingCollectionsDeque;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	public
	WebElement tryHereBtn1;

	@FindBy(xpath = "//div[@class='CodeMirror-scroll']/div/div")
	public
	WebElement pythonCodeField1;

	@FindBy(xpath = "//button[text()='Run']")
	public
	WebElement runBtn1;

	@FindBy(xpath = "//a[text()='Implementation using array']")
	public
	WebElement implementationUsingArray;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	public
	WebElement tryHereBtn2;

	@FindBy(xpath = "//div[@class='CodeMirror-scroll']/div/div")
	public
	WebElement pythonCodeField2;

	@FindBy(xpath = "//button[text()='Run']")
	public
	WebElement runBtn2;

	@FindBy(xpath = "//a[text()='Queue Operations']")
	public
	WebElement queueOperations;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	public
	WebElement tryHereBtn3;

	@FindBy(xpath = "//div[@class='CodeMirror-scroll']/div/div")
	public
	WebElement pythonCodeField3;

	@FindBy(xpath = "//button[text()='Run']")
	public
	WebElement runBtn3;

	@FindBy(xpath = "//a[text()='Practice Questions']")
	public
	WebElement practiceQuestionsBtn;
}
