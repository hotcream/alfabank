package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

public class MobileAppPage {

    private final SelenideElement instructions = $x("//a[text()='Для всех андроидов']"),
            installAppButton = $$(byText("Установить приложение")).first();

    @Step("Click install app button")
    public MobileAppPage clickInstallAppButton() {
        installAppButton.click();
        return this;
    }

    @Step("Check")
    public MobileAppPage checkInstructionsIsVisible() {
        instructions.shouldBe(visible);
        return this;
    }
}
