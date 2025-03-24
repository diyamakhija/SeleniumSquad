package pageFactory;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ExcelSheetReader;

public class LinkedListPF extends BaseClass {

	@FindBy(xpath = "//div[@class='col'][3]/div/div/a")
	private WebElement linkedListGetStartedBtn;

	@FindBy(xpath = "//a[@href='introduction']")
	private WebElement introductionBtn;

	@FindBy(xpath = "//a[@href='creating-linked-list']")
	private WebElement creatingLinkedListBtn;

	@FindBy(xpath = "//a[@href='types-of-linked-list']")
	private WebElement typesOfLinkedListBtn;

	@FindBy(xpath = "//a[@href='implement-linked-list-in-python']")
	private WebElement implementLinkedListInPythonBtn;

	@FindBy(xpath = "//a[@href='traversal']")
	private WebElement traversalBtn;

	@FindBy(xpath = "//a[@href='insertion-in-linked-list']")
	private WebElement insertionBtn;

	@FindBy(xpath = "//a[@href='deletion-in-linked-list']")
	private WebElement deletionBtn;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	public WebElement tryHereBtn;

	@FindBy(xpath = "//form[@id='answer_form']")
	public WebElement form;

	@FindBy(xpath = "//form/div/div/div/textarea")
	public WebElement editorInput;

	@FindBy(xpath = "//pre[@id='output']")
	public WebElement output;

	@FindBy(xpath = "//button[text()='Run']")
	public WebElement runBtn;

	@FindBy(xpath = "//a[text()='Practice Questions']")
	public WebElement practiceQuestionsBtn;

	@FindBy(xpath = "//div[@class='nav-item dropdown']/a")
	public WebElement dropDownBtn;

	@FindBy(xpath = "//div[@class='nav-item dropdown show']/div/a[5]")
	public WebElement treeOption;

	@FindBy(xpath = "//div[@class='bs-example']/nav/a")
	public WebElement numpyNinjaBtn;

	public void linkedListGetStartedBtn() {
		linkedListGetStartedBtn.click();
	}

	public void introductionBtn() {
		introductionBtn.click();
	}

	public void creatingLinkedListBtn() {
		creatingLinkedListBtn.click();
	}

	public void typesOfLinkedListBtn() {
		typesOfLinkedListBtn.click();
	}

	public void implementLinkedListInPythonBtn() {
		implementLinkedListInPythonBtn.click();
	}

	public void traversalBtn() {
		traversalBtn.click();
	}

	public void insertionBtn() {
		insertionBtn.click();
	}

	public void DeletionBtn() {
		deletionBtn.click();
	}

	public void tryHereBtn() {
		tryHereBtn.click();

	}

	public void codeEditorInput(String sheetName, Integer rowNumber) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
		webDriverWait.until(ExpectedConditions.visibilityOf(form));
		form.click();
		editorInput.sendKeys(ExcelSheetReader.getExcelSheetData(sheetName, rowNumber,"pCode"));
	}
	
	public void runBtn() {
		runBtn.click();

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

	public String expectedResult(String sheetName, Integer RowNumber) {

		String  expectedErrorResult=ExcelSheetReader.getExcelSheetData(sheetName, RowNumber, "Result");
		return expectedErrorResult;
	}

}