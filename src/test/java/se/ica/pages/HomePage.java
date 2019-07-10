package se.ica.pages;

import se.ica.utilities.LocatorObject;

public class HomePage extends PageBase {

    LocatorObject locHandlaOnlineLink = new LocatorObject("//h2[text()=\"Handla online\"]", LocatorObject.XPATH, "Home page > 'HANDLA ONLINE' Link");

    public HomePage openURL(String applicationURL) {
        seleniumActions.openURL(applicationURL);
        return this;
    }

    public HomePage clickOnHandlaOnlineLink() {
        seleniumActions.click(locHandlaOnlineLink);
        return this;
    }
}
