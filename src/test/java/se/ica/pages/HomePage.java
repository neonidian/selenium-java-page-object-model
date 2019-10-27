package se.ica.pages;

import org.openqa.selenium.WebDriver;
import se.ica.framework.SeleniumActions;
import se.ica.utilities.LocatorObject;

public class HomePage extends PageBase {

    private LocatorObject locatorHandlaOnlineLink = new LocatorObject("//h2[text()=\"Handla online\"]", LocatorObject.XPATH, "Home page > 'HANDLA ONLINE' Link");

    private static final String HOME_PAGE_URL = "https://www.ica.se";

    public HomePage(WebDriver webDriver) {
        seleniumActions = new SeleniumActions((webDriver));
    }

    public HomePage openHomePageByURL() {
        seleniumActions.openURL(HOME_PAGE_URL);
        return this;
    }

    public void clickOnHandlaOnlineLink() {
        seleniumActions.click(locatorHandlaOnlineLink);
    }
}
