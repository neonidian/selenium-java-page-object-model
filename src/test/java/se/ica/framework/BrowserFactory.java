package se.ica.framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    WebDriver webDriver;
    String browser;

    public BrowserFactory(String browser) {
        this.browser = browser;
    }

    public WebDriver initializeBrowser() {
        switch (browser.trim().toUpperCase()) {
            case "FIREFOX": {
                WebDriverManager.firefoxdriver().setup();
                webDriver = new FirefoxDriver(new BrowserOptions().customizeFirefoxOptions());
                break;
            }
            case "CHROME": {
                WebDriverManager.chromedriver().setup();
                webDriver = new ChromeDriver(new BrowserOptions().customizeChromeOptions());
                break;
            }
            default:
                throw new RuntimeException("Browser '" + browser + "' implementation not defined");
        }
        return webDriver;
    }
}
