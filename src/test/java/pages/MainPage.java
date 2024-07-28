package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private final SelenideElement enterButton = $x("//span[text()='Войти']"),
            cardsPopupButton = $("a[title='Карты']"),
            yearGraceCard = $("a[title*='Целый год без']"),
            popup = $("[data-test-id='Main-Header-Main-Desktop-popover-container']"),
            startClientButton = $("[data-test-id='Main-Header-Main-Desktop-container-right']")
                    .$(byText("Стать клиентом")),
            alphaOnlineButton = $x("//p[contains(text(), 'Войти в')]"),
            downloadAppButton = $x("//span[text()='Скачайте приложение']");

    @Step("Open the main page")
    public MainPage openMainPage() {
        open(baseUrl);
        return this;
    }

    @Step("Open the cards pop-up")
    public MainPage openCardsPopup() {
        cardsPopupButton.hover();
        return this;
    }

    @Step("Click the year grace card")
    public void clickYearGraceCard() {
        yearGraceCard.click();
    }

    @Step("Click the start client button")
    public void clickStartClientButton() {
        startClientButton.click();
    }

    @Step("Click the enter button")
    public MainPage clickEnterButton() {
        Selenide.sleep(2000);
        enterButton.click();
        return this;
    }

    @Step("Click the Alpha Online button")
    public void clickAlphaOnlineButton() {
        Selenide.sleep(2000);
        alphaOnlineButton.click();
    }

    @Step("Click the download app button")
    public void clickDownloadAppButton() {
        downloadAppButton.click();
    }

}