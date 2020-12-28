package se.ica.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import se.ica.framework.BrowserFactory;
import se.ica.pages.HandlaPage;
import se.ica.pages.HomePage;
import se.ica.pages.StoreSelectorPage;
import se.ica.utilities.ReadProperties;

abstract public class TestBase {

    private WebDriver webDriver;
    private static BrowserFactory browserFactory;

    HomePage homePage;
    HandlaPage handlaPage;
    StoreSelectorPage storeSelectorPage;

    @BeforeAll
    public static void beforeAllTests() {
        browserFactory = new BrowserFactory(ReadProperties.getSeleniumProperties().getString("browser"));
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
        handlaPage = new HandlaPage(webDriver);
        storeSelectorPage = new StoreSelectorPage(webDriver);
    }
}
