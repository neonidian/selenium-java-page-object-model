package se.ica.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import se.ica.framework.BrowserFactory;
import se.ica.pages.PageBase;
import se.ica.utilities.ReadProperties;

public class TestBase {

    PageBase page;
    static ReadProperties readProperties;
    static BrowserFactory browserFactory;
    WebDriver webDriver;

    @BeforeAll
    public static void intializeSetup() {
        readProperties= new ReadProperties();
        browserFactory = new BrowserFactory(readProperties.getSeleniumProperties().getString("browser"));
    }

    @BeforeEach
    public void initalizeTest() {
        webDriver = browserFactory.initializeBrowser();
        page = new PageBase();
        page.setWebDriver(webDriver);
    }
}
