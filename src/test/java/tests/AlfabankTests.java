package tests;

import org.junit.jupiter.api.Test;
import pages.AlphaOnlinePage;
import pages.CreditCardApplicationPage;
import pages.MainPage;
import pages.MobileAppPage;
import pages.ResultsPage;
import pages.StartClientPage;
import utils.TestData;

public class AlfabankTests extends BaseTest  {

    TestData testData = new TestData();

    @Test
    public void checkCreditCardFormOpeningTest() {

        MainPage mainPage = new MainPage();
        CreditCardApplicationPage creditCardApplicationPage = new CreditCardApplicationPage();

        mainPage.openMainPage()
                .openCardsPopup()
                .clickYearGraceCard();

        creditCardApplicationPage.scrollToFullNameInput()
                .checkFullNameInputIsVisible();
    }

    @Test
    public void checkSearchResultTest() {

        MainPage mainPage = new MainPage();
        StartClientPage startClientPage = new StartClientPage();
        ResultsPage resultsPage = new ResultsPage();

        mainPage.openMainPage()
                .clickStartClientButton();

        startClientPage.scrollToSearchBar()
                .enterTextInSearchInput(testData.searchText);

        resultsPage.checkSearchResult(testData.searchText);
    }

    @Test
    public void checkRedirectToAlphaOnlineTest() {

        MainPage mainPage = new MainPage();
        AlphaOnlinePage alphaOnlinePage = new AlphaOnlinePage();

        mainPage.openMainPage()
                .clickEnterButton()
                .clickAlphaOnlineButton();

        alphaOnlinePage.checkAlphaOnlineTitle();

    }

    @Test
    public void checkEnterIncorrectUserDataTest() {

        MainPage mainPage = new MainPage();
        AlphaOnlinePage alphaOnlinePage = new AlphaOnlinePage();

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

        MainPage mainPage = new MainPage();
        MobileAppPage mobileAppPage = new MobileAppPage();

        mainPage.openMainPage()
                .scrollToDownloadAppButton()
                .clickDownloadAppButton();

        mobileAppPage.clickInstallAppButton()
                .checkInstructionsIsVisible();
    }

}