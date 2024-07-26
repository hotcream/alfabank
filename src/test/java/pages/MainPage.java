package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import tests.BaseTest;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage extends BaseTest {

    private final SelenideElement enterButton = $(byText("Войти")),
            cardsButton = $("a[title='Карты']"),
            yearGraceCard = $("a[title*='Целый год без']"),
            searchButton = $("[data-test-id='Main-Header-Main-Desktop-container-right']").$("svg"),
            searchInput = $("#[placeholder='Введите запрос']");

    @Step("Open main page")
    public MainPage openMainPage() {
        open(baseUrl);
        return this;
    }

    @Step("Click cards button")
    public MainPage clickCardsButton() {
        cardsButton.click();
        return this;
    }

    @Step("Click year grace card")
    public MainPage clickYearGraceCard() {
        yearGraceCard.click();
        return this;
    }

    @Step("Click year grace card")
    public MainPage clickSearchButton() {
        searchButton.click();
        return this;
    }

    @Step("Click year grace card")
    public MainPage enterSearchText(String text) {
        searchInput.setValue(text).pressEnter();
        return this;
    }


}