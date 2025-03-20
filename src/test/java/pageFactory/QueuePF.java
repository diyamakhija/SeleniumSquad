package pageFactory;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ExcelSheetReader;

public class QueuePF extends BaseClass {

	@FindBy(xpath = "//div[@class='col'][5]/div/div/a")
	public WebElement queue_getStartedBtn;

	@FindBy(xpath = "//a[text()='Implementation of Queue in Python']")
	public WebElement implementationOfQueueInPythonBtn;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	public WebElement tryHereBtn;

	@FindBy(xpath = "//form[@id='answer_form']")
	public WebElement form;
	
	@FindBy(xpath = "//form/div/div/div/textarea")
	public WebElement editorInput;

	@FindBy(xpath = "//button[text()='Run']")
	public WebElement runBtn;

	@FindBy(xpath = "//a[text()='Implementation using collections.deque']")
	public WebElement implementationUsingCollectionsDeque;

	@FindBy(xpath = "//pre[@id='output']")
	public WebElement output;

	@FindBy(xpath = "//a[text()='Implementation using array']")
	public WebElement implementationUsingArray;

	@FindBy(xpath = "//a[text()='Queue Operations']")
	public WebElement queueOperations;

	@FindBy(xpath = "//a[text()='Practice Questions']")
	public WebElement practiceQuestionsBtn;

	@FindBy(xpath = "//div[@class='nav-item dropdown']/a")
	public WebElement dropDownBtn;

	@FindBy(xpath = "//div[@class='nav-item dropdown show']/div/a[5]")
	public WebElement treeOption;

	@FindBy(xpath = "//div[@class='bs-example']/nav/a")
	public WebElement numpyNinjaBtn;

	public void queue_getStartedBtn() {

		queue_getStartedBtn.click();
	}

	public void implementationOfQueueInPythonBtn() {

		implementationOfQueueInPythonBtn.click();
	}

	public void tryHereBtn() {

		tryHereBtn.click();
		 
	}

	public void nameinput() {
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
		webDriverWait.until(ExpectedConditions.visibilityOf(form));
		form.click();
		editorInput.sendKeys(ExcelSheetReader.pythonCodeData(2));		
		
	}

	public void syntaxinput() {

		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
		webDriverWait.until(ExpectedConditions.visibilityOf(form));
		form.click();
		editorInput.sendKeys(ExcelSheetReader.pythonCodeData(3));
	}

	public void validinput() {

		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
		webDriverWait.until(ExpectedConditions.visibilityOf(form));
		form.click();
		editorInput.sendKeys(ExcelSheetReader.pythonCodeData(1));
	}

	public void runBtn() {

		runBtn.click();
	
	}

	public void implementationUsingCollectionsDeque() {

		implementationUsingCollectionsDeque.click();
	}

	public void output() {

		output.click();
	}

	public void implementationUsingArray() {

		implementationUsingArray.click();
	}

	public void queueOperations() {

		queueOperations.click();
	}

	public void practiceQuestionsBtn() {

		practiceQuestionsBtn.click();
	}

	public void dropDownBtn() {

		dropDownBtn.click();
	}

	public void treeOption() {

		treeOption.click();
	}

	public void numpyNinjaBtn() {

		numpyNinjaBtn.click();
	}

	public String handleAlert1() {

		 String handleAlert1 = handleAlert();
		 return handleAlert1;

	}

	public String nameHandleAlert() {

		 String nameHandleAlert = handleAlert();
		 return nameHandleAlert;

	}

	public String syntaxHandleAlert() {

		 String syntaxHandleAlert = handleAlert();
		 return syntaxHandleAlert;

	}

	public String expectedNameErrorResult() {

		String  expectedNameErrorResult=ExcelSheetReader.pythonCodeData(2);
		return expectedNameErrorResult;

	}

	public String expectedSyntaxErrorResult() {

		 String expectedSyntaxErrorResult = ExcelSheetReader.pythonCodeData(3);
		 return expectedSyntaxErrorResult ;

	}

	public String expectederrorResult() {

		String expectederrorResult = ExcelSheetReader.pythonCodeData(4);
		 return expectederrorResult;

	}

	public String expectedUrl0() {

		return ExcelSheetReader.expectedUrl(0);

	}

	public String expectedUrl3() {

		return ExcelSheetReader.expectedUrl(3);
	}

	public String validOutput() {

		return ExcelSheetReader.pythonCodeData(1);

	}

	public String expectedUrl36() {

		return ExcelSheetReader.expectedUrl(36);

	}

	public String expectedUrl37() {

		return ExcelSheetReader.expectedUrl(37);

	}

	public String expectedUrl38() {

		return ExcelSheetReader.expectedUrl(38);

	}

	public String expectedUrl39() {

		return ExcelSheetReader.expectedUrl(39);

	}

	public String expectedUrl40() {

		return ExcelSheetReader.expectedUrl(40);

	}

	public String expectedUrl41() {

		return ExcelSheetReader.expectedUrl(41);

	}

	public String expectedUrl43() {

		return ExcelSheetReader.expectedUrl(43);

	}

}
