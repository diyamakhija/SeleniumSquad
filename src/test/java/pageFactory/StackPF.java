package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelSheetReader;

public class StackPF extends BaseClass {
	
	ExcelSheetReader excelSheetReader = new ExcelSheetReader();

	public StackPF() {
		super();
	}
	// section of finding links in the page
	@FindBy(xpath = "//div[@class='col'][4]/div/div/a")
	public WebElement stack_getStartedBtn;
	
	@FindBy(xpath = "//a[text()='Operations in Stack']")
		WebElement OperationinStackBtn;
	
	@FindBy(xpath = "//a[text()='Try here>>>']")
	public WebElement tryHereBtn;

	@FindBy(xpath = "//textarea[@tabindex='0']")
	public WebElement input;

	@FindBy(xpath = "//button[text()='Run']")
	public WebElement runBtn;

	@FindBy(xpath = "//a[text()='Implementation']")
	public WebElement implementation;

	@FindBy(xpath = "//pre[@id='output']")
	public WebElement output;
	
	@FindBy(xpath = "//a[text()='Application']")
	public WebElement Application;
	
	@FindBy(xpath = "//a[text()='Practice Questions']")
	public WebElement practiceQuestionsBtn;

	@FindBy(xpath = "//div[@class='nav-item dropdown']/a")
	public WebElement dropDownBtn;
	
	@FindBy(xpath = "//div[@class='nav-item dropdown show']/div/a[4]")
	public WebElement treeOption;

	@FindBy(xpath = "//div[@class='bs-example']/nav/a")
	public WebElement numpyNinjaBtn;

	//end of finding links in the page
	
	
	public void stack_getStartedBtn() {

		stack_getStartedBtn.click();
	}
	
	//open the URL for first time
	public String expectedUrl1() {

		return ExcelSheetReader.expectedUrl(1);
	}
	
	//Takes respective rule from spreadsheet
	public <WebElementOperationinStack> String expectedUrl30() {

		return ExcelSheetReader.expectedUrl(30);
	}
	
	public <operationsin> void OperationinStackBtn(WebElement OperationinStackBtn) {
		OperationinStackBtn.click();
		
	}
	
	//Takes respective rule from spreadsheet
	public <WebElementOperationinStack> String expectedUrl32() {

		return ExcelSheetReader.expectedUrl(32);
	}
	//Takes respective rule from spreadsheet
	public <WebElementOperationinStack> String expectedUrl33() {

			return ExcelSheetReader.expectedUrl(33);
	}
	//Takes respective rule from spreadsheet
	public <WebElementOperationinStack> String expectedUrl34() {

			return ExcelSheetReader.expectedUrl(34);
	}
	public <WebElementOperationinStack> String expectedUrl35() {

		return ExcelSheetReader.expectedUrl(35);
	}
	public <WebElementOperationinStack> String expectedUrl36() {

		return ExcelSheetReader.expectedUrl(36);
	}

	public void OperationinStackBtn() {
		
		OperationinStackBtn.click();
	}

	public void tryHereBtn() {
		tryHereBtn.click();
	}

	public void input() {

		input.sendKeys(ExcelSheetReader.pythonCodeData(2));
	}

	public void input1() {

		input.sendKeys(ExcelSheetReader.pythonCodeData(3));
	}

	public void input2() {

		input.sendKeys(ExcelSheetReader.pythonCodeData(1));
	}

	public void runBtn() {

		runBtn.click();
	}

	public void implementation() {

		implementation.click();
	}

	public void output() {

		output.click();
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

		return ExcelSheetReader.pythonCodeData(2);

	}

	public String expectedSyntaxErrorResult() {

		return ExcelSheetReader.pythonCodeData(3);

	}

	public String expectederrorResult() {

		return ExcelSheetReader.pythonCodeData(4);

	}

}