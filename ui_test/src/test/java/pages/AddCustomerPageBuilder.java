package pages;

import static tests.BaseTest.driver;

public class AddCustomerPageBuilder {
    private AddCustomerPage addCustomerPage;

    public AddCustomerPageBuilder() {
        addCustomerPage = new AddCustomerPage(driver);
    }

    public void chooseAddCustomerTab() {
        addCustomerPage.addCustomersTab.click();
    }

    public void fillFirstName(String name) {
        addCustomerPage.firstName.sendKeys(name);
    }

    public void fillLastName(String name) {
        addCustomerPage.lastName.sendKeys(name);
    }

    public void fillPostCode(String code) {
        addCustomerPage.postCode.sendKeys(code);
    }

    public void submitForm() {
        addCustomerPage.submitButton.click();
    }

    public void build(String firstName, String lastName, String code) {
        chooseAddCustomerTab();
        fillFirstName(firstName);
        fillLastName(lastName);
        fillPostCode(code);
        submitForm();
    }
}
