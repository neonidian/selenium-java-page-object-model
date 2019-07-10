package se.ica.tests;

import org.junit.jupiter.api.Test;

public class StoreSelectorTest extends TestBase {

    @Test public void testSomeLibraryMethod() {
        page.homePage
                .openURL(readProperties.getSeleniumProperties().getString("applicationURL"))
                .clickOnHandlaOnlineLink();
    }
}
