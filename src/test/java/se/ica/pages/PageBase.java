package se.ica.pages;

import org.openqa.selenium.WebDriver;
import se.ica.framework.SeleniumActions;

public class PageBase {

    public HomePage homePage;
    WebDriver webDriver;
    SeleniumActions seleniumActions;

    public PageBase() {
        initializePages();
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
        seleniumActions = new SeleniumActions(webDriver);
    }

    private void initializePages() {
        homePage = new HomePage();
    }
}

