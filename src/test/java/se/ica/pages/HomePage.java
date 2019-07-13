package se.ica.pages;

import org.openqa.selenium.WebDriver;
import se.ica.framework.SeleniumActions;
import se.ica.utilities.LocatorObject;

public class HomePage extends PageBase {

    LocatorObject locatorHandlaOnlineLink = new LocatorObject("//h2[text()=\"Handla online\"]", LocatorObject.XPATH, "Home page > 'HANDLA ONLINE' Link");

    public HomePage(WebDriver webDriver) {
        seleniumActions = new SeleniumActions((webDriver));
    }

    public HomePage openURL(String applicationURL) {
        seleniumActions.openURL(applicationURL);
        return this;
    }

    public HomePage clickOnHandlaOnlineLink() {
        seleniumActions.click(locatorHandlaOnlineLink);
        return this;
    }
}
