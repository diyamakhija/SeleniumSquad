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
	public WebElement queueOption;

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

<<<<<<< Updated upstream
	public void codeEditorInput(String sheetName, Integer rowNumber, Integer InputCol) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
		webDriverWait.until(ExpectedConditions.visibilityOf(form));
		form.click();
		editorInput.sendKeys(ExcelSheetReader.getExcelSheetData(sheetName, rowNumber, InputCol));
=======
	public void codeEditorInput(String sheetName, Integer rowNumber) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
		webDriverWait.until(ExpectedConditions.visibilityOf(form));
		form.click();
		editorInput.sendKeys(ExcelSheetReader.getExcelSheetData(sheetName, rowNumber,"pCode"));
>>>>>>> Stashed changes
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

	public void queueOption() {

		queueOption.click();
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
	
<<<<<<< Updated upstream
	public String expectedResult(String sheetName, Integer RowNumber, Integer expectedCol) {

		String  expectedErrorResult=ExcelSheetReader.getExcelSheetData1(sheetName, RowNumber, expectedCol);
		return expectedErrorResult;

	}

	public String expectedUrl(String sheetName, Integer RowNumber, Integer expectedCol) {

		String  expectedUrl=ExcelSheetReader.getExcelSheetData(sheetName, RowNumber, expectedCol);
		return expectedUrl;

	}

	public String expectedUrl0() {

		return ExcelSheetReader.expectedUrl(0).get(0);

	}

	public String expectedUrl3() {

		return ExcelSheetReader.expectedUrl(3).get(0);
	}

	public String expectedUrl5() {

		return ExcelSheetReader.expectedUrl(5).get(0);

	}

	public String expectedUrl6() {

		return ExcelSheetReader.expectedUrl(6).get(0);

	}

	public String expectedUrl7() {

		return ExcelSheetReader.expectedUrl(7).get(0);

	}

	public String expectedUrl36() {

		return ExcelSheetReader.expectedUrl(36).get(0);

	}

=======
	public String expectedResult(String sheetName, Integer RowNumber) {

		String  expectedErrorResult=ExcelSheetReader.getExcelSheetData(sheetName, RowNumber, "Result");
		return expectedErrorResult;

	}
>>>>>>> Stashed changes
}



