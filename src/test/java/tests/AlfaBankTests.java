package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.TestData;

@Tag("regression")
@DisplayName("Alfabank site UI tests")
public class AlfaBankTests extends BaseTest  {

    TestData testData = new TestData();

    @Test
    @Tag("smoke")
    @DisplayName("Check the opening of the credit card filling form")
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
    @DisplayName("Check redirect to Alfa Online page")
    public void checkRedirectToAlfaOnlineTest() {

        mainPage.openMainPage()
                .clickEnterButton()
                .clickAlfaOnlineButton();

        alfaOnlinePage.checkAlfaOnlineTitle();

    }

    @Test
    @Tag("negative")
    @DisplayName("Check entering incorrect user data in Alfa Online")
    public void checkEnteringIncorrectUserDataTest() {

        mainPage.openMainPage()
                .clickEnterButton()
                .clickAlfaOnlineButton();

        alfaOnlinePage.setLogin(testData.randomLogin)
                .setPassword(testData.randomPassword)
                .clickAuthorisationButton()
                .checkErrorMessageIsVisible();
    }

    @Test
    @DisplayName("Check opening the Android app page")
    public void checkOpenAndroidAppPageTest() {

        mainPage.openMainPage()
                .clickDownloadAppButton();

        mobileAppPage.clickInstallAppButton()
                .checkInstructionsIsVisible();
    }
}