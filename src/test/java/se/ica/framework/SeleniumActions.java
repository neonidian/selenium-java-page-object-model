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

    public void click(LocatorObject locatorObjectToClick) {
        webDriver.findElement(locatorObjectToClick.elementValue).click();
    }

    public void openURL(String applicationURL) {
        webDriver.get(applicationURL);
    }

    public void enterTextInTextBox(LocatorObject locatorTextBox, String textToEnter) {
        webDriver.findElement(locatorTextBox.elementValue).sendKeys(textToEnter);
    }

    public void assertTextPresentInElement(LocatorObject locatorObject, String expectedText) {
        assertThat(webDriver.findElement(locatorObject.elementValue).getText(), is(expectedText));
    }

    public void assertElementIsDisplayed(LocatorObject locatorObject) {
        assertThat(webDriver.findElement(locatorObject.elementValue).isDisplayed(), is(true));
    }
}
