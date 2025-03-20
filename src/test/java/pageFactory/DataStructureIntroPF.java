package pageFactory;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ExcelSheetReader;

public class DataStructureIntroPF extends BaseClass {


	@FindBy(xpath = "//a[text()='Get Started']")
	public WebElement dataStrIntro_getStartedBtn;

	@FindBy(xpath = "//a[text()='Time Complexity']")
	public WebElement timeComplexityBtn;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	public WebElement tryHereBtn;

	@FindBy(xpath = "//form[@id='answer_form']")
	public WebElement form;

	@FindBy(xpath = "//form/div/div/div/textarea")
	public WebElement editorInput;

	@FindBy(xpath = "//pre[@id='output']")
	public WebElement output;

	@FindBy(xpath = "//button[@type='button']")
	public WebElement runBtn;

	@FindBy(xpath = "//a[text()='Practice Questions']")
	public WebElement practiceQuestionsBtn;

	@FindBy(xpath = "//div[@class='nav-item dropdown']/a")
	public WebElement dropDownBtn;

	@FindBy(xpath = "//div[@class='nav-item dropdown show']/div/a[4]")
	public WebElement queue;

	@FindBy(xpath = "//div[@class='bs-example']/nav/a")
	public WebElement numpyNinjaBtn;

	public void dataStrIntro_getStartedBtn() {

		dataStrIntro_getStartedBtn.click();
	}

	public void timeComplexityBtn() {

		timeComplexityBtn.click();
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
	
	public void output() {

		output.click();
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

	public void queue() {

		queue.click();
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


