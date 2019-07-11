package se.ica.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import se.ica.framework.BrowserFactory;
import se.ica.pages.PageBase;
import se.ica.utilities.ReadProperties;

public class TestBase {

    PageBase pageBase;
    WebDriver webDriver;
    static BrowserFactory browserFactory;
    static ReadProperties readProperties;

    @BeforeAll
    public static void intializeSetup() {
        readProperties= new ReadProperties();
        browserFactory = new BrowserFactory(readProperties.getSeleniumProperties().getString("browser"));
    }

    @BeforeEach
    public void initalizeTest() {
        webDriver = browserFactory.initializeBrowser();
        pageBase = new PageBase();
        pageBase.initializePages();
        pageBase.setWebDriver(webDriver);
    }
}
