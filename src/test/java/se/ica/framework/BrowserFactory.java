package se.ica.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ResourceBundle;

public class BrowserFactory {

    private static final String firefox = "FIREFOX";
    private static final String chrome = "CHROME";

    WebDriver webDriver;
    String browser;

    public BrowserFactory(ResourceBundle seleniumProperties) {
        browser = seleniumProperties.getString("browser");
    }

    public WebDriver initializeBrowser() {
        switch (browser.trim().toUpperCase()) {
            case "FIREFOX": {
                webDriver = new FirefoxDriver(new BrowserOptions().customizefirefoxOptions());
                break;
            }
            case "CHROME": {
                webDriver = new ChromeDriver(new BrowserOptions().customizeChromeOptions());
                break;
            }
            default:
                throw new RuntimeException("Browser '" + browser + "' implementation not defined");
        }
        return webDriver;
    }
}
