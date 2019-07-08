package se.ica.pages;

import org.openqa.selenium.WebDriver;
import se.ica.utilities.LocatorObject;

public class HomePage extends PageBase {

    LocatorObject locHandlaOnlineLink = new LocatorObject("", LocatorObject.CSS, "Home page > 'HANDLA ONLINE' Link");

    public HomePage clickOnHandlaOnlineLink() {

        return this;
    }
}
