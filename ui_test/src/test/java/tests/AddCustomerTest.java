package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddCustomerPage;

public class AddCustomerTest extends BaseTest {
    String message = "Customer added successfully";

    @Test
    public void addCustomer() {
        AddCustomerPage.AddCustomerBuilder().build("Severus", "Snape", "E12345");
        String actualMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Assert.assertTrue(actualMessage.contains(message), "Фактический результат не содержит сообщения о том, что пользователь успешно добавлен");
    }
}
