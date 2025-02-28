package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QueuePF extends BaseClass {

	public QueuePF() {
		super();
	}

	@FindBy(xpath = "//div[@class='col'][5]/div/div/a")
	public WebElement queue_getStartedBtn;

	@FindBy(xpath = "//a[text()='Implementation of Queue in Python']")
	public WebElement implementationOfQueueInPythonBtn;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	public WebElement tryHereBtn;
	
	@FindBy(xpath="//textarea[@tabindex='0']")
	public WebElement input;

	@FindBy(xpath = "//button[text()='Run']")
	public WebElement runBtn;

	@FindBy(xpath = "//a[text()='Implementation using collections.deque']")
	public WebElement implementationUsingCollectionsDeque;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	public WebElement tryHereBtn1;
	
	@FindBy (xpath="//pre[@id='output']") 
	public WebElement output;

//	@FindBy(xpath = "//div[@class='CodeMirror-scroll']/div/div")
//	public WebElement pythonCodeField1;

//	@FindBy(xpath = "//button[text()='Run']")
//	public WebElement runBtn1;

	@FindBy(xpath = "//a[text()='Implementation using array']")
	public WebElement implementationUsingArray;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	public WebElement tryHereBtn2;

	@FindBy(xpath = "//a[text()='Queue Operations']")
	public WebElement queueOperations;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	public WebElement tryHereBtn3;

	@FindBy(xpath = "//a[text()='Practice Questions']")
	public WebElement practiceQuestionsBtn;
	
	@FindBy(xpath = "//div[@class='nav-item dropdown']/a")
	public WebElement dropDownBtn;
	
	@FindBy(xpath = "//div[@class='nav-item dropdown show']/div/a[5]")
	public WebElement treeOption;
	
	@FindBy(xpath = "//div[@class='bs-example']/nav/a")
	public WebElement numpyNinjaBtn;
	
	
}
