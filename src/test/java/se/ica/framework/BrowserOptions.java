package se.ica.framework;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import se.ica.utilities.ReadProperties;

public class BrowserOptions {

    private static final String platform = ReadProperties.getSeleniumProperties().getString("platform");

    FirefoxOptions customizefirefoxOptions() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setAcceptInsecureCerts(true);
        firefoxOptions.setLogLevel(FirefoxDriverLogLevel.FATAL);
        firefoxOptions.setCapability(CapabilityType.PLATFORM_NAME,  platform);
        return firefoxOptions;
    }

    ChromeOptions customizeChromeOptions(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("disable-infobars");
        chromeOptions.setCapability(CapabilityType.PLATFORM_NAME, platform);
        return chromeOptions;
    }
}
