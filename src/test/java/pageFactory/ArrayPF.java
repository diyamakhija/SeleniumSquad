package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArrayPF {
  
    // Page Elements for Array Page
    @FindBy(xpath = "//button[text()='Get Started'][contains(@aria-label, 'Array')]")
	static
    WebElement getStartedArrayButton;

    @FindBy(xpath = "//button[text()='Arrays in Python']")
    WebElement arraysInPythonButton;

    @FindBy(xpath = "//button[text()='Try Here']")
    WebElement tryHereButton;

    @FindBy(xpath = "//button[text()='Run']")
    WebElement runButton;

    @FindBy(xpath = "//button[text()='Practice Questions']")
    WebElement practiceQuestionsButton;

    @FindBy(xpath = "//a[text()='Search the Array']")
    WebElement searchArrayLink;

    @FindBy(xpath = "//textarea[@id='editor']")
    WebElement codeEditor;

    @FindBy(xpath = "//button[text()='Submit']")
    WebElement submitButton;

    @FindBy(xpath = "//div[@class='alert-message']")
    WebElement alertMessage;

    @FindBy(xpath = "//div[@class='output']")
    WebElement consoleOutput;

    // Methods for interacting with elements on the page

    public static void clickGetStartedArrayButton() {
        getStartedArrayButton.click();
    }

    public void clickArraysInPythonButton() {
        arraysInPythonButton.click();
    }

    public void clickTryHereButton() {
        tryHereButton.click();
    }

    public void clickRunButton() {
        runButton.click();
    }

    public void clickPracticeQuestionsButton() {
        practiceQuestionsButton.click();
    }

    public void clickSearchArrayLink() {
        searchArrayLink.click();
    }

    public void enterCodeInEditor(String code) {
        codeEditor.sendKeys(code);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public String getAlertMessage() {
        return alertMessage.getText();
    }

    public String getConsoleOutput() {
        return consoleOutput.getText();
    }
}
