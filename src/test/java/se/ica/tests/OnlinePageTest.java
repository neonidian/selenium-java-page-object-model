package se.ica.tests;

import org.junit.jupiter.api.Test;

public class OnlinePageTest extends TestBase {

    @Test public void testHandlaPageIsLoaded() {
        homePage
                .openURL(readProperties.getSeleniumProperties().getString("applicationBaseURL"))
                .clickOnHandlaOnlineLink();
        handlaPage
                .verifyHandlaPageDisplayed();
    }
}
