package se.ica.pages;

import org.openqa.selenium.WebDriver;
import se.ica.framework.SeleniumActions;

public class PageBase {

    private HomePage homePage;
    WebDriver webDriver;
    SeleniumActions seleniumActions;

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
        seleniumActions = new SeleniumActions(webDriver);
    }

    public void initializePages() {
        homePage = new HomePage();
    }

    public HomePage getHomePage() {
        return homePage;
    }
}

