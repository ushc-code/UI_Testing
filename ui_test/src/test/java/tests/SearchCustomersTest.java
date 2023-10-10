package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchCustomersTest extends BaseTest {
    @Test
    public void searchCustomers() {
        customersPage.chooseCustomersTab();
        customersPage.searchByFirstName("Albus");
        Assert.assertEquals(customersPage.checkResult(), "Albus");
    }
}
