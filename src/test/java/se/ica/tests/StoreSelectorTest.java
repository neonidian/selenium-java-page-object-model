package se.ica.tests;

import org.junit.jupiter.api.Test;

public class StoreSelectorTest extends TestBase {

    @Test public void testSomeLibraryMethod() {
        pageBase.getHomePage()
                .openURL(readProperties.getSeleniumProperties().getString("applicationBaseURL"))
                .clickOnHandlaOnlineLink();
    }
}
