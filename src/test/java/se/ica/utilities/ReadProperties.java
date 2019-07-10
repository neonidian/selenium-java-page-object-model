package se.ica.utilities;

import java.util.ResourceBundle;

public class ReadProperties {

    public static ResourceBundle resourceBundle;

    public ReadProperties() {
        resourceBundle = ResourceBundle.getBundle("selenium");
    }

    public static ResourceBundle getSeleniumProperties () {
        return resourceBundle;
    }
}
