package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webDriverManager.DriverFactory;

public class GraphPF {

    // Initializing the PageFactory elements
    public GraphPF() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    // WebElement for "Get Started" button in Graph Panel
    @FindBy(xpath = "//button[text()='Get Started']")
    private WebElement getStartedButton;

    // WebElement for "Graph" button
    @FindBy(xpath = "//button[text()='Graph']")
    private WebElement graphButton;

    // WebElement for "Try Here" button in Graph page
    @FindBy(xpath = "//button[text()='Try Here']")
    private WebElement tryHereButton;

    // WebElement for "Run" button in the Try Editor page
    @FindBy(id = "run")
    private WebElement runButton;

    // WebElement for error alert in Try Editor page
    @FindBy(id = "errorAlert")
    private WebElement errorAlert;

    // WebElement for the Editor (Python code editor)
    @FindBy(id = "editor")
    private WebElement codeEditor;

    // WebElement for console output
    @FindBy(id = "console")
    private WebElement consoleOutput;

    // Method to click "Get Started" button in Graph Panel
    public void clickGetStartedButton() {
        getStartedButton.click();
    }

    // Method to click "Graph" button
    public void clickGraphButton() {
        graphButton.click();
    }

    // Method to click "Try Here" button in Graph page
    public void clickTryHereButton() {
        tryHereButton.click();
    }

    // Method to click "Run" button in Try Editor page
    public void clickRunButton() {
        runButton.click();
    }

    // Method to write code in the editor
    public void writeCode(String code) {
        codeEditor.sendKeys(code);
    }

    // Method to get the error message from the alert window
    public String getErrorMessage() {
        return errorAlert.getText();
    }

    // Method to get the output from the console
    public String getConsoleOutput() {
        return consoleOutput.getText();
    }

    // Check if the editor is displayed
    public boolean isEditorDisplayed() {
        return codeEditor.isDisplayed();
    }

    // Check if the error alert is displayed
    public boolean isErrorAlertDisplayed() {
        return errorAlert.isDisplayed();
    }
}
