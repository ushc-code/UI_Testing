package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class CustomersPage extends BasePage {
    public CustomersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = " .center button:last-child")
    WebElement customersTab;
    @FindBy(css = "tr td:first-child")
    WebElement labelFirstName;
    @FindBy(xpath = "//input[@placeholder='Search Customer']")
    WebElement searchInput;
    @FindBy(css = " tbody tr.ng-scope td:first-child")
    WebElement valueFirstName;
    @FindBy(css = "tbody tr.ng-scope td:first-child")
    List<WebElement> valueFirstColumn;

    public void chooseCustomersTab() {
        customersTab.click();
    }

    public void sortByFirstName() {
        Actions act = new Actions(this.driver);
        act.doubleClick(labelFirstName).perform();
    }

    public void searchByFirstName(String name) {
        searchInput.sendKeys(name);
    }

    public String checkResult() {
        return valueFirstName.getText();
    }

    public List<String> getValueFirstColumn() {
        return valueFirstColumn.stream().map(WebElement::getText).collect(Collectors.toList());
    }
}
