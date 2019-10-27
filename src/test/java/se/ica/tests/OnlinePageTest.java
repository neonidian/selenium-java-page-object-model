package se.ica.tests;

import org.junit.jupiter.api.Test;

class OnlinePageTest extends TestBase {

    @Test
    void shouldNavigateToHandlaHomePage() {
        homePage
                .openHomePageByURL()
                .clickOnHandlaOnlineLink();
        handlaPage
                .verifyHandlaPageDisplayed();
    }

    @Test
    void shouldDisplayStorePopupModalWhenSearchingByZipCode() {
        String ZIP_CODE = "11124";
        handlaPage
                .openHandlaPageByURL()
                .enterZipCode(ZIP_CODE);
        storeSelectorPage
                .verifyStoreSelectorModalDisplayed();
    }
}
