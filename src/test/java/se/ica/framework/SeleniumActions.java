package se.ica.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import se.ica.utilities.LocatorObject;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SeleniumActions {

    private final WebDriver webDriver;

    public SeleniumActions(WebDriver webDriver) {
        try {
            this.webDriver = webDriver;
            this.webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            this.webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            this.webDriver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(10));
        } catch (WebDriverException webDriverException) {
            throw new WebDriverException(webDriverException);
        }
    }

    public void click(LocatorObject locatorObjectToClick) {
        try {
            webDriver.findElement(locatorObjectToClick.elementValue).click();
        } catch (WebDriverException webDriverException) {
            throw new WebDriverException(webDriverException);
        }
    }

    public void openURL(String applicationURL) {
        try {
            webDriver.get(applicationURL);
        } catch (WebDriverException webDriverException) {
            throw new WebDriverException(webDriverException);
        }
    }

    public void enterTextInTextBox(LocatorObject locatorTextBox, String textToEnter) {
        try {
            webDriver.findElement(locatorTextBox.elementValue).sendKeys(textToEnter);
        } catch (WebDriverException webDriverException) {
            throw new WebDriverException(webDriverException);
        }
    }

    public void assertTextPresentInElement(LocatorObject locatorObject, String expectedText) {
        try {
            assertThat(webDriver.findElement(locatorObject.elementValue).getText(), is(expectedText));
        } catch (WebDriverException webDriverException) {
            throw new WebDriverException(webDriverException);
        }
    }

    public void assertElementIsDisplayed(LocatorObject locatorObject) {
        try {
            assertThat(webDriver.findElement(locatorObject.elementValue).isDisplayed(), is(true));
        } catch (WebDriverException webDriverException) {
            throw new WebDriverException(webDriverException);
        }
    }
}
