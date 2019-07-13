package se.ica.framework;

import org.openqa.selenium.WebDriver;
import se.ica.utilities.LocatorObject;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

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

    public void assertTextPresentInElement(LocatorObject locatorHandlaPageHeaderLabel, String expectedText) {
        assertThat(webDriver.findElement(locatorHandlaPageHeaderLabel.elementValue).getText(), is(expectedText));
    }
}
