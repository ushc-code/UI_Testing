package tests;

import helpers.PropertyProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.AddCustomerPage;
import pages.CustomersPage;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver = new ChromeDriver();
    private static final String LINK = PropertyProvider.getInctance().getProperty("link");
    AddCustomerPage addCustomerPage = new AddCustomerPage(driver);
    CustomersPage customersPage = new CustomersPage(driver);

    @BeforeTest
    public void setup() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(LINK);
    }

    @AfterTest
    public void close() {
        driver.close();
    }
}
