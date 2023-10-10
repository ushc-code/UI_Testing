package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class SortByFirstNameTest extends BaseTest {
    @Test
    public void sortByFirstName() {
        customersPage.chooseCustomersTab();
        List<String> expectedMessage = customersPage.getValueFirstColumn();
        Collections.sort(expectedMessage);
        customersPage.sortByFirstName();
        List<String> actualMessage = customersPage.getValueFirstColumn();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
