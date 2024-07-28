package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DebitCardPage {

    private final String debitCardPath = "/get-money/credit-cards/zayavka/";

    private final SelenideElement getCard = $(byText("Получить карту"));

    @Step("Open the debit card page")
    public DebitCardPage openDebitCardPage() {
        open(baseUrl + debitCardPath);
        return this;
    }
}