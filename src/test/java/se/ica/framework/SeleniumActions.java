package se.ica.framework;

import org.openqa.selenium.WebDriver;
import se.ica.utilities.LocatorObject;

import java.util.concurrent.TimeUnit;

public class SeleniumActions {

    private WebDriver webDriver;

    public SeleniumActions(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        this.webDriver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
    }

    public void click(LocatorObject locHandlaOnlineLink) {
        webDriver.findElement(locHandlaOnlineLink.elementValue).click();
    }

    public void openURL(String applicationURL) {
        webDriver.get(applicationURL);
    }
}
