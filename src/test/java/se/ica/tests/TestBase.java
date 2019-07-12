package se.ica.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import se.ica.framework.BrowserFactory;
import se.ica.pages.HomePage;
import se.ica.pages.PageBase;
import se.ica.utilities.ReadProperties;

public class TestBase {

    HomePage homePage;
    WebDriver webDriver;
    static BrowserFactory browserFactory;
    static ReadProperties readProperties;

    @BeforeAll
    public static void beforeAllTests() {
        readProperties= new ReadProperties();
        browserFactory = new BrowserFactory(readProperties.getSeleniumProperties().getString("browser"));
    }

    @BeforeEach
    public void beforeEachTest() {
        webDriver = browserFactory.initializeBrowser();
        initializePages(webDriver);
    }

    @AfterEach
    public void afterEachTest() {
        webDriver.quit();
    }

    private void initializePages(WebDriver webDriver) {
        homePage = new HomePage(webDriver);
    }
}
