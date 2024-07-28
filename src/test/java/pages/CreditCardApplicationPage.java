package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.open;

public class CreditCardApplicationPage {

    private final String creditCardApplicationPath = "/get-money/credit-cards/zayavka/";

    private final SelenideElement fullNameInput = $("[data-test-id='field-FIO-placeholder']"),
            getCardButton = $$x("//span[text()='Получить карту']").first();

    @Step("Open the credit card application page")
    public CreditCardApplicationPage openCreditCardApplicationPage() {
        open(baseUrl + creditCardApplicationPath);
        return this;
    }

    @Step("Click the get card button")
    public CreditCardApplicationPage clickGetCardButton() {
        getCardButton.click();
        return this;
    }

    @Step("Check the full name is visible")
    public void checkFullNameInputIsVisible() {
        fullNameInput.shouldBe(visible);
    }
}