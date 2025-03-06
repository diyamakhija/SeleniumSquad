package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedListPF {

    WebDriver driver;

    // Home Page Button (Get Started)
    @FindBy(xpath = "//button[text()='Get Started']")
    private WebElement getStartedButton;

    // Drop-down Menu Option for Linked List
    @FindBy(xpath = "//select[@id='dropdown']//option[text()='Linked List']")
    private WebElement linkedListDropdownOption;

    // Linked List Page elements
    @FindBy(xpath = "//h1[text()='Linked List']")
    private WebElement linkedListPageHeader;

    // Introduction Button
    @FindBy(xpath = "//button[text()='Introduction']")
    private WebElement introductionButton;

    // Try Here Button
    @FindBy(xpath = "//button[text()='Try Here']")
    private WebElement tryHereButton;

    // Constructor
    public LinkedListPF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Actions on the page

    public void clickGetStartedButton() {
        getStartedButton.click();
    }

    public void selectLinkedListFromDropdown() {
        linkedListDropdownOption.click();
    }

    public boolean isLinkedListPageDisplayed() {
        return linkedListPageHeader.isDisplayed();
    }

    public void clickIntroductionButton() {
        introductionButton.click();
    }

    public void clickTryHereButton() {
        tryHereButton.click();
    }
}