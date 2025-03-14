package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ExcelSheetReader;

public class TreePF extends BaseClass {

    // ✅ Tree "Get Started" Button
    @FindBy(xpath = "//a[@href='tree']")
    public WebElement treeGetStartedBtn;

 
    @FindBy(xpath = "//a[contains(@href, 'overview-of-trees')]")
   public WebElement overviewOfTreesBtn;
  
    // ✅ Try Here Button
    @FindBy(xpath = "//a[text()='Try here>>>']")
    public WebElement tryHereBtn;

    // ✅ Code Editor
    @FindBy(xpath = "//textarea[@tabindex='0']")
    public WebElement input;

    @FindBy(xpath = "//form/div/div/div/textarea")
    public WebElement editorInput;

    // ✅ Output Console
    @FindBy(xpath = "//pre[@id='output']")
    public WebElement output;

    // ✅ Run Button
    @FindBy(xpath = "//button[@type='button']")
    public WebElement runBtn;

    // ✅ Tree Terminology
    @FindBy(xpath = "//a[contains(@href, 'terminologies')]")
    public WebElement terminologyBtn;

    // ✅ Types of Trees
    @FindBy(xpath = "//a[contains(@href, 'types-of-tree')]")
    public WebElement typesOfTreesBtn;

    // ✅ Tree Traversals
    @FindBy(xpath = "//a[text()='Tree Traversals']")
    public WebElement treeTraversalsBtn;

    // ✅ Practice Questions
    @FindBy(xpath = "//a[text()='Practice Questions']")
    public WebElement practiceQuestionsBtn;

    // ✅ Dropdown Menu
    @FindBy(xpath = "//div[@class='nav-item dropdown']/a")
    public WebElement dropDownBtn;

    // ✅ Queue Option in Dropdown
    @FindBy(xpath = "//div[@class='nav-item dropdown show']/div/a[4]")
    public WebElement queueOption;

    // ✅ Numpy Ninja Button
    @FindBy(xpath = "//div[@class='bs-example']/nav/a")
    public WebElement numpyNinjaBtn;

    // ✅ Click Tree Get Started
    public void clickTreeGetStarted() {
        treeGetStartedBtn.click();
    }

    // ✅ Click Overview of Trees
    public void clickOverviewOfTrees() {
        overviewOfTreesBtn.click();
    }

    // ✅ Click Try Here
    public void clickTryHere() {
        tryHereBtn.click();
    }

    // ✅ Enter Python Code
    public void enterPythonCode() {
        input.sendKeys(ExcelSheetReader.pythonCodeData(2).get(0));
    }

    public void enterPythonCode1() {
        input.sendKeys(ExcelSheetReader.pythonCodeData(3).get(0));
    }

    public void enterPythonCode2() {
        input.sendKeys(ExcelSheetReader.pythonCodeData(1).get(0));
    }

    // ✅ Click Run
    public void clickRun() {
        runBtn.click();
    }

    // ✅ Click Terminology
    public void clickTerminology() {
        terminologyBtn.click();
    }

    // ✅ Click Types of Trees
    public void clickTypesOfTrees() {
        typesOfTreesBtn.click();
    }

    // ✅ Click Tree Traversals
    public void clickTreeTraversals() {
        treeTraversalsBtn.click();
    }

    // ✅ Click Practice Questions
    public void clickPracticeQuestions() {
        practiceQuestionsBtn.click();
    }

    // ✅ Click Dropdown
    public void clickDropDown() {
        dropDownBtn.click();
    }

    // ✅ Click Queue Option
    public void clickQueueOption() {
        queueOption.click();
    }

    // ✅ Click Numpy Ninja
    public void clickNumpyNinja() {
        numpyNinjaBtn.click();
    }

    // ✅ Handle Alerts
    public String handleAlert1() {
        return handleAlert1();
    }

    public String handleNameAlert() {
        return handleAlert1();
    }

    public String handleSyntaxAlert() {
        return handleAlert1();
    }

    // ✅ Expected Error Messages
    public String getExpectedNameError() {
        return ExcelSheetReader.pythonCodeData(2).get(1);
    }

    public String getExpectedSyntaxError() {
        return ExcelSheetReader.pythonCodeData(3).get(1);
    }

    public String getExpectedErrorResult() {
        return ExcelSheetReader.pythonCodeData(4).get(1);
    }

    // ✅ Expected URLs
    public String getExpectedUr43() {
        return ExcelSheetReader.expectedUrl(43).get(0);
    }

    public String getExpectedUrl44() {
        return ExcelSheetReader.expectedUrl(44).get(0);
    }

    public String getExpectedUrl45() {
        return ExcelSheetReader.expectedUrl(45).get(0);
    }

    public String getExpectedUrl46() {
        return ExcelSheetReader.expectedUrl(46).get(0);
    }

    public String getExpectedUrl7() {
        return ExcelSheetReader.expectedUrl(7).get(0);
    }

    public String getExpectedUrl36() {
        return ExcelSheetReader.expectedUrl(36).get(0);
    }

	public void overviewOfTreesBtn() {
		
		overviewOfTreesBtn.click();
	}
}

