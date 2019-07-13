package se.ica.pages;

import org.openqa.selenium.WebDriver;
import se.ica.framework.SeleniumActions;
import se.ica.utilities.LocatorObject;

public class HandlaPage extends PageBase {

    LocatorObject locatorHandlaPageHeaderLabel = new LocatorObject("//header//div/h2", LocatorObject.XPATH, "Handla page > Header label");

    public HandlaPage(WebDriver webDriver) {
        seleniumActions = new SeleniumActions((webDriver));
    }

    public HandlaPage verifyHandlaPageDisplayed() {
        seleniumActions.assertTextPresentInElement(locatorHandlaPageHeaderLabel, "Hitta butik att handla från");
        return this;
    }
}
