package se.ica.utilities;

import java.util.ResourceBundle;

public class ReadProperties {

    ResourceBundle resourceBundle;

    public ReadProperties() {
        resourceBundle = ResourceBundle.getBundle("selenium.properties");
    }

    public ResourceBundle getSeleniumProperties () {
        return resourceBundle;
    }
}
