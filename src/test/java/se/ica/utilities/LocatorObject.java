package se.ica.utilities;

import org.openqa.selenium.By;

public class LocatorObject {

    public String locatorValue;
    public String locatorType;
    public String locatorDescription;
    public By elementValue;

    public static final String ID = "ID";
    public static final String CSS = "CSS";
    public static final String XPATH = "XPATH";

    public LocatorObject(String locatorValue, String locatorType, String locatorDescription) {
        this.locatorValue = locatorValue;
        this.locatorType = locatorType;
        this.locatorDescription = locatorDescription;
        this.elementValue = getLocatorObject(locatorValue, locatorType);
    }

    public By getLocatorObject(String locator, String locatorType) {
        By elementValue;
        switch (locatorType.toUpperCase()) {
            case ID:
                elementValue = By.id(locator);
                break;
            case CSS:
                elementValue = By.cssSelector(locator);
                break;
            case XPATH:
                elementValue = By.xpath(locator);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + locatorType.toUpperCase());
        }
        return elementValue;
    }
}
