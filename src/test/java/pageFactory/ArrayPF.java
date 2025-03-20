package pageFactory;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.ExcelSheetReader;
import utilities.LoggerLoad;
import pageFactory.BaseClass;

public class ArrayPF extends BaseClass {
	ExcelSheetReader excelSheetReader = new ExcelSheetReader();
	public ArrayPF() {
		super();
	}

	@FindBy(xpath = "//a[@href='array' and contains(@class, 'btn-primary')]")
	
	WebElement getStartedArrayButton;

	@FindBy(xpath = "//a[text()='Arrays in Python']")
	WebElement arraysInPythonButton;

	@FindBy(xpath = "//a[text()='Arrays Using List']")
	WebElement arraysUsingListButton;
	
	@FindBy(xpath = "//a[text()='Basic Operations in Lists']")
	WebElement basicOperaInListsButton;
	
	@FindBy(xpath = "//a[text()='Applications of Array']")
	WebElement applicationsOfArrayButton;
	
	
	@FindBy(xpath = "//a[text()='Try here>>>']")
	WebElement tryHereButton;

	@FindBy(xpath = "//button[@type='button']")
	WebElement runButton;

	@FindBy(xpath = "//a[@href='/array/practice']")
	WebElement practiceQuestionsButton;

	@FindBy(xpath = "//a[contains(@href, '/question/1')]")
	WebElement searchArrayLink;

	@FindBy(xpath = "//textarea[@id='editor']")
	WebElement codeEditor;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitButton;
	
	@FindBy(xpath = "//textarea[@tabindex='0']")
	public WebElement input;

	@FindBy(xpath = "//form/div/div/div/textarea")
	public WebElement editorInput;

	@FindBy(xpath = "//pre[@id='output']")
	public WebElement output;

	@FindBy(xpath = "//div[@class='alert-message']")
	WebElement alertMessage;

	@FindBy(xpath = "//div[@class='output']")
	WebElement consoleOutput;


//	 Methods for interacting with elements on the page
	public void clickRunBtn() {

		runButton.click();
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

    public void clickGetStartedArrayButton() {
        getStartedArrayButton.click();
    }

	public void clickArraysInPythonButton() {
		arraysInPythonButton.click();
	}
	
	public void clickArraysUsingListButton() {
		arraysUsingListButton.click();
	}
	
	public void clickBasicOperaInListsButton() {
		basicOperaInListsButton.click();
	}
	
	public void clickApplicationsOfArrayButton() {
		applicationsOfArrayButton.click();
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
	public void input() {

		input.sendKeys(ExcelSheetReader.pythonCodeData(2));
	}

	public void input1() {

		input.sendKeys(ExcelSheetReader.pythonCodeData(3));
	}

	public void input2() {

		input.sendKeys(ExcelSheetReader.pythonCodeData(1));
	}

////Method to login to DS Algo Portal
//public void loginToDsAlgoPortal(String username, String password) {
//    // Enter the username and password
//    usernameField.sendKeys(username);
//    passwordField.sendKeys(password);
//    loginButton.click(); // Click login button
//
//    // Optionally, wait for home page title to be visible (indicating successful login)
//    waitForElement(homePageTitle);
//}
//
//// Helper method to wait for an element to be visible
//private void waitForElement(WebElement element) {
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    wait.until(ExpectedConditions.visibilityOf(element));  // Wait for the element to become visible
//}

public String expectedUrl9() {

	return ExcelSheetReader.expectedUrl(9);
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
public String validOutput() {

	return ExcelSheetReader.pythonCodeData(1);

}

public String expectedUrl0() {

	return ExcelSheetReader.expectedUrl(0);

}

public String expectedUrl3() {

	return ExcelSheetReader.expectedUrl(3);
}

public String expectedUrl10() {

	return ExcelSheetReader.expectedUrl(10);

}

public String expectedUrl11() {

	return ExcelSheetReader.expectedUrl(11);

}


public String expectedUrl12() {

	return ExcelSheetReader.expectedUrl(12);

}

public String expectedUrl13() {

	return ExcelSheetReader.expectedUrl(13);

}

public String expectedUrl14() {

	return ExcelSheetReader.expectedUrl(14);

}

public String expectedUrl15() {

	return ExcelSheetReader.expectedUrl(15);

}

public String expectedUrl16() {

	return ExcelSheetReader.expectedUrl(16);

}

public String expectedUrl17() {

	return ExcelSheetReader.expectedUrl(17);
}

public String expectedUrl18() {

	return ExcelSheetReader.expectedUrl(18);

}
public void output() {

consoleOutput.click();
}
public String getCurrentUrl() {
    return driver.getCurrentUrl();  // Ensure this returns the actual browser URL
}



public String getExpectedUrl(String pageName) {
    switch (pageName.toLowerCase()) {
        case "practice":
            return ExcelSheetReader.expectedUrl(14);
        case "search the array":
            return ExcelSheetReader.expectedUrl(15);
        default:
            return "";
    }
}

	

public String handleAlert() {
    String alertText = "";
    try {
        // Wait for the alert to be present (optional but recommended)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alertText = alert.getText();
        alert.accept();

        LoggerLoad.info("Alert accepted with text: " + alertText);

    } catch (NoAlertPresentException e) {
        // Alert was not present as expected
        LoggerLoad.error("Alert was not present.");
        Assert.fail("No alert was triggered as expected.");  // Fail the test with a message
    } catch (Exception e) {
        // Some other error occurred
        LoggerLoad.error("An error occurred: " + e.getMessage());
        Assert.fail("An unexpected error occurred: " + e.getMessage());  // Fail the test with an error message
    }
    return alertText;
}

}


