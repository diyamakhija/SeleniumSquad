package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelSheetReader;

public class QueuePF extends BaseClass {

	@FindBy(xpath = "//div[@class='col'][5]/div/div/a")
	public WebElement queue_getStartedBtn;

	@FindBy(xpath = "//a[text()='Implementation of Queue in Python']")
	public WebElement implementationOfQueueInPythonBtn;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	public WebElement tryHereBtn;

	@FindBy(xpath = "//textarea[@tabindex='0']")
	public WebElement input;

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

	public void input() {

		input.sendKeys(ExcelSheetReader.pythonCodeData(2).get(0));
	}

	public void input1() {

		input.sendKeys(ExcelSheetReader.pythonCodeData(3).get(0));
	}

	public void input2() {

		input.sendKeys(ExcelSheetReader.pythonCodeData(1).get(0));
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

		return handleAlert();

	}

	public String nameHandleAlert() {

		return handleAlert();

	}

	public String syntaxHandleAlert() {

		return handleAlert();

	}

	public String expectedNameErrorResult() {

		return ExcelSheetReader.pythonCodeData(2).get(1);

	}

	public String expectedSyntaxErrorResult() {

		return ExcelSheetReader.pythonCodeData(3).get(1);

	}

	public String expectederrorResult() {

		return ExcelSheetReader.pythonCodeData(4).get(1);

	}

	public String expectedUrl0() {

		return ExcelSheetReader.expectedUrl(0).get(0);

	}

	public String expectedUrl3() {

		return ExcelSheetReader.expectedUrl(3).get(0);
	}

	public String validOutput() {

		return ExcelSheetReader.pythonCodeData(1).get(1);

	}

	public String expectedUrl36() {

		return ExcelSheetReader.expectedUrl(36).get(0);

	}

	public String expectedUrl37() {

		return ExcelSheetReader.expectedUrl(37).get(0);

	}

	public String expectedUrl38() {

		return ExcelSheetReader.expectedUrl(38).get(0);

	}

	public String expectedUrl39() {

		return ExcelSheetReader.expectedUrl(39).get(0);

	}

	public String expectedUrl40() {

		return ExcelSheetReader.expectedUrl(40).get(0);

	}

	public String expectedUrl41() {

		return ExcelSheetReader.expectedUrl(41).get(0);

	}

	public String expectedUrl43() {

		return ExcelSheetReader.expectedUrl(43).get(0);

	}

}
