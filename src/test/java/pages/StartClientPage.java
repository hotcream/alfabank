package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class StartClientPage {

    private final SelenideElement searchInput = $("[placeholder='Я ищу']");

    @Step("Enter text into the search bar")
    public StartClientPage enterTextInSearchInput(String text) {
        searchInput.setValue(text).pressEnter();
        return this;
    }

    @Step("Scroll to search bar")
    public StartClientPage scrollToSearchBar() {
        Selenide.sleep(2000);
        searchInput.scrollTo();
        return this;
    }
}
