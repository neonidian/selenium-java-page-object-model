package se.ica.pages;

import org.openqa.selenium.WebDriver;
import se.ica.framework.SeleniumActions;
import se.ica.utilities.LocatorObject;

public class StoreSelectorPage extends PageBase {
    private LocatorObject locatorStoreSelectorPopup = new LocatorObject("div.store-selector", LocatorObject.CSS, "Store selector page > Store selector modal");

    public StoreSelectorPage(WebDriver webDriver) {
        seleniumActions = new SeleniumActions((webDriver));
    }

    public void verifyStoreSelectorModalDisplayed() {
        seleniumActions.assertElementIsDisplayed(locatorStoreSelectorPopup);
    }
}
