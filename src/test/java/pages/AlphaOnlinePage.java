package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AlphaOnlinePage {

    private final SelenideElement title = $(byText("Привет!")),
            loginField = $("[aria-label='Логин']"),
            passwordField = $("[aria-label='Пароль']"),
            authorisationButton = $(byText("Вперёд")),
            errorMessage = $(byText("Некорректные данные"));


    @Step("Check Alpha Online title")
    public AlphaOnlinePage checkAlphaOnlineTitle() {
        title.shouldBe(visible);
        return this;
    }

    @Step("Set login")
    public AlphaOnlinePage setLogin(String login) {
        loginField.setValue(login);
        return this;
    }

    @Step("Set password")
    public AlphaOnlinePage setPassword(String password) {
        passwordField.setValue(password);
        return this;
    }

    @Step("Click the authorization button")
    public AlphaOnlinePage clickAuthorisationButton() {
        authorisationButton.click();
        return this;
    }

    @Step("Check the error message")
    public AlphaOnlinePage checkErrorMessageIsVisible() {
        errorMessage.shouldBe(visible);
        return this;
    }

}