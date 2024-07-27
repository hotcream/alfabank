package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CreditCardsCommonPage {

    private final String creditCardsCommonPath = "/get-money/credit-cards/";
    private final SelenideElement getCardButton = $(byText("Оформить карту"));

    @Step("Open credit cards common page")
    public CreditCardsCommonPage openCreditCardsCommonPage() {
        open(baseUrl + creditCardsCommonPath);
        return this;
    }

    @Step("Click get credit card button")
    public CreditCardsCommonPage clickGetCreditCardButton() {
        getCardButton.click();
        return this;
    }
}