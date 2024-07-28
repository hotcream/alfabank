package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AlfaOnlinePage {

    private final SelenideElement title = $(byText("Привет!")),
            loginField = $("[aria-label='Логин']"),
            passwordField = $("[aria-label='Пароль']"),
            authorisationButton = $(byText("Вперёд")),
            errorMessage = $(byText("Некорректные данные"));


    @Step("Check Alfa Online title")
    public AlfaOnlinePage checkAlfaOnlineTitle() {
        title.shouldBe(visible);
        return this;
    }

    @Step("Set login")
    public AlfaOnlinePage setLogin(String login) {
        loginField.setValue(login);
        return this;
    }

    @Step("Set password")
    public AlfaOnlinePage setPassword(String password) {
        passwordField.setValue(password);
        return this;
    }

    @Step("Click the authorization button")
    public AlfaOnlinePage clickAuthorisationButton() {
        authorisationButton.click();
        return this;
    }

    @Step("Check the error message")
    public AlfaOnlinePage checkErrorMessageIsVisible() {
        errorMessage.shouldBe(visible);
        return this;
    }

}