package se.ica.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import se.ica.framework.BrowserFactory;
import se.ica.pages.PageBase;
import se.ica.utilities.ReadProperties;

public class TestBase {

    PageBase page;
    ReadProperties readProperties;
    BrowserFactory browserFactory;
    WebDriver webDriver;

    @BeforeAll
    public void intializeSetup() {
        readProperties= new ReadProperties();
        browserFactory = new BrowserFactory(readProperties.getSeleniumProperties());
    }

    @BeforeEach
    public void initalizeTest() {
        webDriver = browserFactory.initializeBrowser();
        page = new PageBase();
        page.setWebDriver(webDriver);
    }
}
