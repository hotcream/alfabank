package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CreditCardApplicationPage {

    private final String creditCardApplicationPath = "/get-money/credit-cards/zayavka/";

    private final SelenideElement fullNameInput = $("[data-test-id='field-FIO-placeholder']");

    @Step("Open credit card application page")
    public CreditCardApplicationPage openCreditCardApplicationPage() {
        open(baseUrl + creditCardApplicationPath);
        return this;
    }

    @Step("Click get card button")
    public CreditCardApplicationPage scrollToFullNameInput() {
        fullNameInput.scrollTo();
        return this;
    }

    @Step
    public CreditCardApplicationPage checkFullNameInputIsVisible() {
        fullNameInput.shouldBe(visible);
        return this;
    }

}