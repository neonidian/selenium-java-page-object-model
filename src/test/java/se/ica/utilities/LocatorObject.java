package se.ica.utilities;

public class LocatorObject {

    String locatorValue;
    String locatorType;
    String locatorDescription;

    public static final String ID = "ID";
    public static final String CSS = "CSS";

    public LocatorObject(String locatorValue, String locatorType, String locatorDescription) {
        this.locatorValue = locatorValue;
        this.locatorType = locatorType;
        this.locatorDescription = locatorDescription;
    }
}
