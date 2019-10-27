package se.ica.pages;

import org.openqa.selenium.WebDriver;
import se.ica.framework.SeleniumActions;
import se.ica.utilities.LocatorObject;

public class HandlaPage extends PageBase {

    private LocatorObject locatorHandlaPageHeaderLabel = new LocatorObject("//header//div/h3[contains(@class,'store-selector')]", LocatorObject.XPATH, "Handla page > Store selector header label");
    private LocatorObject locatorZipCodeTextBox = new LocatorObject("store-selector-input", LocatorObject.ID, "Handla page > Store selector zip code");

    private static final String HANDLA_ONLINE_PAGE_URL = "https://handla.ica.se";

    public HandlaPage(WebDriver webDriver) {
        seleniumActions = new SeleniumActions((webDriver));
    }

    public HandlaPage openHandlaPageByURL() {
        seleniumActions.openURL(HANDLA_ONLINE_PAGE_URL);
        return this;
    }

    public void verifyHandlaPageDisplayed() {
        seleniumActions.assertTextPresentInElement(locatorHandlaPageHeaderLabel, "Hitta butik att handla från");
    }

    public void enterZipCode(String zipCode) {
        seleniumActions.enterTextInTextBox(locatorZipCodeTextBox, zipCode);
    }
}
