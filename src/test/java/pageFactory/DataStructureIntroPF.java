package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelSheetReader;

public class DataStructureIntroPF extends BaseClass {


	@FindBy(xpath = "//a[text()='Get Started']")
	public WebElement dataStrIntro_getStartedBtn;

	@FindBy(xpath = "//a[text()='Time Complexity']")
	public WebElement timeComplexityBtn;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	public WebElement tryHereBtn;

	@FindBy(xpath = "//textarea[@tabindex='0']")
	public WebElement input;

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

	public void input() {

		input.sendKeys(ExcelSheetReader.pythonCodeData(2).get(0));
	}

	public void input1() {

		input.sendKeys(ExcelSheetReader.pythonCodeData(3).get(0));
	}

	public void input2() {

		input.sendKeys(ExcelSheetReader.pythonCodeData(1).get(0));
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

	public String expectedErrorResult() {

		return ExcelSheetReader.pythonCodeData(4).get(1);

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

	public String validOutput() {

		return ExcelSheetReader.pythonCodeData(1).get(1);

	}

	public String expectedUrl36() {

		return ExcelSheetReader.expectedUrl(36).get(0);

	}

}
