package pageFactory;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ExcelSheetReader;

public class TreePF extends BaseClass {

    
    @FindBy(xpath = "//a[@href='tree']")
    public WebElement treeGetStartedBtn;

 
    @FindBy(xpath = "//a[contains(@href, 'overview-of-trees')]")
   public WebElement overviewOfTreesBtn;
  
   
    @FindBy(xpath = "//a[text()='Try here>>>']")
    public WebElement tryHereBtn;

    
    @FindBy(xpath = "//textarea[@tabindex='0']")
    public WebElement input;

    @FindBy(xpath = "//form/div/div/div/textarea")
    public WebElement editorInput;
    
    @FindBy(xpath = "//form[@id='answer_form']")
	public WebElement form;

    
    @FindBy(xpath = "//pre[@id='output']")
    public WebElement output;

    
    @FindBy(xpath = "//button[@type='button']")
    public WebElement runBtn;

   
    @FindBy(xpath = "//a[contains(@href, 'terminologies')]")
    public WebElement terminologyBtn;

    
    @FindBy(xpath = "//a[contains(@href, 'types-of-tree')]")
    public WebElement typesOfTreesBtn;

    
    @FindBy(xpath = "//a[text()='Tree Traversals']")
    public WebElement treeTraversalsBtn;

    
    @FindBy(xpath = "//a[text()='Practice Questions']")
    public WebElement practiceQuestionsBtn;

    
    @FindBy(xpath = "//div[@class='nav-item dropdown']/a")
    public WebElement dropDownBtn;

    
    @FindBy(xpath = "//div[@class='nav-item dropdown show']/div/a[4]")
    public WebElement queueOption;

    
    @FindBy(xpath = "//div[@class='bs-example']/nav/a")
    public WebElement numpyNinjaBtn;

    
    public void clickTreeGetStarted() {
        treeGetStartedBtn.click();
    }

    
    public void clickOverviewOfTrees() {
        overviewOfTreesBtn.click();
    }

    
    public void clickTryHere() {
        tryHereBtn.click();
    }

    public void codeEditorInput(String sheetName, Integer rowNumber) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
		webDriverWait.until(ExpectedConditions.visibilityOf(form));
		form.click();
		editorInput.sendKeys(ExcelSheetReader.getExcelSheetData(sheetName, rowNumber,"pCode"));
	}
    

    
    public void clickRun() {
        runBtn.click();
    }

public void overviewOfTreesBtn() {
		
		overviewOfTreesBtn.click();
	}
    
    public void clickTerminology() {
        terminologyBtn.click();
    }

    
    public void clickTypesOfTrees() {
        typesOfTreesBtn.click();
    }

   
    public void clickTreeTraversals() {
        treeTraversalsBtn.click();
    }

    
    public void clickPracticeQuestions() {
        practiceQuestionsBtn.click();
    }

    
    public void clickDropDown() {
        dropDownBtn.click();
    }

    
    public void clickQueueOption() {
        queueOption.click();
    }

    
    public void clickNumpyNinja() {
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

