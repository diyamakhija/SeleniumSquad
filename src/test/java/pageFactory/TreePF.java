//package pageFactory;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import utilities.ExcelSheetReader;
//
//public class TreePF extends BaseClass {
//
//    
//    @FindBy(xpath = "//a[@href='tree']")
//    public WebElement treeGetStartedBtn;
//
// 
//    @FindBy(xpath = "//a[contains(@href, 'overview-of-trees')]")
//   public WebElement overviewOfTreesBtn;
//  
//   
//    @FindBy(xpath = "//a[text()='Try here>>>']")
//    public WebElement tryHereBtn;
//
//    
//    @FindBy(xpath = "//textarea[@tabindex='0']")
//    public WebElement input;
//
//    @FindBy(xpath = "//form/div/div/div/textarea")
//    public WebElement editorInput;
//    
//    @FindBy(xpath = "//form[@id='answer_form']")
//	public WebElement form;
//
//    
//    @FindBy(xpath = "//pre[@id='output']")
//    public WebElement output;
//
//    
//    @FindBy(xpath = "//button[@type='button']")
//    public WebElement runBtn;
//
//   
//    @FindBy(xpath = "//a[contains(@href, 'terminologies')]")
//    public WebElement terminologyBtn;
//
//    
//    @FindBy(xpath = "//a[contains(@href, 'types-of-tree')]")
//    public WebElement typesOfTreesBtn;
//
//    
//    @FindBy(xpath = "//a[text()='Tree Traversals']")
//    public WebElement treeTraversalsBtn;
//
//    
//    @FindBy(xpath = "//a[text()='Practice Questions']")
//    public WebElement practiceQuestionsBtn;
//
//    
//    @FindBy(xpath = "//div[@class='nav-item dropdown']/a")
//    public WebElement dropDownBtn;
//
//    
//    @FindBy(xpath = "//div[@class='nav-item dropdown show']/div/a[4]")
//    public WebElement queueOption;
//
//    
//    @FindBy(xpath = "//div[@class='bs-example']/nav/a")
//    public WebElement numpyNinjaBtn;
//
//    
//    public void clickTreeGetStarted() {
//        treeGetStartedBtn.click();
//    }
//
//    
//    public void clickOverviewOfTrees() {
//        overviewOfTreesBtn.click();
//    }
//
//    
//    public void clickTryHere() {
//        tryHereBtn.click();
//    }
//
//    
//    public void nameinput() {
//		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		webDriverWait.until(ExpectedConditions.visibilityOf(form));
//		form.click();
//		editorInput.sendKeys(ExcelSheetReader.pythonCodeData(2).get(0));		
//		
//	}
//
//	public void syntaxinput() {
//
//		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		webDriverWait.until(ExpectedConditions.visibilityOf(form));
//		form.click();
//		editorInput.sendKeys(ExcelSheetReader.pythonCodeData(3).get(0));
//	}
//
//	public void validinput() {
//
//		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		webDriverWait.until(ExpectedConditions.visibilityOf(form));
//		form.click();
//		editorInput.sendKeys(ExcelSheetReader.pythonCodeData(1).get(0));
//	}
//    
//    public void enterPythonCode() {
//        input.sendKeys(ExcelSheetReader.pythonCodeData(2).get(0));
//    }
//
//    public void enterPythonCode1() {
//        input.sendKeys(ExcelSheetReader.pythonCodeData(3).get(0));
//    }
//
//    public void enterPythonCode2() {
//        input.sendKeys(ExcelSheetReader.pythonCodeData(1).get(0));
//    }
//
//    
//    public void clickRun() {
//        runBtn.click();
//    }
//
//    
//    public void clickTerminology() {
//        terminologyBtn.click();
//    }
//
//    
//    public void clickTypesOfTrees() {
//        typesOfTreesBtn.click();
//    }
//
//   
//    public void clickTreeTraversals() {
//        treeTraversalsBtn.click();
//    }
//
//    
//    public void clickPracticeQuestions() {
//        practiceQuestionsBtn.click();
//    }
//
//    
//    public void clickDropDown() {
//        dropDownBtn.click();
//    }
//
//    
//    public void clickQueueOption() {
//        queueOption.click();
//    }
//
//    
//    public void clickNumpyNinja() {
//        numpyNinjaBtn.click();
//    }
//
//    
//    public String handleAlert1() {
//        return handleAlert1();
//    }
//
//    public String handleNameAlert() {
//        return handleAlert1();
//    }
//
//    public String handleSyntaxAlert() {
//        return handleAlert1();
//    }
//
//   
//    public String getExpectedNameError() {
//        return ExcelSheetReader.pythonCodeData(2).get(1);
//    }
//
//    public String getExpectedSyntaxError() {
//        return ExcelSheetReader.pythonCodeData(3).get(1);
//    }
//
//    public String getExpectedErrorResult() {
//        return ExcelSheetReader.pythonCodeData(4).get(1);
//    }
//
//    
//    public String getExpectedUr43() {
//        return ExcelSheetReader.expectedUrl(43).get(0);
//    }
//
//    public String getExpectedUrl44() {
//        return ExcelSheetReader.expectedUrl(44).get(0);
//    }
//
//    public String getExpectedUrl45() {
//        return ExcelSheetReader.expectedUrl(45).get(0);
//    }
//
//    public String getExpectedUrl46() {
//        return ExcelSheetReader.expectedUrl(46).get(0);
//    }
//
//    public String getExpectedUrl7() {
//        return ExcelSheetReader.expectedUrl(7).get(0);
//    }
//
//    public String getExpectedUrl36() {
//        return ExcelSheetReader.expectedUrl(36).get(0);
//    }
//
//	public void overviewOfTreesBtn() {
//		
//		overviewOfTreesBtn.click();
//	}
//}
//
