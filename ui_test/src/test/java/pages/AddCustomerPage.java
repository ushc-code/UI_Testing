package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends BasePage {
    public AddCustomerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = " .center button:nth-child(1)")
    WebElement addCustomersTab;
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCode;
    @FindBy(css = ".btn-default")
    WebElement submitButton;

    public static AddCustomerPageBuilder AddCustomerBuilder() {
        return new AddCustomerPageBuilder();
    }
}
