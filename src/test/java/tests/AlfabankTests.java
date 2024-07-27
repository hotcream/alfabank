package tests;

import org.junit.jupiter.api.Test;
import utils.TestData;

public class AlfabankTests extends BaseTest  {

    TestData testData = new TestData();

    @Test
    public void checkCreditCardFormOpeningTest() {

        mainPage.openMainPage()
                .openCardsPopup()
                .clickYearGraceCard();

        creditCardApplicationPage.scrollToFullNameInput()
                .checkFullNameInputIsVisible();
    }

    @Test
    public void checkSearchResultTest() {

        mainPage.openMainPage()
                .clickStartClientButton();

        startClientPage.scrollToSearchBar()
                .enterTextInSearchInput(testData.searchText);

        resultsPage.checkSearchResult(testData.searchText);
    }

    @Test
    public void checkRedirectToAlphaOnlineTest() {

        mainPage.openMainPage()
                .clickEnterButton()
                .clickAlphaOnlineButton();

        alphaOnlinePage.checkAlphaOnlineTitle();

    }

    @Test
    public void checkEnterIncorrectUserDataTest() {

        mainPage.openMainPage()
                .clickEnterButton()
                .clickAlphaOnlineButton();

        alphaOnlinePage.setLogin(testData.randomLogin)
                .setPassword(testData.randomPassword)
                .clickAuthorisationButton()
                .checkErrorMessageIsVisible();
    }

    @Test
    public void checkOpenAndroidAppPageTest() {

        mainPage.openMainPage()
                .scrollToDownloadAppButton()
                .clickDownloadAppButton();

        mobileAppPage.clickInstallAppButton()
                .checkInstructionsIsVisible();
    }

}