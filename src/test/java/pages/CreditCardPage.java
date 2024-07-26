package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CreditCardPage {

    private final SelenideElement getCard = $(byText("Получить карту")),

            cardsButton = $("a[title='Карты']"),
            yearGraceCard = $("a[title*='Целый год без']"),
            searchButton = $("[data-test-id='Main-Header-Main-Desktop-container-right']").$("svg"),
            searchInput = $("#[placeholder='Введите запрос']");

    @Step("Open main page")
    public CreditCardPage openCreditCardPage() {
        String creditCardPath = "/get-money/credit-cards/zayavka/";
        open(baseUrl + creditCardPath);
        return this;
    }
}