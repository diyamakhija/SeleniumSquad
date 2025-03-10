package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelSheetReader;

public class LinkedListPF extends BaseClass {

    WebDriver driver;

   

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

	@FindBy(xpath = "//textarea[@tabindex='0']")
	public WebElement input;
	
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
	

    public LinkedListPF() {
		super();
    }

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

	public String expectedUrl20() {
		return ExcelSheetReader.expectedUrl(20).get(0);

	}

	public String expectedUrl21() {
		return ExcelSheetReader.expectedUrl(21).get(0);

	}

	public String expectedUrl22() {
		return ExcelSheetReader.expectedUrl(22).get(0);

	}

	public String expectedUrl23() {
		return ExcelSheetReader.expectedUrl(23).get(0);

	}

	public String expectedUrl24() {
		return ExcelSheetReader.expectedUrl(24).get(0);

	}

	public String expectedUrl25() {
		return ExcelSheetReader.expectedUrl(25).get(0);

	}

	public String expectedUrl26() {
		return ExcelSheetReader.expectedUrl(26).get(0);

	}
	
	public String expectedUrl27() {
		return ExcelSheetReader.expectedUrl(27).get(0);

	}
	
	public String expectedUrl28() {
		return ExcelSheetReader.expectedUrl(28).get(0);

	}

}