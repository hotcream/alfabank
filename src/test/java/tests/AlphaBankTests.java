package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.TestData;

public class AlphaBankTests extends BaseTest  {

    TestData testData = new TestData();

    @Test
    @DisplayName("Check the search results")
    public void checkCreditCardFormOpeningTest() {

        mainPage.openMainPage()
                .openCardsPopup()
                .clickYearGraceCard();

        creditCardApplicationPage.clickGetCardButton()
                .checkFullNameInputIsVisible();
    }

    @Test
    @DisplayName("Check the search results")
    public void checkSearchResultsTest() {

        mainPage.openMainPage()
                .clickStartClientButton();

        startClientPage.scrollToSearchBar()
                .enterTextInSearchInput(testData.searchText);

        resultsPage.checkSearchResult(testData.searchText);
    }

    @Test
    @DisplayName("Check redirect to Alpha Online page")
    public void checkRedirectToAlphaOnlineTest() {

        mainPage.openMainPage()
                .clickEnterButton()
                .clickAlphaOnlineButton();

        alphaOnlinePage.checkAlphaOnlineTitle();

    }

    @Test
    @DisplayName("Check entering incorrect user data in Alpha Online")
    public void checkEnteringIncorrectUserDataTest() {

        mainPage.openMainPage()
                .clickEnterButton()
                .clickAlphaOnlineButton();

        alphaOnlinePage.setLogin(testData.randomLogin)
                .setPassword(testData.randomPassword)
                .clickAuthorisationButton()
                .checkErrorMessageIsVisible();
    }

    @Test
    @DisplayName("Check opening the Android app page")
    public void checkOpenAndroidAppPageTest() {

        mainPage.openMainPage()
                .scrollToDownloadAppButton()
                .clickDownloadAppButton();

        mobileAppPage.clickInstallAppButton()
                .checkInstructionsIsVisible();
    }

}