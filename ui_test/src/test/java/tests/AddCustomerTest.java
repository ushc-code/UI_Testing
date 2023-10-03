package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCustomerTest extends BaseTest {
    String message = "Customer added successfully";

    @Test
    public void addCustomer() {
        addCustomerPage.chooseAddCustomerTab();
        addCustomerPage.fillFirstName("Severus");
        addCustomerPage.fillLastName("Snape");
        addCustomerPage.fillPostCode("E12345");
        addCustomerPage.submitForm();
        String actualMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Assert.assertTrue(actualMessage.contains(message));

    }
}
